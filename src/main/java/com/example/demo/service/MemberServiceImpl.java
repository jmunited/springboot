package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;
	
	@Override
	public Long create(Member member) {
		memberRepository.save(member);
		
		return member.getId();
	}

}
