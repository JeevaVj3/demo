package ArrayList;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee("Jeeva",2565,25,50000,2,"Male");
		Employee e1 = new Employee("Raja",2458,34,60000,6,"Male");
		Employee e2 = new Employee("Kumar",2566,25,45000,1,"Male");
		Employee e3 = new Employee("Priya",2485,27,80000,3,"female");
		Employee e4 = new Employee("Hema",2585,33,30000,1,"female");
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		emp.forEach(x-> System.out.println(x));
		
		
//		for(int i=0; i<emp.size(); i++) {
//			if(emp.get(i).getName().contains("a") || emp.get(i).getName().contains("e") || emp.get(i).getName().contains("i")||emp.get(i).getName().contains("o")||emp.get(i).getName().contains("u")) {
//				System.out.println(emp.get(i).getName());
//			}
//		}
//		
//		for(Employee val:emp) {
//			if(val.getGender().contains("female")) {
//				System.out.println(val);
//			}
//		}
		    
			for(int i=0; i<emp.size();i++) {
			if(emp.get(i).getName().charAt(0)>='A' && emp.get(i).getName().charAt(0)<='Z') {
				System.out.println(emp.get(i).getName());
			}
			}
			
			for(int i=0; i<emp.size(); i++) {
				if(emp.get(i).getAge()>30 && emp.get(i).getExperence()>2) {
					System.out.println(emp.get(i));
				}
			}
		
	}

}
