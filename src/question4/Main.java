package question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap<>();
		hm.put(new Student(1,"mahesh",231),"Bihar");
		hm.put(new Student(4,"kartic",279),"rajsthan");
		hm.put(new Student(3,"anish",456),"udaypur");
		hm.put(new Student(2,"fjgj",345),"up");
		
		Set<Student> std=hm.keySet();
	
		for(Student item:std) {
			System.out.println(item);
		}
	} 

}
