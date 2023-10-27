package Task1;

public class Product implements Taxable{
    
	private int pid;
	private double price;
	private int quantity;
	
	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public double calcTax() {
		double unitPrice = price/quantity;
		double salesTaxRate = unitPrice*salesTax;
		return salesTaxRate;
	}
	
}
