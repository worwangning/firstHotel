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
public class KindBiz implements IKindBiz{
	/*@Resource
	 * private KindMapper mapper;
	 * @Override
	 * public boolean save(Kind bean){
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
	 * public List<Kind> query(){
	 * 		return this.mapper.select();
	 * }
	 * */
	@Resource
	private KindMapper mapper;
	private static final Logger log = LoggerFactory.getLogger(KindBiz.class); 
	@Override
	public boolean saveKind(Kind bean) {
		boolean flag = false;
		try {
			if(bean.getId()!=null) {
				flag = this.mapper.update(bean);
			}else {
				flag = this.mapper.insert(bean);
			}
		}catch(Exception ex) {
			log.error(ex.getMessage());
		}
		return flag;
	}
	@Override
	public boolean removeKind(int id) {
		boolean flag = false;
		try {
			flag = this.mapper.delete(id);
		}catch(Exception ex){
			log.error(ex.getMessage());
		}	
		return flag;
	}

	@Override
	public Kind getKind(int id) {
		try {
			return this.mapper.selectOne(id);
		}catch(Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}
	@Override
	public List<Kind> findKind() {
		try {
			return this.mapper.select();
		}catch(Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}
}
