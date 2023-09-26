package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Item;
import com.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	
	public void additem(Item item)
	{
		itemRepository.save(item);
	}
	
	
	public void updateitem(Item item)
	{
		itemRepository.save(item);
	}
	
	public void deleteItem(Item item)
	{
		itemRepository.delete(item);
	}
	
	
	public List<Item> getAllItems()
	{
		ArrayList<Item> itemList = new ArrayList();
		
		return itemRepository.findAll();
	}
	
	public Item getItemById(int id)
	{
		return itemRepository.findById(id).get();
	}

	public List<Item> findByPrice(float price)
	{
		return itemRepository.findItemByPrice(price);
	}
	
}
