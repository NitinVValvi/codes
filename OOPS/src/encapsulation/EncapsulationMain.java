package encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		
		Laptop l1 = new Laptop();
		l1.setPrice(31);
		
		System.out.println(l1.getPrice());
	}
	
}

class Laptop{
	int ram ;
	private int price;
	
	public void setPrice(int price) {
		
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("you cant set price");
		}else {
		this.price = price;
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
	
}