package springproject.boardpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import springproject.boardpractice.domain.Member;
import springproject.boardpractice.repository.MemberRepository;
import springproject.boardpractice.service.BoardService;
import springproject.boardpractice.service.MemberService;

@Controller
public class MemberController {

    private final MemberRepository memrepo;

    private MemberService ms;


    public MemberController(MemberRepository memrepo, MemberService ms) {
        this.memrepo = memrepo;
        this.ms = ms;
    }

    @GetMapping("/login")
    public String showLoagin(){return "login";}

    @PostMapping("/login")
    public String loginOrBack(Member member){
        ms.login(member);
        //존재하는 회원이 없으면 회원가입하라는 안내멧시지를 넣고
        // 로그인이 되면 list화면으로 이동
        return "list";
    }

    @GetMapping("/register")
    public String showRegister(){return "register";}

    @PostMapping("/register")
    public String registercomplete(Member Memeber){
        memrepo.save(Memeber);
        return "redirect:/";
    }



}
