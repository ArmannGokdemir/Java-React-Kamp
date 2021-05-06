package gameProject;

import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.CampaignService;
import Abstract.Product;
import Abstract.UserCheckService;
import Abstract.UserManager;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entity.Game;
import Entity.Gamer;
import Entity.campaign;

public class Main {

	public static void main(String[] args) {
		
		campaign campaign = new campaign("1",0.15,"Rocket League Kampanyası");
		CampaignService campaignManager = new CampaignManager();
		SalesManager salesManager = new SalesManager();
		UserManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		campaign campaign2=campaignManager.newCampaign("2", 0.5, "Insurgency Kampanyasi");
		
		
		
		Gamer gamer = new Gamer(1,"Arman","Gökdemir",(Date) new GregorianCalendar(1999, 02 , 17).getTime(),"00000000000","0","armangokde@arman.com","bilmemkine");
		gamerManager.register(gamer);
		
		
		Product game = new Game();
		game.setId(1);
		game.setName("Rocket League");
		game.setDetails("Arabalar var top var oyun");
		game.setPrice(35);
		System.out.println(game.getName()+" oyununun fiyatı : "+game.getDiscountPrice());
		
		gamerManager.update(gamer, "bendebilmem", gamer.getMail());
		campaignManager.add(campaign, game);
		
		
		System.out.println(game.getName()+" oyununun fiyatı : "+game.getDiscountPrice());
		Product game2 =new Game();
		game2.setId(2);
		game2.setName("Insurgency:Sandstorm");
		game2.setDetails("FPS CQB Game");
		game2.setPrice(72);
		campaignManager.add(campaign2, game2);
		salesManager.buyProduct(gamer, game);
		
		campaignManager.delete(campaign2, game2);
		for(campaign campaign5 : mainSystem.getCampaigns()) {
			System.out.println(campaign5.getName());
		}
		campaign=campaignManager.update(campaign, campaign.getDiscount(), "Rocket League son kampanya");
		for(campaign campaign5 : mainSystem.getCampaigns()) {
			System.out.println(campaign5.getName());
		}
		
		
		
		
		
	}	

}
