package com.marolix.ecommerce.dto;


public class EcommerceDto {

    private Integer id;
    private String name;
	private String brand;
	private Double price;
	private Double discount;
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
	public EcommerceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcommerceDto(Integer id, String name, String brand, Double price, Double discount, String review) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.review = review;
	}
	@Override
	public String toString() {
		return "EcommerceDto [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", discount="
				+ discount + ", review=" + review + "]";
	}
	
	

}
