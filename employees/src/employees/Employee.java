package employees;
public class Employee {
	
		private String name; 
		private long salary;
		
		
		
		
		
		public void salaryClause(long clause) {
			salary += clause;
		}
		
		
		
		

		@Override
		public String toString() {
			return "Employee name: " + name + ", salary: " + salary + "Ft";
		}
		
		
		
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getSalary() {
			return salary;
		}

		public void setSalary(long value) {
			salary = value;
			
		}
		
		
		
		
		public boolean salaryBetweenIntervalls(long lowestvalue, long highestvalue) {
			return salary >= lowestvalue && salary<= highestvalue;
		}
		
		
		public long tax() {
			
			return (long)(salary * 0.16 * 12);
		}
		
		public boolean salaryHigherThan(Employee another) {
			return salary > another.salary;
		}
		
		
	}

