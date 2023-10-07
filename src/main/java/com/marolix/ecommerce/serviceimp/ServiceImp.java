package com.marolix.ecommerce.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolix.ecommerce.dto.EcommerceDto;
import com.marolix.ecommerce.entity.EcommerceEntity;
import com.marolix.ecommerce.reposistry.EcommerceReposistry;
import com.marolix.ecommerce.service.EcommerceService;

@Service
public class ServiceImp implements EcommerceService{
	
	@Autowired
	private EcommerceReposistry ecommerceReposistry;
	
	
	public  String addProduct(EcommerceDto dto)
	{
		EcommerceEntity entity=new EcommerceEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setBrand(dto.getBrand());
		entity.setPrice(dto.getPrice());
		entity.setDiscount(dto.getDiscount());
		entity.setReview(dto.getReview());
		
		ecommerceReposistry.save(entity);
		return "addProduct succefully";
	}

}
