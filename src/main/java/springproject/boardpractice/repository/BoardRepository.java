package springproject.boardpractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springproject.boardpractice.domain.Board;
@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {
}
