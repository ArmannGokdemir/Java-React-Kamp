package Concrete;

import java.util.Vector;

import Abstract.Product;
import Abstract.ProductService;
import gameProject.mainSystem;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		mainSystem.setGames(product);
		System.out.println(product.getName()+ " Oyunu sisteme eklendi");
		
	}

	@Override
	public void delete(Product product) {
		Vector<Product> vector=new Vector(mainSystem.getGames());
		vector.remove(product);
		System.out.println(product.getName()+ " Oyunu sistemden silindi");
		
	}

	@Override
	public void update(Product product, double price, String name, String details) {
		Vector<Product> vector=new Vector(mainSystem.getGames());
		
		for(Product products : vector) {
			if(products.getId() ==product.getId() ) {
				products.setDetails(details);
				products.setName(name);
				products.setPrice(price);
			}
			
		}
		
	}

}
