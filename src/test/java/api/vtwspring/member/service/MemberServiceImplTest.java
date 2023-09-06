package api.vtwspring.member.service;

import api.vtwspring.member.model.entity.Member;
import api.vtwspring.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberServiceImplTest {
    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Transactional
    void contextLoads() {

        Member member = Member.builder()
                .pwd("123")
                .name("홍길동")
                .loginCount(0)
                .socialDivision("naver")
                .dormantAccount("??")
                .profile("asdasd@#!@3")
                .memberId("test@naver.com")
                .build();

        memberService.saveMember(member);

        Member findMember = memberRepository.findById(member.getMemberSeq()).get();

        System.out.println(findMember);
    }
}