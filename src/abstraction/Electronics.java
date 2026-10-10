package abstraction;

public class Electronics extends Products {
	String brand;

	public Electronics(int productId, String productName, double price, String brand) {
		super(productId, productName, price);
		this.brand = brand;
	}
	
	@Override
	double calculateDiscount() {
		return Price *10/100;
		
	}
	
	@Override
	void displayProductDetails() {
		super.displayProductDetails();
		System.out.println("brand:" +brand);
		
	}
}

	

	


	

