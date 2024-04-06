package springproject.boardpractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springproject.boardpractice.domain.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

}
