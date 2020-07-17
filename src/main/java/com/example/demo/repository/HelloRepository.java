package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Hello;

public interface HelloRepository extends JpaRepository<Hello, Long>{

}
