package com.marolix.ecommerce.serviceimp;

import java.util.Optional;

import javax.management.RuntimeErrorException;

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
	
	public EcommerceDto readProduct(Integer id)
	{
	   Optional<EcommerceEntity> op=ecommerceReposistry.findById(id);
		
		EcommerceEntity entity=op.orElseThrow(()->new RuntimeErrorException(null, "your id is not found :"+id));
		EcommerceDto dto=new EcommerceDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setBrand(entity.getBrand());
		dto.setPrice(entity.getPrice());
		dto.setDiscount(entity.getDiscount());
		dto.setReview(entity.getReview());
		
		return dto;
	}

	@Override
	public String updateProduct(EcommerceDto dto,Integer id) {
		Optional<EcommerceEntity> optional=ecommerceReposistry.findById(id);
		EcommerceEntity entity=optional.orElseThrow(()->new RuntimeErrorException(null,"your product is not found:"+id));
		
		entity.setName(dto.getName());
		ecommerceReposistry.save(entity);
		
		return "update successfully";
		
		

	}

	@Override
	public String deleteProduct(Integer id) {
		Optional<EcommerceEntity> op=ecommerceReposistry.findById(id);
		EcommerceEntity entity=op.orElseThrow(()->new RuntimeErrorException(null,"your product is not found:"+id));
		ecommerceReposistry.delete(entity);
		return "delete data succesfully";
	}
	
	

}
