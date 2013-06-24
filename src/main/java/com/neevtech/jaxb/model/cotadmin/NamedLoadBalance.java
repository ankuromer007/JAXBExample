package com.neevtech.jaxb.model.cotadmin;

import java.sql.Timestamp;

public class NamedLoadBalance {
	private long namedLbId;
	private String lbName;
	private long counterId;
	private long queueId;
	private long queueOrderId;
	private String activeFlag;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	
	public long getNamedLbId() {
		return namedLbId;
	}
	public void setNamedLbId(long namedLbId) {
		this.namedLbId = namedLbId;
	}
	public String getLbName() {
		return lbName;
	}
	public void setLbName(String lbName) {
		this.lbName = lbName;
	}
	public long getCounterId() {
		return counterId;
	}
	public void setCounterId(long counterId) {
		this.counterId = counterId;
	}
	public long getQueueId() {
		return queueId;
	}
	public void setQueueId(long queueId) {
		this.queueId = queueId;
	}
	public long getQueueOrderId() {
		return queueOrderId;
	}
	public void setQueueOrderId(long queueOrderId) {
		this.queueOrderId = queueOrderId;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
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
