import java.awt.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
 
public class StreamPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//print numbers from 1 to 10
		
		/*
		 * IntStream .range(1,10) .forEach(System.out::println);
		 * 
		 * System.out.println();
		 * 
		 */
		
		
		// print from  6 to 9
		/*
		 * IntStream .range(1, 10) .skip(5) // will skip from 1 to 5
		 * .forEach(System.out::println);
		 */
		
		
		
		// print the sum out
		//1+2+3+4
		
		/*
		 * System.out.println( IntStream .range(1, 5) .sum());
		 * 
		 */
		
		
		// sort from given strings
		
		/*
		 * Stream.of("balda","arzeesh","tom") // if its capital then capitalised will be 1st
		 *  .sorted() // will sort it and print out 1st element so arzeesh
		 * .findFirst() 
		 * .ifPresent(System.out::println);
		 */
		
		
		// stream a array then sort filter and print
		
		/*
		 * String[] names = {"Rafed","Singh","Sakib","Farid","Layla","Lily"};
		 * Arrays.stream(names) // same as Stream.of(names) .filter(x->
		 * x.startsWith("L")) // filter out items starting with L and sort them
		 * .sorted() .forEach(System.out::println);
		 */
		
		
		// avg of sqs on an int array
		/*
		 * Arrays.stream(new int[]{2,4,6,8,10}) // sq all of these and find avg
		 *  .map(x-> x*x) 
		 *  .average() 
		 *  .ifPresent(System.out::println);
		 */

	// stream from array filter them and print
		
		/*
		 * String[] names =
		 * {"Azhar","Abir","Bianca","Chloe","David","Eleanor","Fairy","Goliath"};
		 * Arrays.stream(names) // convert to lowercase "a" 
		 * .map(String::toLowerCase)
		 * .filter(x->x.startsWith("a")) 
		 * .forEach(System.out::println);
		 */
		
		// use reduction  to add doubles
		
		double total = Stream.of(7.3, 1.5, 4.8)
				.reduce( 1.0, (Double a, Double b) -> a+b); //  1st arg will adjust  and add 1
	            System.out.println("Total = "+ total);
				
	}
	

}
