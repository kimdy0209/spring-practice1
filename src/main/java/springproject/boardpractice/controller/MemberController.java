package springproject.boardpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.*;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springproject.boardpractice.domain.Member;
import springproject.boardpractice.service.MemberService;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

   /* @GetMapping("/members")
    public String memberList(Pageable pageable, Model model){
        Page<Member> page = memberService.findMembers(pageable);
        model.addAttribute("members",page.getContent());
        return "/members/memberList";
    }

    @GetMapping("/members")
    public String memberList(@Qualifier("member") Pageable pageable,
                             @Qualifier("order") Pageable orderPageable, Model model){
        Page<Member> page = memberService.findMembers(pageable);
        model.addAttribute("members",page.getContent());
        return "/members/memberList";
    }
    @GetMapping("/members")
    public String memberList(@PageableDefault(size = 10, sort = "name", direction = Direction.DESC) Pageable pageable,
                             Model model){
        Page<Member> page = memberService.findMembers(pageable);
        model.addAttribute("members",page.getContent());
        return "/members/memberList";
    }*/
}
