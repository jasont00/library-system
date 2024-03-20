package com.group.librarysystemgui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jayznn
 */
public class User implements TextBookObserver{

	private String type = "";
	private String email = "";
	private String password = "";

	private List<Notification> notificationList = new ArrayList<>();

	public void setType(String s) {
		this.type = s;
	}

	public void setEmail(String s) {
		this.email = s;

	}

	public void setPassword(String s) {
		this.password = s;
	}

	public String getEmail(){
		return this.email;
	}

	public String getType(){
		return this.type;
	}

	@Override
	public void update(TextBookSubject textBookSubject) {
		if(!this.type.equals("faculty")){
			// do nothing.
			return;
		}
		String content = textBookSubject.textbook.name +" is available now for Edition:" + textBookSubject.textbook.edition;
		this.notificationList.add(new Notification(this,"NewEdition",content));
	}

	public String getPassword() {
		return password;
	}

	public List<Notification> getNotificationList() {
		return notificationList;
	}

	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}
}
