package com.marolix.ecommerce.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marolix.ecommerce.entity.EcommerceEntity;

public interface EcommerceReposistry extends JpaRepository<EcommerceEntity, Integer>{

}
