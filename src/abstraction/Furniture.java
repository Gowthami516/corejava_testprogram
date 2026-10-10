package abstraction;

public class Furniture extends Products{
	String Material;

	public Furniture(int productId, String productName, double price, String material) {
		super(productId, productName, price);
		Material = material;
	}
	
	@Override
	double calculateDiscount() {
		
		return Price *50/100;
	}
	@Override
	void displayProductDetails() {
	super.displayProductDetails();
	System.out.println("Material:" +Material);

	 }
}
