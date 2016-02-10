package com.InterviewF;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class FrequentWords {

	
	public static void main(String[] args) {
		
		String [] s = new String[]{"puri","puri","puri","puri","puri","puri","Welcome","to","the","world","of","Geeks","This","portal","has","been","created","to","provide","well","written","well","thought","and","well","explained","solutions","for","selected","questions","If","you","like","Geeks","for","Geeks","and","would","like","to","contribute","here","is","your","chance","You","can","write","article","and","mail","your","article","to","contribute","at","geeksforgeeks","org","See","your","article","appearing","on","the","Geeks","for","Geeks","main","page","and","help","thousands","of","other","Geeks"};
		
		Map<String, Integer>  map = new HashMap<String, Integer> ();
		
		// Putting all the words and there count in a Hash Map
		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])){
				int temp =map.get(s[i]);
				map.put(s[i],temp+1 );
			}else map.put(s[i], 1);
		}
		
		// get maximum occurrence of any word i.e. max value in the hashmap
		  int max=getMax(map);

		  // new array of type linked List of size max+1
		  LinkedList<String>[] arr = new LinkedList[max+1];
		  // initially all the value should be null
		  Arrays.fill(arr, null);
		  
		  // create a linked list at every array element and
		  //put all the words whose count is arr index i that linked list
		  
		  for (Entry<String, Integer> entry : map.entrySet())	{
				  if(arr[entry.getValue()] == null) {
					arr[entry.getValue()] = new LinkedList<String>();
					arr[entry.getValue()].add(entry.getKey());
				} else {
					arr[entry.getValue()].add(entry.getKey());
					
				}
			  }
		// top k words you want to print 
		  int k=10;
		  int counter=0;
		  // printing top k elements
		  for (int i = arr.length-1; i >-1 && counter<k; i--) {
			  if(arr[i]!=null){
			Iterator<String> iterator = arr[i].iterator();
			      while (iterator.hasNext()) {
		            System.out.println(iterator.next()+" ");
		            counter++;
		        }
			  }
		}
	}
	
	private static int getMax(Map<String, Integer> map) {
		int max=0;
		for (Entry<String, Integer> entry : map.entrySet())	{
			if(entry.getValue() > max ) max= entry.getValue();
		  }
		return max;
	}
}