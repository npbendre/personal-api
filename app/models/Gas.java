package models;

import play.db.ebean.*;
import java.util.*;
import javax.persistence.*;

import org.joda.time.DateTime;

import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="gas")
public class Gas extends Model{
	
	@Id
	private Long id;
	
	private Double totalGallons;
	
	private Double pricePerGallon;
	
	private Double totalCost;
	
	private DateTime refillDate;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalGallons() {
		return totalGallons;
	}

	public void setTotalGallons(Double totalGallons) {
		this.totalGallons = totalGallons;
	}

	public Double getPricePerGallon() {
		return pricePerGallon;
	}

	public void setPricePerGallon(Double pricePerGallon) {
		this.pricePerGallon = pricePerGallon;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public DateTime getRefillDate() {
		return refillDate;
	}

	public void setRefillDate(DateTime refillDate) {
		this.refillDate = refillDate;
	}
	
}
