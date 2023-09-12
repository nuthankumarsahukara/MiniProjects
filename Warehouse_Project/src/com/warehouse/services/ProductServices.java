package com.warehouse.services;
import java.util.Scanner;
import com.warehouse.abs.*;
public class ProductServices{
    Scanner s=new Scanner(System.in);
    ProductAbs n=new ProductAbs();
       public void menu() {
    	while(true) {
    	System.out.println("=============================================");
    	System.out.println("              Product Services               ");
    	System.out.println("=============================================");
    	System.out.println("1.Add the Product");
    	System.out.println("2.Display the Product");
    	System.out.println("3.Update the Product");
    	System.out.println("4.Delete the Product");
    	System.out.println("5.Display Product Name By Id");
    	System.out.println("6.Display Expiry Date By Id");
    	System.out.println("7.Display Category By Id");
    	System.out.println("8.Display Country By Id");
    	System.out.println("9.Exit");
    	System.out.println("=============================================");
    	System.out.println("Enter the choice");
    	int ch=s.nextInt();
    switch(ch) {
    case 1 :n.addNewProduct();
    		break;   
    case 2 :n.displayallProducts();
			break;
    case 3:n.updateById();
    		break;
    case 4:n.deleteById();
    		break;
    case 5:n.displayProductNameById();
    		break;
    case 6:n.displayExpiryDateById();
    		break;
    case 7:n.displayCategoryById();
    		break;
    case 8:n.displayByCountryOfOrigin();
    		break;
    case 9:System.exit(0);
    default : System.out.println("Please Enter a Correct Choice.....");
    }

   }
}
}