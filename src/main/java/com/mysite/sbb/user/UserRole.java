package com.mysite.sbb.user;

import lombok.Getter;

@Getter
public enum UserRole {
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");  //ADMIN, USER라는 상수에 "ROLE_ADMIN", "ROLE_USER"라는 값을 부여함
	
	UserRole(String value) {
		this.value = value;
	}
	private String value;
}
