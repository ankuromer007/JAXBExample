package com.neevtech.jaxb.model.cotadmin;

import java.sql.Timestamp;

public class LoadBalance {
	private long loadBalanceId;
	private long virtualQueueId;
	private long queueId;
	private long queueOrderId;
	private String activeFlag;
	private long custSegmentId;
	private long counterId;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	private String problemCode;
	
	public long getLoadBalanceId() {
		return loadBalanceId;
	}
	public void setLoadBalanceId(long loadBalanceId) {
		this.loadBalanceId = loadBalanceId;
	}
	public long getVirtualQueueId() {
		return virtualQueueId;
	}
	public void setVirtualQueueId(long virtualQueueId) {
		this.virtualQueueId = virtualQueueId;
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
	public long getCustSegmentId() {
		return custSegmentId;
	}
	public void setCustSegmentId(long custSegmentId) {
		this.custSegmentId = custSegmentId;
	}
	public long getCounterId() {
		return counterId;
	}
	public void setCounterId(long counterId) {
		this.counterId = counterId;
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
	public String getProblemCode() {
		return problemCode;
	}
	public void setProblemCode(String problemCode) {
		this.problemCode = problemCode;
	}
}
