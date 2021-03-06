package com.neevtech.jaxb.model.skills;

import java.sql.Timestamp;

public class TemplateSkillMap {
	private long templateSkillMapId;
	private long templateId;
	private long skillId;
	private long profId;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	
	public long getTemplateSkillMapId() {
		return templateSkillMapId;
	}
	public void setTemplateSkillMapId(long templateSkillMapId) {
		this.templateSkillMapId = templateSkillMapId;
	}
	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public long getProfId() {
		return profId;
	}
	public void setProfId(long profId) {
		this.profId = profId;
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
}
