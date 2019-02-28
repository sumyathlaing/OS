package com.smh.os.dto.user;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.smh.os.dto.common.CommonConstants;
import com.smh.os.dto.common.CommonUtil;
import com.smh.os.entity.user.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = -4244882350291915525L;

	private Long userId;
	private String username;
	private String phonenumber;
	private String email;
	private String updatedTime;

	public UserDTO() {
		super();
	}

	public UserDTO(User entity) {
		super();
		userId = entity.getUserId();
		username = entity.getUsername();
		phonenumber = entity.getPhoneNumber();
		email = entity.getEmail();
		updatedTime = StringUtils.isNotBlank(entity.getUpdatedTime() + "")
				? CommonUtil.dateToString(entity.getUpdatedTime(), CommonConstants.STANDARD_12_HOUR_DATE_MINUTE_FORMAT)
				: "";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
}
