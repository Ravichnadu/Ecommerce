package com.marolix.ecommerce.service;

import com.marolix.ecommerce.dto.EcommerceDto;

public interface EcommerceService {

	public  String addProduct(EcommerceDto dto);
	public EcommerceDto readProduct(Integer id);
	public String updateProduct(EcommerceDto dto,Integer id );
	
	public String deleteProduct(Integer id);
}
