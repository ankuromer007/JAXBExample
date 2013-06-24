package com.neevtech.jaxb.model.cotadmin;

import java.sql.Timestamp;

public class TimeChart {
	private long timeChartId;
	private String dayOfWeek;
	private float startHour;
	private float endHour;
	private String centerName;
	private long seasonId;
	private long exFlag;
	private long expSubTechId;
	private long expCustSegmentId;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
	private String expProblemCode;
	
	public long getTimeChartId() {
		return timeChartId;
	}
	public void setTimeChartId(long timeChartId) {
		this.timeChartId = timeChartId;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public float getStartHour() {
		return startHour;
	}
	public void setStartHour(float startHour) {
		this.startHour = startHour;
	}
	public float getEndHour() {
		return endHour;
	}
	public void setEndHour(float endHour) {
		this.endHour = endHour;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public long getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(long seasonId) {
		this.seasonId = seasonId;
	}
	public long getExFlag() {
		return exFlag;
	}
	public void setExFlag(long exFlag) {
		this.exFlag = exFlag;
	}
	public long getExpSubTechId() {
		return expSubTechId;
	}
	public void setExpSubTechId(long expSubTechId) {
		this.expSubTechId = expSubTechId;
	}
	public long getExpCustSegmentId() {
		return expCustSegmentId;
	}
	public void setExpCustSegmentId(long expCustSegmentId) {
		this.expCustSegmentId = expCustSegmentId;
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
	public String getExpProblemCode() {
		return expProblemCode;
	}
	public void setExpProblemCode(String expProblemCode) {
		this.expProblemCode = expProblemCode;
	}
}
