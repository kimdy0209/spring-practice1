package springproject.boardpractice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import springproject.boardpractice.domain.Member;
import springproject.boardpractice.repository.MemberRepository;

import java.util.List;

@Service
public class MemberService {

    MemberRepository memrepo;

    public MemberService(MemberRepository memrepo) {
        this.memrepo = memrepo;
    }

    public void login(Member member){
    }

    /*public void findNameAll(){
        PageRequest pageRequest =
                new PageRequest(0,10, new Sort(Sort.Direction.DESC, "name"));
        Page<Member> result = memrepo.findByName("김",pageRequest);

        List<Member> members = result.getContent(); //조회된 데이터
        int totalPages = result.getTotalPages();    //전체 페이지 수
        boolean hasNextPage = result.hasNextPage(); //다음 페이지 존재여부
    }*/
}
