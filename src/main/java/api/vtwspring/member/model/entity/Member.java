package api.vtwspring.member.model.entity;

import api.vtwspring.common.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "MEMBER")
public class Member extends BaseEntity {


    @Id
    @GeneratedValue
    @Column(name = "member_seq")
    private Long memberSeq;

    private String pwd;
    private String name;
    private int loginCount;
    private String socialDivision;
    @Column(name = "del_yn", columnDefinition = "VARCHAR(1) default 'N'")
    private String delYn = "N";
    private String dormantAccount;
    private String profile;
    @Column(unique = true)
    private String memberId;

    public void updateDelYn(String delYn) {
        this.delYn = delYn;
    }


}
