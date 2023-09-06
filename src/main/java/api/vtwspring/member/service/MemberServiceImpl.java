package api.vtwspring.member.service;

import api.vtwspring.member.mapper.MemberMapper;
import api.vtwspring.member.model.entity.Member;
import api.vtwspring.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberMapper memberMapper;
    private final MemberRepository memberRepository;

    @Override
    public void saveMember(Member member) {

        memberRepository.save(member);

    }

}
