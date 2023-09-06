package api.vtwspring.member.controller;


import api.vtwspring.member.model.entity.Member;
import api.vtwspring.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final HttpSession session;
    private final MemberService memberService;

    @PostMapping("/signUp")
    private void signUp(Member member){

        memberService.saveMember(member);

    }
}
