package com.marolix.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marolix.ecommerce.dto.EcommerceDto;
import com.marolix.ecommerce.serviceimp.ServiceImp;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

	@Autowired
	private ServiceImp serviceImp;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}
	
	
	@Override
    public void run(String...args) throws Exception {
        System.out.println("Application Started !!");
        addproduct();
    }

	public void addproduct()
	{
		EcommerceDto dto=new EcommerceDto();
		dto.setId(1);
		dto.setName("iphone 17");
		dto.setBrand("iphone");
		dto.setPrice(100000.00);
		dto.setDiscount(7000.00);
		dto.setReview("this product is very good to use and show our property");
		
		serviceImp.addProduct(dto);
	}
}
