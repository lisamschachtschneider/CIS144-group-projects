package Invoice;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee minion1 = new Employee("Lisa", "Marie", 1020.00);
//		Invoice(String partNumber, String partDescription, int quantity, double price
		Invoice invoice1 = new Invoice("Hammer", "blunt object", 2, 1.00);
		System.out.printf("For the %s, it is typically described as %s, you bought: %d which cost $%.2f each", invoice1.getPartNumber(), invoice1.getPartDescription(), invoice1.getQuantity(), invoice1.getPrice());
	}

}
