package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String address;
	private int age;
	
	@Builder
	public Member(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
