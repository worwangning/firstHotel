package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IHouseBiz{
	public boolean saveHouse(House house);
	public boolean removeHouse(int id);
	public House getHouse(int id);
	public List<House> findHouse();
}