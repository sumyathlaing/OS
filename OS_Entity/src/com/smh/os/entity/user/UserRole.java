package com.smh.os.entity.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {

	private static final long serialVersionUID = 2491936255757792147L;

	@Id
	@GeneratedValue
	@Column(name = "UserRole_Id")
	private Long userRole_Id;

	@Column(name = "Name")
	private String roleName;

	@Column(name = "UpdatedTime")
	private Date updatedTime;

	public Long getUserRole_Id() {
		return userRole_Id;
	}

	public void setUserRole_Id(Long userRole_Id) {
		this.userRole_Id = userRole_Id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
}
