package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.bizs.IHouseBiz;
import com.orilore.model.House;


@RestController
@RequestMapping("/house")
public class HouseCtrl {

	@Resource
	private IHouseBiz biz;//这必须是接口，不能是实现类
	private static final Logger log = LoggerFactory.getLogger(HouseCtrl.class);
	@RequestMapping("/get/{id}")
	public House get(@PathVariable("id") int id) {//接收上面的{kid}，传给int
		return biz.getHouse(id);
	}
	@RequestMapping("/save")
	public boolean saveHouse(House house) {
		log.info("-----添加客房-----");
		return biz.saveHouse(house);
	}
	@RequestMapping("/remove")
	public boolean removeHouse(int id) {
		log.info("-----删除客房-----");
		return biz.removeHouse(id);
	}
	

	@RequestMapping("/query")
	public List<House> findHouse() {
		log.info("-----查询所有客房-----");//日志级别受日志配置文件影响，手工日志用于记录该方法被调用
		return biz.findHouse();
	}
	
}
