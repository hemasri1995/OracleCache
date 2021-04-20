import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
	
	
	@Test
	public void testAdd1Plus1() 
	{
	    
	    
	    LRUCache ca = new LRUCache();
        ca.CreateCache(4);
        
        ca.put(1, "Oracle");
        assertEquals("Oracle", ca.get(1));
        
        ca.put(2, "Siebel");
        assertEquals("Siebel", ca.get(2));
        
        ca.put(3, "Netsuite");
        assertEquals("Netsuite", ca.get(3));
        
        ca.put(1, "Oracle");
        assertEquals("Oracle", ca.get(1));
        
        ca.put(4, "Hyperion");
        assertEquals("Hyperion", ca.get(4));
        
        ca.put(5, "People Soft");
        assertEquals("People Soft", ca.get(5));
        assertEquals("-1", ca.get(2));
        
  
	}
}
