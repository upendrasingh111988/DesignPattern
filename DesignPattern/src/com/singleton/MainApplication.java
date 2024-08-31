package com.singleton;

public class MainApplication {

	public static void main(String[] args) {
		CacheManager cacheInstance = CacheManager.getInstance();
		
        // Add some data to the cache
		cacheInstance.put("userId_123", "John Doe");
		cacheInstance.put("sessionToken", "ABC123XYZ");
		
		// Retrieve data from the cache
        String userName = (String) cacheInstance.get("userId_123");
        String sessionToken = (String) cacheInstance.get("sessionToken");

        // Check if a key is in the cache
        if (cacheInstance.containsKey("userId_123")) {
            System.out.println("User Name: " + userName);
        }

        // Remove data from the cache
        cacheInstance.remove("sessionToken");

        // Clear the entire cache
        cacheInstance.clear();
    

	}

}
