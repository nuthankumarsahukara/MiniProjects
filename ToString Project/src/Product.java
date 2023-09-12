
public class Product {
	private long productId;
	private String productName;
	private String productCategory;
	private long productPrice;
	public Product(long productId,String productName,String productCategory,long productPrice){
	this.productId=productId;
	this.productName=productName;
	this.productCategory=productCategory;
	this.productPrice=productPrice;
	}
	public String toString(){
	return "Product ID: "+productId+",Product Name: "+productName+",Product Category: "+productCategory+",Product Price: "+productPrice;
	}

}
