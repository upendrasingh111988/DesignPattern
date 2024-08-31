package com.singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
	
	// The single instance of this class
	private static volatile CacheManager instance;
	
	// The actual cache storage
	private Map<String, Object> cache;

	// Private constructor to prevent instantiation
	private CacheManager() {
		cache= new HashMap<>();
	}
	  // Public method to provide access to the instance
	public static CacheManager getInstance() {
		
		if(instance==null) {
			
			synchronized (CacheManager.class) {
				if(instance==null) {
					instance= new CacheManager();
				}
				
			}
		}
		return instance;
	}
	// Method to add data to the cache
	public void put(String key , Object value) {
		cache.put(key, value);
	}
	
	// Method to retrieve data from the cache
    public Object get(String key) {
        return cache.get(key);
    }

    // Method to check if the cache contains a key
    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    // Method to remove data from the cache
    public void remove(String key) {
        cache.remove(key);
    }

    // Method to clear the cache
    public void clear() {
        cache.clear();
    }

}
