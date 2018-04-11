package com.company.service;

import java.util.List;

import com.company.pojo.Item;


public interface ItemService {
	
	/**
	 * 查询商品列表
	 * 
	 * 
	 */
	List<Item> queryItemList();
	
	/**
	 * 根据商品id查询商品
	 * 
	 * @param id
	 * @return
	 */
	Item queryItemById(int id);
	
	/**
	 * 根据id更新商品
	 * 
	 * @param item
	 */
	void updateItemById(Item item);
	
	
	
}
