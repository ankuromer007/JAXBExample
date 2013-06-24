package com.neevtech.jaxb.model.territorymanager;

import java.sql.Timestamp;

public class QualAll {
	private long terrQualId;
	private Timestamp lastUpdateDate;
	private long lastUpdatedBy;
	private Timestamp creationDate;
	private long createdBy;
	private long lastUpdateLogin;
	private long terrId;
	private long qualUsgId;
	private String qualifierMode;
	private String overlapAllowedFlag;
	private String useToNameFlag;
	private String generateFlag;
	private long orgId;
	private long securityGroupId;
	private long objectVersionNumber;
	
	public long getTerrQualId() {
		return terrQualId;
	}
	public void setTerrQualId(long terrQualId) {
		this.terrQualId = terrQualId;
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
	public long getQualUsgId() {
		return qualUsgId;
	}
	public void setQualUsgId(long qualUsgId) {
		this.qualUsgId = qualUsgId;
	}
	public String getQualifierMode() {
		return qualifierMode;
	}
	public void setQualifierMode(String qualifierMode) {
		this.qualifierMode = qualifierMode;
	}
	public String getOverlapAllowedFlag() {
		return overlapAllowedFlag;
	}
	public void setOverlapAllowedFlag(String overlapAllowedFlag) {
		this.overlapAllowedFlag = overlapAllowedFlag;
	}
	public String getUseToNameFlag() {
		return useToNameFlag;
	}
	public void setUseToNameFlag(String useToNameFlag) {
		this.useToNameFlag = useToNameFlag;
	}
	public String getGenerateFlag() {
		return generateFlag;
	}
	public void setGenerateFlag(String generateFlag) {
		this.generateFlag = generateFlag;
	}
	public long getOrgId() {
		return orgId;
	}
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	public long getSecurityGroupId() {
		return securityGroupId;
	}
	public void setSecurityGroupId(long securityGroupId) {
		this.securityGroupId = securityGroupId;
	}
	public long getObjectVersionNumber() {
		return objectVersionNumber;
	}
	public void setObjectVersionNumber(long objectVersionNumber) {
		this.objectVersionNumber = objectVersionNumber;
	}
}
