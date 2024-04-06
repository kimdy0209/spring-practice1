package springproject.boardpractice.service;

import org.springframework.stereotype.Service;
import springproject.boardpractice.domain.Member;
import springproject.boardpractice.repository.MemberRepository;

@Service
public class MemberService {

    MemberRepository memrepo;

    public MemberService(MemberRepository memrepo) {
        this.memrepo = memrepo;
    }

    public void login(Member member){

    }
}
