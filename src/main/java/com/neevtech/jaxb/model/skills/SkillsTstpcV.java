package com.neevtech.jaxb.model.skills;

public class SkillsTstpcV {
	private long techId;
	private String techName;
	private long subTechId;
	private String subTechName;
	private int hitCount;
	private String problemCode;
	private String problemCodeMeaning;
	private String problemCodeDescription;
	private long problemCodeId;
	private String subTechHiddenFlag;
	
	public long getTechId() {
		return techId;
	}
	public void setTechId(long techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public long getSubTechId() {
		return subTechId;
	}
	public void setSubTechId(long subTechId) {
		this.subTechId = subTechId;
	}
	public String getSubTechName() {
		return subTechName;
	}
	public void setSubTechName(String subTechName) {
		this.subTechName = subTechName;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public String getProblemCode() {
		return problemCode;
	}
	public void setProblemCode(String problemCode) {
		this.problemCode = problemCode;
	}
	public String getProblemCodeMeaning() {
		return problemCodeMeaning;
	}
	public void setProblemCodeMeaning(String problemCodeMeaning) {
		this.problemCodeMeaning = problemCodeMeaning;
	}
	public String getProblemCodeDescription() {
		return problemCodeDescription;
	}
	public void setProblemCodeDescription(String problemCodeDescription) {
		this.problemCodeDescription = problemCodeDescription;
	}
	public long getProblemCodeId() {
		return problemCodeId;
	}
	public void setProblemCodeId(long problemCodeId) {
		this.problemCodeId = problemCodeId;
	}
	public String getSubTechHiddenFlag() {
		return subTechHiddenFlag;
	}
	public void setSubTechHiddenFlag(String subTechHiddenFlag) {
		this.subTechHiddenFlag = subTechHiddenFlag;
	}
}
