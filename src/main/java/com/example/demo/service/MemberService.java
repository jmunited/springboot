package com.example.demo.service;

import com.example.demo.domain.Member;

public interface MemberService {
	//멤버 생성
	Long create(Member member);
	//멤버 조회
	Member get(Long id);
	//멤버 수정
	void update(Member member);
	//멤버 삭제
	void delete(Long id);
}
