package Concrete;

import Abstract.Product;
import Abstract.User;

public class SalesManager {
	
	public void buyProduct(User user,Product product) {
		user.setGames(product);
		System.out.println(product.getName()+" Oyunu "+user.getNickname()+" Adli kullanicinin hesabina eklendi");
		
	}
	public void bulkBuyProduct(User user,Product[] products) {
		
		for(Product product : products) {
			user.setGames(product);
		}
	}

}
