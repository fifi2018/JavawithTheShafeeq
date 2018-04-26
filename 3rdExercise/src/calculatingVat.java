
public class calculatingVat {

	public static void main(String[] args) {
		int qty;
		float price;
		float netamount;
		
		qty = 15;
		price = 1.75f;
		netamount = qty*price - (qty*price*15/100);
		
		System.out.println("Quantity is:" + qty);
		System.out.println("-- -- -- -- -- -- -- --");
		System.out.println("Vat is:"+(qty*price)*15/100);
		System.out.println("-- -- -- -- -- -- -- --");
		System.out.println("Net amount:"+ netamount);
		System.out.println("-- -- -- -- -- -- -- --");
		System.out.println("Total is before vat: "+ qty*price);
		

	}

}
