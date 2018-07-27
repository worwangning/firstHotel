package com.orilore.controller;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.bizs.IKindBiz;
import com.orilore.model.Kind;

@RestController
@RequestMapping("/kind")
public class kindCtrl {
	@Resource
	private IKindBiz biz;//这必须是接口，不能是实现类
	private static final Logger log = LoggerFactory.getLogger(kindCtrl.class);
	@RequestMapping("/get/{kid}")
	public Kind get(@PathVariable("kid") int id) {//接收上面的{kid}，传给int
		return biz.getKind(id);
	}
	@RequestMapping("/save")
	public boolean saveKind(Kind kind) {
		log.info("-----添加客房类型-----");
		return biz.saveKind(kind);
	}
	@RequestMapping("/remove/{id}")
	public boolean removeKind(@PathVariable("id") int id) {
		log.info("-----删除客房类型-----");
		return biz.removeKind(id);
	}
	@RequestMapping("/query")
	public List<Kind> findKind() {
		log.info("-----查询所有客房类型-----");//日志级别受日志配置文件影响，手工日志用于记录该方法被调用
		return biz.findKind();
	}
}