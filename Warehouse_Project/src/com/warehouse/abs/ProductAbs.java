package com.warehouse.abs;
import com.warehouse.pdt.*;
import java.util.Scanner;
abstract class products{
	    	public abstract void addNewProduct();
	    	public abstract void displayallProducts();
	    	public abstract void displayProductNameById();
	    	public abstract void displayExpiryDateById();
	    	public abstract void displayCategoryById();
	    	public abstract void displayByCountryOfOrigin();   	
   		   	}  
 public class ProductAbs extends products{
	 Scanner s=new Scanner(System.in);
	 Product productss[]=new Product[10];
	 int index=0;
	 long productId=100001;
	public void addNewProduct(){
		System.out.println("Enter the Product Name");
		String productName=s.next();
		System.out.println("Enter the Product Manf Date");
		String manfDate=s.next();
		System.out.println("Enter the Product Exp date");
		String expDate=s.next();
		System.out.println("Enter the Product category");
		String category=s.next();
		System.out.println("Enter the Product price");
		double price=s.nextDouble();
		System.out.println("Enter the Product Descripiton & Don't use Spaces");
		String descripition=s.next();
		System.out.println("Enter the Product origin of country");
		String countryofOrigin=s.next();
		Product obj=new Product(productId,productName,manfDate,expDate,category,price,descripition,countryofOrigin);
		productss[index]= obj;
		productId++;
		index++;
	}
	public void displayallProducts() {
		if(index==0) {
			System.out.println("no values");
		}
		else {
		for (int i=0;i<index;i++) {
			System.out.println(productss[i]);
		}
		}
	}
	public void displayProductNameById(){
		System.out.println("Enter the Product ID:");
		int j=s.nextInt();
		productss[i]=j;
		}
	public void displayExpiryDateById(){
		System.out.println("Enter the Product ID:");
	}
	public void displayCategoryById() {
		System.out.println("Enter the Product ID:");
		productss[i]=s.nextInt();
	}
	public void displayByCountryOfOrigin() {
		System.out.println("Enter the Product ID:");		
	}
	public void deleteById(){
		System.out.println("Enter the Product ID:");
	}
	public void updateById() {
		System.out.println("Enter the Product ID:");		
	}
	
}
   		 

