package com.iss.ownwork.firstdemo;

public class User {
	private String Userid;
	private String Username;
	private String nickname;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public User(String username, String nickname) {
		super();
		Username = username;
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", Username=" + Username + ", nickname=" + nickname + "]";
	}
	public User(String userid, String username, String nickname) {
		super();
		Userid = userid;
		Username = username;
		this.nickname = nickname;
	}
	
	

}
