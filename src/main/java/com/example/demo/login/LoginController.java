package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class LoginController {
	//ログイン画面のGET用コントローラー
	@GetMapping("/login")
	public String gerLogin(Model model) {
		//login.htmlに画面遷移
		return "login/login";
	}
	
	@PostMapping("/login")
	public String postLogin(Model model) {
		return "login/login";
	}
}
