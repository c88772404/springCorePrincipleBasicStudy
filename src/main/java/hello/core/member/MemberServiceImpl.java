package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemoryMemberRepository memberRepository) {
         this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        this.memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return this.memberRepository.findById(memberId);
    }
}
