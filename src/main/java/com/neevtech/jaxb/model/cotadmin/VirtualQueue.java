package com.neevtech.jaxb.model.cotadmin;

import java.sql.Timestamp;

public class VirtualQueue {
	private long virtualQueueId;
	private long subTechId;
	private long timeChartId;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	
	public long getVirtualQueueId() {
		return virtualQueueId;
	}
	public void setVirtualQueueId(long virtualQueueId) {
		this.virtualQueueId = virtualQueueId;
	}
	public long getSubTechId() {
		return subTechId;
	}
	public void setSubTechId(long subTechId) {
		this.subTechId = subTechId;
	}
	public long getTimeChartId() {
		return timeChartId;
	}
	public void setTimeChartId(long timeChartId) {
		this.timeChartId = timeChartId;
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
