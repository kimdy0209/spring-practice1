package springproject.boardpractice.service;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.boardpractice.domain.Board;
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





}
