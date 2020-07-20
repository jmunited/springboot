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
@Table(name = "hello")
public class Hello {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String msg;
	
	@Builder
	public Hello(String name, String msg) {
		this.name = name;
		this.msg = msg;
	}
}
