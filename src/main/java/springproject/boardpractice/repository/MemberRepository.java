package springproject.boardpractice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springproject.boardpractice.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    //count 있는거
    Page<Member> findByName(String name, Pageable pageable);
/*
    //count 없는거
    List<Member> findByName(String name, Pageable pageable);

    List<Member> findByName(String name, Sort sort);
*/

}
