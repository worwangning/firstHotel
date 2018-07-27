package com.orilore.model;
public class House{
	private Kind Kind;
	private String hname;
	private Integer beds;
	private Integer Id;
	private Integer size;	public void setId(Integer Id){
		this.Id=Id;
	}

	public Integer getId(){
		return this.Id;
	}
	public void setHname(String hname){		this.hname=hname;
	}

	public String getHname(){
		return this.hname;
	}
	
	public void setSize(Integer size){
		this.size=size;
	}
	public Integer getSize(){
		return this.size;
	}
	public void setBeds(Integer beds){
		this.beds=beds;
	}
	public Object getBeds(){
		return this.beds;
	}
	private Float price;
	public void setPrice(Float price){
		this.price=price;
	}
	public Float getPrice(){
		return this.price;
	}
	private Float dis;
	public void setDis(Float dis){
		this.dis=dis;
	}
	public Float getDis(){
		return this.dis;
	}
	private String info;
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return this.info;
	}
	private String pica;
	public void setPica(String pica){
		this.pica=pica;
	}
	public String getPica(){
		return this.pica;
	}
	private String picb;
	public void setPicb(String picb){
		this.picb=picb;
	}
	public String getPicb(){
		return this.picb;
	}
	private String picc;
	public void setPicc(String picc){
		this.picc=picc;
	}
	public String getPicc(){
		return this.picc;
	}
	private String picd;
	public void setPicd(String picd){
		this.picd=picd;
	}
	public String getPicd(){
		return this.picd;
	}
	private String pice;
	public void setPice(String pice){
		this.pice=pice;
	}
	public String getPice(){
		return this.pice;
	}
	private String picf;
	public void setPicf(String picf){
		this.picf=picf;
	}
	public String getPicf(){
		return this.picf;
	}
	private Integer status;
	public void setStatus(Integer status){
		this.status=status;
	}
	public Object getStatus(){
		return this.status;
	}

	public Kind getKind() {
		return Kind;
	}

	public void setKind(Kind kind) {
		Kind = kind;
	}
}