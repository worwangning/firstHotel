package com.orilore.mappers;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;

@Mapper
public interface KindMapper{
	public boolean insert(Kind bean);
	public Kind selectOne(int id);
	public boolean delete(int id);
	public List<Kind> select();//只需要查类型信息时用
	public List<Kind> select2();//查类型时顺便把客房信息查询出
	public boolean update(Kind bean);
}
