package com.warehouse.pdt; 
public class Product {
	private long productId;
	private String productName;
	private String manfDate;
	private String expDate;
	private String category;
	private double price;
	private String descripition;
	private String countryofOrigin;
	public Product(long productId,String productName,String manfDate,String expDate,
			String category,double price,String descripition,String countryofOrigin) {
		this.productId=productId;
		this.productName=productName;
		this.manfDate=manfDate;
		this.expDate=expDate;
		this.category=category;
		this.price=price;
		this.descripition=descripition;
		this.countryofOrigin=countryofOrigin;
		
	}
	public String toString() {
		return "Product Id: "+this.productId+",Product Name: "+this.productName+",Manf Date: "+this.manfDate+",Exp Date: "+this.expDate+",Category:"+this.category
				+",Price: "+this.price+",Description: "+this.descripition+",Country :"+this.countryofOrigin;
	}
}