package com.osdew.sample_kmm.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osdew.sample_kmm.model.MemberVO;


@RestController
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "Main";
	}
	
	@RequestMapping("getMemberInfo")
	public MemberVO getMemberInfo() {
		MemberVO memberVo = new MemberVO();
		memberVo.name = "회원명";
		memberVo.age = 30;
		memberVo.phoneNum = "010-0000-0000";
	
		return memberVo;
	}
	
}
