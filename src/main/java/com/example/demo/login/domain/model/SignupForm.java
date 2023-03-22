package com.example.demo.login.domain.model;


import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class SignupForm {
	//入力必須、メールアドレス形式
	@NotBlank(groups=ValidGroup1.class)
	@Email(groups=ValidGroup2.class)
	private String userId;
	
	//入力必須、長さ4から100桁まで、半角英数字のみ
	@NotBlank(groups=ValidGroup1.class)
	@Length(min =4,max=100,groups=ValidGroup2.class)
	@Pattern(regexp="^[a-zA-Z0-9]+$",groups=ValidGroup3.class)
	private String password;
	
	//必須入力
	@NotBlank(groups=ValidGroup1.class)
	private String userName;
	
	//必須入力
	@NotNull(groups=ValidGroup1.class)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;
	
	//値が20から100まで
	@Min(value= 20,groups=ValidGroup2.class)
	@Max(value = 100,groups=ValidGroup2.class)
	private int age;
	
	//falseかどうかチェック
	@AssertFalse
	private boolean marriage;
}
