package com.neevtech.jaxb.model.territorymanager;

import java.sql.Date;
import java.sql.Timestamp;

public class RscAll {
	private long terrRscId;
	private Timestamp lastUpdateDate;
	private long lastUpdatedBy;
	private Timestamp creationDate;
	private long createdBy;
	private long lastUpdateLogin;
	private long terrId;
	private long resourceId;
	private String resourceType;
	private String role;
	private String primaryContactFlag;
	private Date startDateActive;
	private Date endDateActive;
	private long orgId;
	private long groupId;
	private String fullAccessFlag;
	private long securityGroupId;
	private long personId;
	private long objectVersionId;
	
	public long getTerrRscId() {
		return terrRscId;
	}
	public void setTerrRscId(long terrRscId) {
		this.terrRscId = terrRscId;
	}
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public long getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public long getLastUpdateLogin() {
		return lastUpdateLogin;
	}
	public void setLastUpdateLogin(long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}
	public long getTerrId() {
		return terrId;
	}
	public void setTerrId(long terrId) {
		this.terrId = terrId;
	}
	public long getResourceId() {
		return resourceId;
	}
	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPrimaryContactFlag() {
		return primaryContactFlag;
	}
	public void setPrimaryContactFlag(String primaryContactFlag) {
		this.primaryContactFlag = primaryContactFlag;
	}
	public Date getStartDateActive() {
		return startDateActive;
	}
	public void setStartDateActive(Date startDateActive) {
		this.startDateActive = startDateActive;
	}
	public Date getEndDateActive() {
		return endDateActive;
	}
	public void setEndDateActive(Date endDateActive) {
		this.endDateActive = endDateActive;
	}
	public long getOrgId() {
		return orgId;
	}
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getFullAccessFlag() {
		return fullAccessFlag;
	}
	public void setFullAccessFlag(String fullAccessFlag) {
		this.fullAccessFlag = fullAccessFlag;
	}
	public long getSecurityGroupId() {
		return securityGroupId;
	}
	public void setSecurityGroupId(long securityGroupId) {
		this.securityGroupId = securityGroupId;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public long getObjectVersionId() {
		return objectVersionId;
	}
	public void setObjectVersionId(long objectVersionId) {
		this.objectVersionId = objectVersionId;
	}
}
