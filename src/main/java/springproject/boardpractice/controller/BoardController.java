package springproject.boardpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springproject.boardpractice.domain.Board;
import springproject.boardpractice.repository.BoardRepository;
import springproject.boardpractice.service.BoardService;

import java.util.*;

@Controller
public class BoardController {
    @Autowired
    private BoardService bs;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value="page", defaultValue = "0") int page) {
        Page<Board> paging = this.bs.getList(page);
        model.addAttribute("paging",paging);
        return "list";
        /*List<Board> boards = new ArrayList<>();
        bro.findAll().forEach(a -> boards.add(a));
        model.addAttribute("board", boards);
        return "list";*/
    }
    @GetMapping("/write")
    public String showWriteForm(){
        return "write";
    }

    @PostMapping("/write")
    public String createBoard(Board bf){
        bs.saveAll(bf);
        return "redirect:/list";
    }

    @GetMapping("/edit/{postId}")
    public String editBoard(@PathVariable Long postId, Model model){
        //

        Board board = bs.findId(postId);
        model.addAttribute("board",board);
        return "editView";
    }
    @PostMapping("/editView")
    public String saveEditedBoard(@ModelAttribute Board board) {
        // 기존 게시물을 가져와서 수정된 내용으로 갱신
        //일단 null값으로 반환하면 다시 페이지 로드하고
        // 성공하면 list로
        // ->  추후 alert로 알림
        boolean confirm = false;

        if(board != null){
            confirm = bs.editSave(board);
        }
        if(confirm == true){
            return "redirect:/list";
        }else return "redirect:/";
        // 추후 안내 메세지 넣을 예정

//        Board board = bro.findById(id).orElse(null);
//        if (board != null) {
//            board.setTitle(title);
//            board.setContent(content);
//            board.setCreated(new Date());
//            // 수정된 게시물을 데이터베이스에 저장
//            bro.save(board);
//        }
         // 목록 페이지로 리다이렉션
    }

    @GetMapping("/delete/{postId}")
    public String deleteBoard(@PathVariable Long postId){
        bs.deleteId(postId);
        return "redirect:/list";}


    @GetMapping("/detail/{postId}")
    public String detailBoard(@PathVariable Long postId, Model model){
        Board board = bs.findId(postId);
        model.addAttribute("board",board);
        return "detail";
    }




}
