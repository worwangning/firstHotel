package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class HouseBiz implements IHouseBiz{
	/*@Resource
	 * private HouseMapper mapper;
	 * @Override
	 * public boolean save(House bean){
	 * 		if(bean.getId()!=null){
	 * 			return this.mapper.update(bean);
	 * 		}else{
	 * 			return this.mapper.insert(bean);
	 * 		}
	 * }
	 * @Override
	 * public boolean remove (Integer id){
	 * 		return this.mapper.delete(id);
	 * }
	 * @Override
	 * public Kind find(Integer id){
	 * 		return this.mapper.selectOne(id);
	 * }
	 * @Override
	 * public List<House> query(){
	 * 		return this.mapper.select();
	 * }
	 * */
	@Resource
	 private HouseMapper mapper;
	 private static final Logger log = LoggerFactory.getLogger(HouseBiz.class);
	@Override
	public boolean saveHouse(House bean) {
		boolean flag = false;
		try{
			if(bean.getId()!=null) {
				flag = this.mapper.update(bean);
			}else {
				flag = this.mapper.insert(bean);				
			}
		}catch(Exception ex){
			log.error(ex.getMessage());
		}
		return flag;
	}
	@Override
	public boolean removeHouse(int id) {
		boolean flag = false;
		try{
			flag = this.mapper.delete(id);
		}catch(Exception ex){
			log.error(ex.getMessage());
		}
		return flag;
	}
	
	@Override
	public House getHouse(int id) {
		try {
			return this.mapper.selectOne(id);
		}catch(Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}
	@Override
	public List<House> findHouse() {
		try {
			return this.mapper.select();
		}catch(Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}
}
