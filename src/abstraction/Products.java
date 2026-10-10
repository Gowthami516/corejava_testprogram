package abstraction;

public class Products {
	
	int ProductId;
	String ProductName;
	double Price;
	
	public Products(int productId, String productName, double price) {
		this.ProductId = productId;
		this.ProductName = productName;
		this.Price = price;
	}
	
	void displayProductDetails() {
		System.out.println("Product Id:" +ProductId);
		System.out.println("Product Name:" +ProductName);
		System.out.println("Price :" +Price);
	}
	
	double calculateDiscount() {
		return 0;
	}
}
