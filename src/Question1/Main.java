package Question1;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void fun(List<? extends Number> num) {
		for(Number item:num) {
			System.out.println(item);
		}
		
	}
	
   public static void main(String[] args) {
	   
	   List<Integer> it=Arrays.asList(1,2,4,5,6,7);
	   List<Number> m=Arrays.asList(1,2,4,5232);
	   
	   fun(it);
	   fun(m);
	
}

}
