package variable;

public class Product {
	static short pId=120;
	static String pname ;
	static  byte quantity=15;
	static double price;
	static float rating =4.4f;
	static String category;
	static boolean isAvailable;
	static long barcode =1246725490l;
	static String city="pune";
	static String color=" Black";
	static String brand ="dell";
	static byte warranty_Year= 3;
	static short stock =50;
	static String supplierName = "ABC";
	static int manufacturing_Date;
	
	public static void main(String args[]) {
		
		System.out.println("pId : " + pId);
		System.out.println("pname : " + pname);
		System.out.println("quantity : " + quantity );
		System.out.println("price : " + price);
		System.out.println("rating: " + rating);
		System.out.println("category : " + category);
		System.out.println("isAvailable : " + isAvailable);
		System.out.println("barcode : " + barcode);
		System.out.println("city : " + city);
		System.out.println("color : " + color);
		System.out.println("brand : " + brand);
		System.out.println("warranty_Year: " + warranty_Year);
		System.out.println("stock : " + stock);
		System.out.println("supplierName : " + supplierName);
		System.out.println("manufacturing_Date : " +  manufacturing_Date);
	}

}


