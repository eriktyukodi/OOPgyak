package employees;



public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 Employee employeeobj = new Employee();
		
		//private módosító még nem volt :
		//employeeobj.name = "Kiss István";
		//employeeobj.salary = 10;
		
		
		employeeobj.setName("Kiss István");
		employeeobj.setSalary(10);
		
		System.out.println(employeeobj.toString());
		System.out.println(employeeobj); 
		
		
		employeeobj.salaryClause(5);
		
		System.out.println(employeeobj);
		
		
		System.out.println("Employee name: " + employeeobj.getName());
		
		System.out.println("Salary: " + employeeobj.getSalary());
		
		
		System.out.println("The salaryes are between 10 and 50: " + employeeobj.salaryBetweenIntervalls(10, 50));
		System.out.println("The salaryes are between 5 and 6: " + employeeobj.salaryBetweenIntervalls(5, 6));
		
		
		System.out.println(employeeobj.tax());
		
		
		
		
		Employee employeeobj2 = new Employee();
		employeeobj2.setName("Kiss Klaudia");
		employeeobj2.setSalary(35);
		employeeobj2.salaryClause(11);
		System.out.println(employeeobj2);
		
		
			System.out.println("István's salary higher: " + employeeobj.salaryHigherThan(employeeobj2));
			System.out
					.println("Klaudia's salary higher: " +employeeobj2.salaryHigherThan(employeeobj));
			
		
			Employee[] employees = new Employee[5];
			
			for (int i = 0; i < employees.length; i++) {
				employees[i] = new Employee();
				employees[i].setName("XY");
				employees[i].setSalary((long)(Math.random() * 50));
				 	System.out.println(employees[i]);
			}
			
			int maxindex= 0;
			for (int i = 1; i < employees.length; i++) {
				if (employees[i].getSalary() >employees[maxindex].getSalary()){
					maxindex = i;
				}		   
			}
			System.out.println("Employee with the best salary: " + employees[maxindex]);

	}
}

