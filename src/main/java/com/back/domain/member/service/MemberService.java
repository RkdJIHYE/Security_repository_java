package com.back.domain.member.service;

import com.back.domain.member.entity.Member;
import com.back.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member join(String name, String password, String nickname){
        Member member = new Member(name,password,nickname);
        return memberRepository.save(member);
    }

    public long count(){
        return memberRepository.count();
    }

    public Optional<Member> findByUsername(String username){
//        return memberRepository.findAll().stream()
//                .filter(m-> m.getUsername().equals(username))
//                .findFirst();
        return memberRepository.findByUsername(username);
        //DB에서 처리하는 방법이다.
    }
}
