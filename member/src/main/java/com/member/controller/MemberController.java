package com.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.member.domain.Member;
import com.member.repository.MemberRepository;

@RestController
public class MemberController {

	private MemberRepository memberRepository;

	@Autowired
	public MemberController(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@RequestMapping("/")
	public String sample() {
		return "Testing................";
	}
	
	@RequestMapping("/members")
	public Iterable<Member> getAll() {
		return memberRepository.findAll();
	}
	
	@PostMapping(path = "/saveMember")
	public Member save(@RequestBody Member member) {
		memberRepository.save(member);
		return member;
	}

	@PutMapping(path = "/updateMember")
	public Member update(@RequestBody Member member) {
		memberRepository.save(member);
		return member;
	}
	
	@DeleteMapping(path = "/deleteMember")
	public String delete(@RequestBody Member member) {
		memberRepository.delete(member);
		return "Yes ";
	}
}
