package com.example.demo.login.domain.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.login.domain.model.User;
import com.example.demo.login.domain.model.repository.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	//insert用メソッド
	public boolean insert(User user) {
		//insert実行
		int rowNumber = dao.insertOne(user);
		
		//判定用変数
		boolean result = false;
		if(rowNumber>0) {
			return true;
		}
		return result;
	}
	
	public int count() {
		return dao.cout();
	}
	
	public List<User> selectMany(){
		return dao.selectMany();
	}
}
