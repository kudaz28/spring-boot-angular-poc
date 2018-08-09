package org.masterwill.com.springbootangular.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ASSET")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Asset implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2605386944415647201L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="ASSET_ID")
	private Long assetsId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="SERIAL_NUMBER")
	private String serialNumber;
	
	@Column(name="PURCHASE_PRICE")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern= "yyyy-MM-dd")
	private BigDecimal purchasePrice;
	
	@Column(name="PURCHASE_DATE")
	private Date purchaseDate;
	
	@Column(name="CONTACT")
	private boolean contact;
	
	public Asset()
	{
		super();
	}

	public Long getAssetId() {
		return assetsId;
	}

	public void setAssetId(Long assetsId) {
		this.assetsId = assetsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getBigDecimal() {
		return purchasePrice;
	}

	public void setBigDecimal(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public boolean isContact() {
		return contact;
	}

	public void setContact(boolean contact) {
		this.contact = contact;
	}
}
