package com.neevtech.jaxb.model.cotadmin;

import java.sql.Date;

public class SubTech {

	private long subTechId;
	private String subTechName;
	private boolean activeFlag;
	private boolean hiddenFlag;
	private int hitCount;
	private String createdBy;
	private Date creationDate;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	
	private long techId;
}
