
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class TestIKM {

	
	public static void main(String[] args) throws IOException {
		
		

		
       // floyds triangle
	
		/*
		 * int n, c, d, num=1;
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("wat do u wanna print"); n = sc.nextInt();
		 * System.out.println("Floyds triangle");
		 * 
		 * for (int a = 1; a <= n; a++) { for (int i = 1; i <=a ; i++) {
		 * System.out.print(num+" "); num++; } System.out.println( " "); }
		 * 
		 * 
		 */
		
		// find duplicates in an array
		
		/*
		 * String duplicates[] = new String[]{"bal","spring","hibernate","bal"}; Set
		 * nonDuplicates = new HashSet<>(); Set duplicateSet = new HashSet<>(); for
		 * (String st : duplicates) { if(!nonDuplicates.contains(st)) {
		 * 
		 * nonDuplicates.add(st);
		 * 
		 * }
		 * 
		 * else { duplicateSet.add(st); } } System.out.println(duplicateSet);
		 */
		
		
		// reverse an array
		/*
		 * int array [] = {1,2,3,4,5};
		 * 
		 * int temp; int start = 0; int end= array.length-1; while(start<end) { temp =
		 * array[start]; array[start] = array[end]; array[end] = temp;
		 * 
		 * start++; end--;
		 * 
		 * }
		 * 
		 * System.out.println("printing array"); for (int i = 0; i < array.length; i++)
		 * { System.out.print(array[i]); }
		 */
		
		
		// pyramid pattern numbers
		
		/*
		 * int n=5 ; for (int a = n; a > 0; a--) { for (int i = 1; i <=a ; i++) {
		 * 
		 * System.out.print(i+" ");
		 * 
		 * }
		 * 
		 * System.out.println( " "); }
		 */
		  
		// check to see if stirng is palindrome
		/*
		 * String empty = ""; String og = "aia"; for (int i = og.length()-1 ; i>=0 ;i--)
		 * { empty = empty+ og.charAt(i);
		 * 
		 * } if(og.equals(empty)) { System.out.println("Yeah its a palindrome");
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * System.out.println("Sorry its not a palindrome"); }
		 */
		 
		
	            
		// 	reverse a sentence
		/*
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("ENTER SOMETHING"); String str = bf.readLine();
		 * 
		 * String words[] =str.split(" "); System.err.println("reverse word is ");
		 * 
		 * for (int i = words.length-1; i >=0; i--) { System.out.print(words[i] + " ");
		 * }
		 */
		
		
		// sort hashmap keys   // to sort by values use comparator
		
		Map<String,Integer> unsorted = new HashMap<>();
		unsorted.put("zaki", 1);
		unsorted.put("bal", 24);
		unsorted.put("jennifer", 4);
		unsorted.put("hasan", 5);
		
		/*
		 * for(Map.Entry<String, Integer> entry: unsorted.entrySet()) {
		 * 
		 * System.out.println(" UNSORTED key  " + entry.getKey()+" "+entry.getValue());
		 * }
		 * 
		 * Map<String,Integer> treemap = new TreeMap<String,Integer>(unsorted);
		 * 
		 * for(Map.Entry<String, Integer> e: treemap.entrySet()) {
		 * 
		 * System.out.println(" SORTED KEY " + e.getKey()); }
		 */
		
		
		// sort by values
		// made a list of the of unsorted hashmap
		  List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(unsorted.entrySet()); 
		  
		  //used comparator
		  Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } });
		
		// put the sorted values in linked hashmap
		  HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        }
	        
	        // print out the hashmap
	        for (Map.Entry<String, Integer> en : temp.entrySet()) { 
	            System.out.println("Key = " + en.getKey() +  
	                          ", Value = " + en.getValue()); 
	        } 
	}
	

}