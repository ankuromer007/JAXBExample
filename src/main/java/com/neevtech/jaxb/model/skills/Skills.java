package com.neevtech.jaxb.model.skills;

import java.sql.Timestamp;

public class Skills {
	private long skillId;
	private long problemCodeId;
	private long subTechId;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	private long lastUpdateLogin;
	
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public long getProblemCodeId() {
		return problemCodeId;
	}
	public void setProblemCodeId(long problemCodeId) {
		this.problemCodeId = problemCodeId;
	}
	public long getSubTechId() {
		return subTechId;
	}
	public void setSubTechId(long subTechId) {
		this.subTechId = subTechId;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public long getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public long getLastUpdateLogin() {
		return lastUpdateLogin;
	}
	public void setLastUpdateLogin(long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}
}
