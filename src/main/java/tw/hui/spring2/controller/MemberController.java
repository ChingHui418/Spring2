package tw.hui.spring2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tw.hui.spring2.dto.User;
import tw.hui.spring2.entity.Member;
import tw.hui.spring2.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberController {
	
	@Autowired
	private MemberService service;
	/*
	 * request: /exist?email=xxx
	 * response: true/false
	 */
	@GetMapping("/exist")
	public ResponseEntity<Boolean> checkEmail(@RequestParam String email) {
		boolean isExist = service.checkEmail(email);
		return ResponseEntity.ok(isExist);
	}
	
	/*
	 * request: Member => {} 
	 * response:{"success": true/false}
	 */
	@PostMapping("/register")
	public ResponseEntity<Map<String,Boolean>> register(@RequestBody Member member) {
//		System.out.println(member.getEmail());
//		System.out.println(member.getPasswd());
//		System.out.println(member.getName());
//		
		boolean isSuccess = service.register(member);
		
		Map<String,Boolean> map = Map.of("success", isSuccess);
		return ResponseEntity.ok(map);
	}
}
