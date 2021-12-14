package fundamentos;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
	public static void main(String[] args) {
		System.out.println("\nNew exercise\n");
		
		List<Integer> lista=Arrays.asList(1,2,3,5,7,9,6,4,2);
		lista.stream()
		.skip(2)
		.forEach(e-> System.out.println(e));
		
       System.out.println("\nNew exercise: Somente numeros pares\n");
		
		List<Integer> lista2=Arrays.asList(1,2,3,5,7,9,6,4,2);
		lista2.stream()
		.filter(e->e%2==0)
		.forEach(e-> System.out.println(e));
		
		
        System.out.println("\nNew exercise: Pares Verdadeirosn");
		
		List<Integer> lista3=Arrays.asList(1,2,3,5,7,9,6,4,2);
		lista3.stream()
		.map(e->e%2==0)
		.forEach(e-> System.out.println(e));
		
		System.out.println("\nNew exercise: Muliplicar todos por 2");
			
		List<Integer> lista4=Arrays.asList(1,2,3,5,7,9,6,4,2);
		lista4.stream()
		.map(e->e*2)
		.forEach(e-> System.out.println(e));
		
		System.out.println("\nNew exercise: Muliplicar todos por 2");
		
		List<Integer> lista5=Arrays.asList(1,2,3,5,7,9,6,4,2);
		long count =lista5.stream()
		.map(e->e*2)
		.count();
		System.out.println(count);
		
	}
}
