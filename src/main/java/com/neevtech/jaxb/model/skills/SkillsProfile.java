package com.neevtech.jaxb.model.skills;

import java.sql.Timestamp;

public class SkillsProfile {
	private long profileId;
	private String profileNameExt;
	private String profileNameInt;
	private String profileDesc;
	private String profileUsageType;
	private int profileType;
	private String createdByUser;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public String getProfileNameExt() {
		return profileNameExt;
	}
	public void setProfileNameExt(String profileNameExt) {
		this.profileNameExt = profileNameExt;
	}
	public String getProfileNameInt() {
		return profileNameInt;
	}
	public void setProfileNameInt(String profileNameInt) {
		this.profileNameInt = profileNameInt;
	}
	public String getProfileDesc() {
		return profileDesc;
	}
	public void setProfileDesc(String profileDesc) {
		this.profileDesc = profileDesc;
	}
	public String getProfileUsageType() {
		return profileUsageType;
	}
	public void setProfileUsageType(String profileUsageType) {
		this.profileUsageType = profileUsageType;
	}
	public int getProfileType() {
		return profileType;
	}
	public void setProfileType(int profileType) {
		this.profileType = profileType;
	}
	public String getCreatedByUser() {
		return createdByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
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
