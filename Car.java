package ArrayList;

public class Car {
	private String brand;
	private int price;
	private String colour;
	private int mileage;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Car(String brand, int price, String colour, int mileage) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", colour=" + colour + ", mileage=" + mileage + "]";
	}
	
	
	

}
