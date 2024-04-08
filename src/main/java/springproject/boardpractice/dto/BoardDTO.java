package springproject.boardpractice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.util.Date;

public class BoardDTO {

    private String name;
    private String title;
    private String content;
    private Date created;

}
