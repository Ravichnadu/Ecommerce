package com.marolix.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class EcommerceEntity {
	
	@Id
	@Column(name = "product_id")
	private Integer id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_brand")
	private String brand;
	
	@Column(name = "product_price")
	private Double price;
	
	@Column(name = "product_discount")
	private Double discount;
	
	@Column(name = "product_review")
	private String review;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public EcommerceEntity(Integer id, String name, String brand, Double price, Double discount, String review) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.review = review;
	}

	public EcommerceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EcommerceEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", discount="
				+ discount + ", review=" + review + "]";
	}
	
  
}
