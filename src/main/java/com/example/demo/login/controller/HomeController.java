package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.domain.model.SignupForm;
import com.example.demo.login.domain.model.User;
import com.example.demo.login.domain.model.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	private Map<String,String>radioMarriage;
	
	private Map<String,String>initRadioMarrige(){
		Map<String,String>radio = new LinkedHashMap<>();
		radio.put("既婚","true");
		radio.put("未婚","false");
		
		return radio;
	}
	
	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("contents","login/home :: home_contents");
		
		return "login/homeLayout";
	}
	
	@PostMapping("/logout")
	public String postLogout() {
		return "redirect:/login";
	}
	
	//ユーザー一覧画面のGET用メソッド
	@GetMapping("/userList")
	public String getUserList(Model model) {
		//コンテンツ部分にユーザー一覧を表示するための文字列を登録
		model.addAttribute("contents","login/userList::userList_contents");
		
		//ユーザー一覧の生成
		List<User> userList = userService.selectMany();
		//ユーザーリストを登録
		model.addAttribute("userList",userList);
		
		//データ件数を取得
		int count = userService.count();
		model.addAttribute("userListCount",count);
		
		return "login/homeLayout";
	}
	
	//ユーザー一覧のCSV出力賞メソッド
	@GetMapping("/userList/csv")
	public String getUserListCsv(Model model) {
		return getUserList(model);
	}
	
	@GetMapping("/userDetail/{id:.+}")
	public String getUserDetail(@ModelAttribute SignupForm form,Model model, @PathVariable("id")String userId) {
		model.addAttribute("contents","login/userDetail::userDetail_contents");
		
		radioMarriage = initRadioMarrige();
		
		model.addAttribute("radioMarriage",radioMarriage);
		
		if(userId != null && userId.length()>0) {
			User user = userService.selectOne(userId);
			
			form.setUserId(user.getUserId());			
			form.setUserName(user.getUserName());
			form.setBirthday(user.getBirthday());
			form.setAge(user.getAge());
			form.setMarriage(user.isMarriage());
		}
		return "login/homeLayout";
	}
	
}
