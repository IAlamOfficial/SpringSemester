package testReview;

import java.util.ArrayList;

public class ListRunner {

	/*
	 * NOTE!!!
	 * ConstructorTest = Item
	 */
	
	static ArrayList<ConstructorTest> shoppingList;
	
	public static void main(String[] args) {
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchaseItems();
	}
	private static void printPurchaseItems() {
		for(int i = 0; i <shoppingList.size(); i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println("Bought "+shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
			
		}
		
	}
	private static void doSomeShopping() {
		shoppingList.get(0).setPurchase(true);
		shoppingList.get(3).setPurchase(true);
		
	}
	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<ConstructorTest>();
		for(String s: justDescriptions){
			shoppingList.add(new ConstructorTest(s));
		}
		
	}
	private static String[] getDescriptions() {
		String[] test = {"1","2","3","4"};
		return test;
	}

}
