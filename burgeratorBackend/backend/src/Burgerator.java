import java.util.*;


public class Burgerator {
	
	//map of all burgerator params
	HashMap<String, String> burgerMap;
	
	public Burgerator(){
		burgerMap = new HashMap<>();
		
		//populate map with keys
		burgerMap.put("useremail", null);
		burgerMap.put("restaurantId", null);
		burgerMap.put("burgerName", null);
		burgerMap.put("restaurantName", null);
		burgerMap.put("restaurantImageUrl", null);
		burgerMap.put("restaurantAddress", null);
		burgerMap.put("restaurantCity", null);
		burgerMap.put("restaurantZip", null);
		burgerMap.put("cheese", null);
		burgerMap.put("fries", null);
		burgerMap.put("size", null);
		burgerMap.put("bun", null);
		burgerMap.put("ratio", null);
		burgerMap.put("price", null);
		burgerMap.put("taste", null);
		burgerMap.put("ambience", null);
		burgerMap.put("friesrate", null);
		burgerMap.put("bunrate", null);
		burgerMap.put("donenessRequested", null);
		burgerMap.put("donenessReceived", null);
		burgerMap.put("presentation", null);
		burgerMap.put("toppings", null);
		burgerMap.put("sauces", null);
		burgerMap.put("juicyness", null);
		burgerMap.put("service", null);
		burgerMap.put("wycbftb", null);
		burgerMap.put("comment", null);
		burgerMap.put("image", null);
		burgerMap.put("imageUrl", null);
		burgerMap.put("date", null);
	}
	
	public void setVal(String _key, String _val){
		try{
			burgerMap.put(_key, _val);
		}catch(Exception e){
			System.out.println("Error adding k/v to burgerMap; " + e);
		}
	}
	
	public HashMap<String, String> getBurgerMap(){
		return this.burgerMap;
	}

}
