package question2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		TreeMap<Student,String> student=new TreeMap<>(new Studentshort());
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the roll");
		int roll=input.nextInt();
		
		System.out.println("Enter name");
		String name=input.next();
		
		System.out.println("Enter marks");
		int marks=input.nextInt();
		Student std=new Student(roll, name, marks);
		
		student.put(std,"bihar" );
		
		System.out.println("want to add more Y/N");
		
	    String yn=input.next();
	    while(yn.equalsIgnoreCase("y")) {
	    	System.out.println("Enter the roll");
			 roll=input.nextInt();
			
			System.out.println("Enter name");
			 name=input.next();
			
			System.out.println("Enter marks");
			 marks=input.nextInt();
			 std=new Student(roll, name, marks);
			
			student.put(std,"bihar" );
			
			System.out.println("want to add more Y/N");
			
		     yn=input.next();
	    	
	    }
	    
	    Set<Student> key=student.keySet();
	    for(Student item:key) {
	    	System.out.println(item);
	    	
	    }
	}

}
