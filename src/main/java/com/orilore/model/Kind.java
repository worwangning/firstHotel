package com.orilore.model;

import java.util.List;

public class Kind{
	private List<House> houses;
	private Integer Id;
	public void setId(Integer Id){
		this.Id=Id;
	}

		return this.Id;
	}
	private String name;
	public void setName(String name){
		this.name=name;
	}

		return this.name;
	}
	private String icon;
	public void setIcon(String icon){
		this.icon=icon;
	}

		return this.icon;
	}
	private String info;
	public void setInfo(String info){
		this.info=info;
	}

		return this.info;
	}
	private Integer status;
	public void setStatus(Integer status){
		this.status=status;
	}

		return this.status;
	}

	public List<House> getHouses() {
		return houses;
	}

	public void setHouses(List<House> houses) {
		this.houses = houses;
	}
}