public class declaringAndModifyingVariables {
	
	public static void main (String[] args) {
		
			int age = 25;
			double weight = 150.5;
			String name = "John";  
			
		System.out.println("Age: " + age + "\nWeight: " + weight + "\nName: " + name);
		System.out.println("\n\nNew Values: ");
		
		age = age + 1;
		weight = weight - 2; 
		name = "Jane";
				
		System.out.print("\nNew age: " + age + 
		"\nNew weight: " + weight +
		 "\nNew name: " + name);
 	}
		
}
