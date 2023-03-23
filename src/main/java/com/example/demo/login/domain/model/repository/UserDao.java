package com.example.demo.login.domain.model.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.model.User;

@Repository
public interface UserDao {
	//Userテーブルの件数を取得
	public int cout()throws DataAccessException;
	
	//Userテーブルにデータを１件insert
	public int insertOne(User user)throws DataAccessException;
	
	//Userテーブルのデータを１権取得
	public User selectOne(String userId)throws DataAccessException;
	
	//Userテーブルの全データを取得
	public List<User> selectMany() throws DataAccessException;
	
	//Userテーブルを１件更新
	public int updateOne(User user)throws DataAccessException;
	
	//Userテーブルを１検索所
	public int deleteOne(String userId)throws DataAccessException;
	
	//SQL取得結果をサーバーにCSVで保存する
	public void userCsvOut()throws DataAccessException;
}
