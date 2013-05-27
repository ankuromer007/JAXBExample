package com.neevtech.jaxb.model.cotadmin;

import java.sql.Date;

public class TimeChart {

	private long timeChartId;
	private int dayOfWeek;
	private int startHour;
	private int endHour;
	private boolean exFlag;
	private long expCustSegmentId;
	private String createdBy;
	private Date creationDate;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private String expProblemCode;
	
	private String centerName;
	private long seasonId;
	private long expSubTechId;
}
