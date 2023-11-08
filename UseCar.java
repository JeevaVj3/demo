package ArrayList;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
		
		Car c1 = new Car("Audi",5000000,"black",20);
		Car c2 = new Car("Hundai",700000,"white",35);
		Car c3 = new Car("TATA",800000,"white",40);
		Car c4 = new Car("BMW",1500000,"Black",14);
		
		ArrayList<Car> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		
//		for(int i=0; i<c.size(); i++) {
//			if(c.get(i).getBrand().toUpperCase().equals(c.get(i).getBrand()) && c.get(i).getColour().equals("white")) {
//				c.get(i).setPrice(c.get(i).getPrice()-(c.get(i).getPrice()*10/100));
//				System.out.println(c.get(i));
//			}
//		}
		
//		ArrayList<Car> newc = new ArrayList<>();
//		
//		c.forEach(x-> {
//			if(x.getMileage()>20) {
//				newc.add(x);
//				
//			}
//			});
//		    System.out.println(newc);
		    
		    
		    Integer cr = c.get(0).getPrice();
		    for(int i=0; i<c.size(); i++ ) {
		    	for(int j=i+1; j<c.size(); j++) {
		    		if(cr<c.get(i).getPrice()) {
		    			cr=c.get(i).getPrice();
		    		}
		    	}
		    }
		    System.out.println(cr);
		    
		    
		    Car min = c.get(0);
		    for(int i = 0; i<c.size();i++) {
		    if(min.getPrice()>c.get(i).getPrice()) {
		    	min = c.get(i);
		    }
		    }
		    System.out.println(min);
		}
}
		


