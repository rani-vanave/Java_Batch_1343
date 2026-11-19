package polymorphisms;

public class Shopping {
	private static final String ProductId = null;
	public void purchase(int productId) {
		System.out.println("Product ID : " + productId);
	}
	public void purchase(int ProductId ,int quantity ) {
		System.out.println("Product ID : " + ProductId);
		System.out.println("Product Quantity : " + quantity);
		
	}
	public void purchase(int productId,int quantity, double discountp) {
		double price=1000;
		double total=price*quantity;
		
		double discount=total*discountp/100;
		double finalAmt=total-discount;
		System.out.println("Product ID : " + productId );
		System.out.println("Quantity : " + quantity);
		System.out.println("Total Price : " + total);
		System.out.println("Discount : " + discountp + "%");
		System.out.println("Final Amount : " + finalAmt);
		
	}
	public void purchase(String productName,int quantity) {
		System.out.println("Product Name : " + productName);
		System.out.println("Product Quantity : " + quantity);
	}
	public static void main(String[] args) {
		Shopping s = new Shopping();
		s.purchase(1100);
		System.out.println("-------------------");
		s.purchase(1101, 3);
		System.out.println("----------------------");
	   s.purchase(1102, 2, 10);
	   System.out.println("-----------------------");
	   s.purchase("Laptop", 2);
		
	}
	

}
