package api.vtwspring.member.model.entity;

import api.vtwspring.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "MEMBER")
@Builder
@AllArgsConstructor
public class Member extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public String toString() {
        return "Member{" +
                "memberSeq=" + memberSeq +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", loginCount=" + loginCount +
                ", socialDivision='" + socialDivision + '\'' +
                ", delYn='" + delYn + '\'' +
                ", dormantAccount='" + dormantAccount + '\'' +
                ", profile='" + profile + '\'' +
                ", memberId='" + memberId + '\'' +
                '}';
    }
}
