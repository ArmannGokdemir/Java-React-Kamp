package gameProject;

import java.util.Vector;

import Abstract.Product;
import Abstract.User;
import Entity.campaign;

public  class mainSystem {
	
private static Vector<Product> products=new Vector();
private static Vector<User> users =new Vector();
private static Vector<campaign> campaigns=new Vector();

public static Vector<campaign> getCampaigns() {
	return campaigns;
}
public static void setCampaigns(campaign campaign) {
	mainSystem.campaigns.add(campaign);
}
public  static Vector<Product> getGames() {
	return products;
}
public static void setGames(Product product) {
	mainSystem.products.add(product);
}
public static Vector<User> getUsers() {
	return users;
}
public static void setUsers(User user) {
	mainSystem.users.add(user);
}



}
