package com.smh.os.entity.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user_role_mapping")
public class UserRoleMapping implements Serializable {
	private static final long serialVersionUID = -2073336396146289547L;

	@Id
	@GeneratedValue
	@Column(name="User_Role_Mapping_Id")
	private Long userRoleMappingId;
	
	@JoinColumn(name="User_Id")
	private User user;
	
	@JoinColumn(name="User_Role_Id")
	private UserRole userRole;
	
	@Column(name="UpdatedTime")
	private Date updatedTime;

	public Long getUserRoleMappingId() {
		return userRoleMappingId;
	}

	public void setUserRoleMappingId(Long userRoleMappingId) {
		this.userRoleMappingId = userRoleMappingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
}
