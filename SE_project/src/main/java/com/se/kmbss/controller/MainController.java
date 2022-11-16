package com.se.kmbss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.se.kmbss.mapper.MainMapper;
import com.se.kmbss.mapper.Notice_boardMapper;
import com.se.kmbss.model.UserDTO;
import com.se.kmbss.service.MainService;
import com.se.kmbss.service.UserService;

/**
 * 기본적인 html 페이지를 연결해 주는 곳이다.
 * UserController 추가예정
 * 추후 Mapper 통해서 쿼리문 사용 DB와 연결
 */

@Controller
public class MainController {

	@Autowired
	MainService service;

	@Autowired
	MainMapper mapper;

    @Autowired
	UserService userService;

	@Autowired
	Notice_boardMapper nb;

	@GetMapping
	public String index(Model model) {
		return "index";
	}

    @GetMapping("sign_up")
	public String sign_up() {
		return "sign_up";
	}

    @GetMapping("sign_in")
	public String sign_in() {
		return "sign_in";
	}

    @GetMapping("notice_board")
	public String notice_board() {
		return "notice_board";
	}

    @GetMapping("notice_detailpage")
	public String notice_detailpage() {
		return "notice_detailpage";
	}

	@PostMapping("sign_up")
	public String sign_up(UserDTO user) {
		System.out.println(user);
		userService.join(user);
		return "redirect:/sign_in";
	}

    @ResponseBody
	@GetMapping("idOverlapCheck")
	public String idOverlapCheck(@RequestParam("id") String id){
		UserDTO user = new UserDTO();
		user.setId(id);
		if(userService.isUniqueId(user)){
			return "SUCCESS";
		}
		return "FAIL";
	}

	@ResponseBody
	@GetMapping("nickOverlapCheck")
	public String nickOverlapCheck(@RequestParam("nick") String nick){
		UserDTO user = new UserDTO();
		user.setNick(nick);
		if(userService.isOverlapNick(user)){
			return "SUCCESS";
		}
		return "FAIL";
	}

	@ResponseBody
	@GetMapping("emailOverlapCheck")
	public String emailOverlapCheck(@RequestParam("email") String email){
		UserDTO user = new UserDTO();
		user.setEmail(email);
		if(userService.isOverlapEmail(user)){
			return "SUCCESS";
		}
		return "FAIL";
	}
}