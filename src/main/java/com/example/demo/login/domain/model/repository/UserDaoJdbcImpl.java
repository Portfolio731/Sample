package com.example.demo.login.domain.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.model.User;

@Repository
public class UserDaoJdbcImpl implements UserDao{
	@Autowired
	JdbcTemplate jdbc;

	//Userテーブルの件数を取得
	@Override
	public int cout() throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	//Userテーブルにデータを１件追加
	@Override
	public int insertOne(User user) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	//Userテーブルのデータを１件取得
	@Override
	public User selectOne(String userId) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//Userテーブルの全データを取得
	@Override
	public List<User> selectMany() throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//Userテーブルを１件更新
	@Override
	public int updateOne(User user) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	//Userテーブルを１件削除
	@Override
	public int deleteOne(String userId) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	//Userテーブルの全データをCSVに出力する
	@Override
	public void userCsvOut() throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	//Userテーブルの件数を取得
}