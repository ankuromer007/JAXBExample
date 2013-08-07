package com.neevtech.jaxb.model.cotadmin;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xxcts_ct_counter")
public class Counter implements Serializable{
	private long counterId;
	private int counter;
	private long createdBy;
	private Timestamp creationDate;
	private long lastUpdatedBy;
	private Timestamp lastUpdateDate;
		
	public Counter() {
	}
	
	@Id
	@Column(name="COUNTER_ID")
	public long getCounterId() {
		return counterId;
	}
	public void setCounterId(long counterId) {
		this.counterId = counterId;
	}
	
	@Column(name="COUNTER")
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	@Column(name="CREATED_BY")
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name="CREATION_DATE")
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	
	@Column(name="LAST_UPDATED_BY")
	public long getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
	@Column(name="LAST_UPDATE_DATE")
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (counterId ^ (counterId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (counterId != other.counterId)
			return false;
		return true;
	}
}
