package springproject.boardpractice.service;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import springproject.boardpractice.domain.Board;
import springproject.boardpractice.domain.Member;
import springproject.boardpractice.repository.BoardRepository;

import java.util.Date;

@Service
public class BoardService {
    private final BoardRepository bro;
    @Autowired
    public BoardService(BoardRepository bro) {
        this.bro = bro;
    }

    public boolean editSave(Board board){
        Board board1 = bro.findById(board.getId()).get();
        if(board.getPassword().equals(board1.getPassword())){
            board.setCreated(new Date());
            bro.save(board);
            return true;
        }else return false;
    }

    public Page<Board> getList(int page){
        Sort sort = Sort.by(Sort.Direction.DESC, "created");
        Pageable pageable = PageRequest.of(page,5, sort);
        return this.bro.findAll(pageable);
    }

    public void saveAll(Board board){
        board.setCreated(new Date());
        bro.save(board);
    }

    public Board findId(Long postId){
        Board board = bro.findById(postId).get();
        return board;
    }

    public void deleteId(Long postId){
        bro.deleteById(postId);
    }





}
