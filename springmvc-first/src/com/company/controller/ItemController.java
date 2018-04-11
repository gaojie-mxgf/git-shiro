package com.company.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.company.pojo.Item;
import com.company.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("itemList.action")
	public ModelAndView queryItemList(){

		List<Item> list = itemService.queryItemList();
		//创建modelAndview视图
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("itemList");
		
		
		return modelAndView;
	}
	
	@RequestMapping("/itemEdit")
	public String queryItemById(int  id,Model model){
		
		Item item = this.itemService.queryItemById(id);
		model.addAttribute("item", item);
		return "editItem";
	}
	
	@RequestMapping("/updateItem")
	public String queryItemById(Item item,Integer id,String name){
//		System.out.println(item.getId());
		System.out.println(id);
		System.out.println(name);
		System.out.println(item.getCreatetime());
		this.itemService.updateItemById(item);
		return "success";
	}
	//https://PC201605151039:8443/svn/svnFirstTest
	
	/**
	 * @author svn添加项目
	 * 添加冲突
	 * 
	 */
	
}
