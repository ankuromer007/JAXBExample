package com.neevtech.jaxb.model.cotadmin;

import java.sql.Date;

public class LoadBalance {

	private long loadBalanceId;
	private long queueOrderId;
	private boolean activeFlag;
	private long custSegmentId;
	private String createdBy;
	private Date creationDate;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private String problemCode;
	
	private long virtualQueueId;
	private long queueId;
	private long counterId;
}
