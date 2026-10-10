package abstraction;

public class Clothing extends Products {
	String Size;

	public Clothing(int productId, String productName, double price, String size) {
		super(productId, productName, price);
		Size = size;
	}
	
	@Override
	double calculateDiscount() {
		return Price *30/100;
		
	}
		
		@Override
		void displayProductDetails() {
		super.displayProductDetails();
		System.out.println("Size:" +Size);
	}
}
