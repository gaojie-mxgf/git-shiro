package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mapper.ItemMapper;
import com.company.pojo.Item;
import com.company.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
		
		@Autowired
		private ItemMapper itemMapper;
		
		@Override
		public List<Item> queryItemList() {
			List<Item> list = this.itemMapper.selectByExample(null);
			return list;
		}
		
		@Override
		public Item queryItemById(int id) {
			Item item = this.itemMapper.selectByPrimaryKey(id);
			
			return item;
		}
		
		
		@Override
		public void updateItemById(Item item) {
		
			this.itemMapper.updateByPrimaryKeySelective(item);
		}
}
