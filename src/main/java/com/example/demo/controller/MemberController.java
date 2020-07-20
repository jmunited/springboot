package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/member")
@RestController
public class MemberController {
	private final MemberService memberService;
	
	@PostMapping("/create")
	public Long create(@RequestBody Member member) {
		
		return memberService.create(member);
	}
}
