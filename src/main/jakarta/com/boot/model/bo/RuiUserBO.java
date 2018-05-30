package com.boot.model.bo;

import com.boot.base.annotation.RuiDesc;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * @author laotree
 * @Date 2018/5/30 下午4:33:28
 */
public class RuiUserBO implements Serializable{

      private static final long serialVersionUID = -1L;

	 /**
	 * 
	 * 
	 */
	private Integer id;

	 /**
	 * 用户名,
	 * 
	 */
	@RuiDesc(description="用户名,")
	private String userName;

	 /**
	 * 昵称,
	 * 
	 */
	@RuiDesc(description="昵称,")
	private String nickname;

	 /**
	 * 密码,
	 * 
	 */
	@RuiDesc(description="密码,")
	private String userPsw;

	 /**
	 * 用户状态,
	 * 
	 */
	@RuiDesc(description="用户状态,")
	private Integer userStatus;

	 /**
	 * 是否删除,
	 * 
	 */
	@RuiDesc(description="是否删除,")
	private Integer isDelete;

	 /**
	 * 创建时间,
	 * 
	 */
	@RuiDesc(description="创建时间,")
	private Date createTime;

	 /**
	 * 更新时间,
	 * 
	 */
	@RuiDesc(description="更新时间,")
	private Date updateTime;

	 /**
	 * 创建者,
	 * 
	 */
	@RuiDesc(description="创建者,")
	private String createBy;

	 /**
	 * 
	 * 
	 */
	@RuiDesc(description="")
	private String updateBy;


	 /**
	 * 获取: 
	 * 
	 */
	public Integer getId() {
	return id;
	}
	 /**
	 * 设置: 
	 * 
	 */
	public void setId(Integer id) {
	this.id = id;
	}
	 /**
	 * 获取: 用户名,
	 * 
	 */
	public String getUserName() {
	return userName;
	}
	 /**
	 * 设置: 用户名,
	 * 
	 */
	public void setUserName(String userName) {
	this.userName = userName;
	}
	 /**
	 * 获取: 昵称,
	 * 
	 */
	public String getNickname() {
	return nickname;
	}
	 /**
	 * 设置: 昵称,
	 * 
	 */
	public void setNickname(String nickname) {
	this.nickname = nickname;
	}
	 /**
	 * 获取: 密码,
	 * 
	 */
	public String getUserPsw() {
	return userPsw;
	}
	 /**
	 * 设置: 密码,
	 * 
	 */
	public void setUserPsw(String userPsw) {
	this.userPsw = userPsw;
	}
	 /**
	 * 获取: 用户状态,
	 * 
	 */
	public Integer getUserStatus() {
	return userStatus;
	}
	 /**
	 * 设置: 用户状态,
	 * 
	 */
	public void setUserStatus(Integer userStatus) {
	this.userStatus = userStatus;
	}
	 /**
	 * 获取: 是否删除,
	 * 
	 */
	public Integer getIsDelete() {
	return isDelete;
	}
	 /**
	 * 设置: 是否删除,
	 * 
	 */
	public void setIsDelete(Integer isDelete) {
	this.isDelete = isDelete;
	}
	 /**
	 * 获取: 创建时间,
	 * 
	 */
	public Date getCreateTime() {
	return createTime;
	}
	 /**
	 * 设置: 创建时间,
	 * 
	 */
	public void setCreateTime(Date createTime) {
	this.createTime = createTime;
	}
	 /**
	 * 获取: 更新时间,
	 * 
	 */
	public Date getUpdateTime() {
	return updateTime;
	}
	 /**
	 * 设置: 更新时间,
	 * 
	 */
	public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
	}
	 /**
	 * 获取: 创建者,
	 * 
	 */
	public String getCreateBy() {
	return createBy;
	}
	 /**
	 * 设置: 创建者,
	 * 
	 */
	public void setCreateBy(String createBy) {
	this.createBy = createBy;
	}
	 /**
	 * 获取: 
	 * 
	 */
	public String getUpdateBy() {
	return updateBy;
	}
	 /**
	 * 设置: 
	 * 
	 */
	public void setUpdateBy(String updateBy) {
	this.updateBy = updateBy;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}