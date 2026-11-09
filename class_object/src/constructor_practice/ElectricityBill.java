package constructor_practice;

public class ElectricityBill {
	
	    private String customerName;
	    private int unitsConsumed;

	    public ElectricityBill(String customerName, int unitsConsumed) {

	        this.customerName = customerName;
	        this.unitsConsumed = unitsConsumed;
	    }

	    public double calculateBill() {

	        double bill = 0;

	        if (unitsConsumed < 0) {
	            return -1;
	        }

	        if (unitsConsumed <= 100) {

	            bill = unitsConsumed * 2;

	        } else if (unitsConsumed <= 200) {

	            bill = (100 * 2) + ((unitsConsumed - 100) * 3);

	        } else {

	            bill = (100 * 2) + (100 * 3)
	                    + ((unitsConsumed - 200) * 5);
	        }

	        return bill;
	    }

	    public void displayBill() {

	        if (unitsConsumed < 0) {
	            System.out.println("Invalid units consumed.");
	            return;
	        }

	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Units Consumed: " + unitsConsumed);
	        System.out.println("Total Electricity Bill: Rs. " + calculateBill());
	    }
	}

