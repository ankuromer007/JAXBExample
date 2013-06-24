package com.neevtech.jaxb.model.cotadmin;

public class QueueV {
	private long queueId;
	private String queueName;
	private long rerouteQueueId;
	
	public long getQueueId() {
		return queueId;
	}
	public void setQueueId(long queueId) {
		this.queueId = queueId;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public long getRerouteQueueId() {
		return rerouteQueueId;
	}
	public void setRerouteQueueId(long rerouteQueueId) {
		this.rerouteQueueId = rerouteQueueId;
	}
}
