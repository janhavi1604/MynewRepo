package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>{
	
	public Item findItemByItemName(String itemName);
	public List<Item> findItemByPrice(float price);
	

}
