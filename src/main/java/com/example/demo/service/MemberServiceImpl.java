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

	@Override
	public Member get(Long id) {
		Member member = memberRepository.findById(id).get();
		
		return member;
	}

	@Override
	public void update(Member member) {
		// TODO 문제1
		
	}

	@Override
	public void delete(Long id) {
		// TODO 문제2
		
	}

}
