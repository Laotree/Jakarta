package com.boot.model.po;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author laotree
 * @Date 2018/5/30 下午4:33:28
 */
@TableName("rui_user")
public class RuiUserPO extends Model<RuiUserPO> {

    private static final long serialVersionUID = -1L;

	 /**
	 *
	 *
	 */
	@TableId(value = "id",type = IdType.AUTO)
	private Integer id;

	 /**
	 * 用户名,
	 *
	 */
	@TableField(value="user_name")
	private String userName;

	 /**
	 * 昵称,
	 *
	 */
	@TableField(value="nickname")
	private String nickname;

	 /**
	 * 密码,
	 *
	 */
	@TableField(value="user_psw")
	private String userPsw;

	 /**
	 * 用户状态,
	 *
	 */
	@TableField(value="user_status")
	private Integer userStatus;

	 /**
	 * 是否删除,
	 *
	 */
	@TableField(value="is_delete")
	private Integer isDelete;

	 /**
	 * 创建时间,
	 *
	 */
	@TableField(value="create_time")
	private Date createTime;

	 /**
	 * 更新时间,
	 *
	 */
	@TableField(value="update_time")
	private Date updateTime;

	 /**
	 * 创建者,
	 *
	 */
	@TableField(value="create_by")
	private String createBy;

	 /**
	 *
	 *
	 */
	@TableField(value="update_by")
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

	@Override
	protected Serializable pkVal() {
		return this.getId();
	}
}
