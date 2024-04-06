package springproject.boardpractice.dto;

import lombok.Data;
import springproject.boardpractice.domain.Member;


@Data
public class MemberDTO {

    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;

    public MemberDTO(Long id, String name, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public static MemberDTO from(Member member) {
        return new MemberDTO(
                member.getId(),
                member.getName(),
                member.getEmail(),
                member.getAddress(),
                member.getPhone()
        );
    }

}

