package abstraction;

public class TestProduct {

	public static void main(String[] args) {
		
		Products p = new Electronics(101,"Mobile",16000,"Vivo");
		Clothing c = new Clothing(102,"Dress",1500,"M");
		Furniture f = new Furniture(101,"Dressing Table",12000,"wood");
		
		System.out.println("*****************Electronics**************");
		p.displayProductDetails();
		double discount1 = p.calculateDiscount();
		System.out.println("Discount:" +discount1);
		System.out.println("Final Price:" +(p.Price - discount1));
		
		System.out.println("*****************Clothing**************");
		c.displayProductDetails();
		double discount2 = p.calculateDiscount();
		System.out.println("Discount:" +discount2);
		System.out.println("Final Price:" +(c.Price - discount2));
		
		System.out.println("*****************Furniture**************");
		f.displayProductDetails();
		double discount3 = p.calculateDiscount();
		System.out.println("Discount:" +discount3);
		System.out.println("Final Price:" +(f.Price - discount3));
		}

}
