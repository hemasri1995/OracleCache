//Importing java util module
import java.util.*;

//LRUCache class 
public class LRUCache {
	
		
		//LinkedHashMap class variable to store data
		LinkedHashMap<Integer, String> cache;
		//cache size
	    int capacity;
	    
	    //Initialize cache object with size.
	    public void CreateCache(int capacity)
	    {
	    	 this.cache = new LinkedHashMap<Integer, String>(capacity);
		     this.capacity = capacity;
	    }
	    
	    // returns the value based on the available key. If key doesn't exist return "-1"
	    public String get(int key)
	    {
	    	String s = this.cache.get(key);
	    	if(s==null)
	    	{
	    		return "-1";
	    	}
	    	else {
	    		return s;
	    	}
	    }
	    
	    //stores the entry in the cache.
	    public void put(int key, String value)
	    {
	    	//if key is new entry then checks for capacity and adds based on LRU add logic
	    	if(this.get(key) == "-1") {
	    		
	    		if (this.cache.size() == capacity) {
	    			Set<Integer> tempkeys = this.cache.keySet();
	    			int firstKey = 0;
	    			for(int tk:tempkeys) {
	    				firstKey = tk;
	    				break;
	    			}
	    			this.cache.remove(firstKey);
	    		}
	    		this.cache.put(key,value);
	    	}
	    	//if key already exists, removes and adds again to make it most recent element.
	    	else {
	    		this.cache.remove(key);
	            this.cache.put(key,value);
	    	}
	    }
	  
	    //methods to display all cache data at any given point
	    public void display()
	    {
	    
	    	Set<Integer> tempkeys = this.cache.keySet();
			for(int tk:tempkeys) {
				System.out.print(tk+"   "+this.cache.get(tk));
				System.out.println(" ");
			}
			
	    }
	      

	    //main method to test LRUCache 
	    public static void main(String[] args)
	    {
	        LRUCache ca = new LRUCache();
	        ca.CreateCache(4);
	        
	        ca.put(1, "Oracle");
	        ca.put(2, "Siebel");
	        ca.put(3, "Netsuite");
	        ca.put(1, "Oracle");
	        ca.put(4, "Hyperion");
	        ca.put(5, "People Soft");
	        
	        ca.display();
	        
	        
	    }
} 