package Concrete;

import Abstract.CampaignService;
import Abstract.Product;
import Entity.campaign;
import gameProject.mainSystem;

public class CampaignManager implements CampaignService {

	@Override
	public void add(campaign campaign,Product product) {
		System.out.println("Kampanya eklendi "+campaign.getName());
		mainSystem.setCampaigns(campaign);
		product.setCampaign(campaign);
		product.setDiscountPrice(product.getPrice()-(product.getPrice()*campaign.getDiscount()));
	}

	@Override
	public void delete(campaign campaign,Product product) {
		System.out.println("Kampanya silindi "+campaign.getName());
		product.setDiscountPrice(product.getPrice());
		product.setCampaign(null);
		
		mainSystem.getCampaigns().remove(campaign);
		
	}

	@Override
	public campaign update(campaign campaign,double discount,String name) {
		campaign.setDiscount(discount);
		campaign.setName(name);
		for(campaign campaign5 : mainSystem.getCampaigns()) {
			if(campaign5.getId() == campaign.getId()) {
				campaign5.setDiscount(discount);
				campaign5.setName(name);
			}
		}
		return campaign;
		
	}

	@Override
	public void addToAll(campaign campaign) {
		for(Product products : mainSystem.getGames()) {
			this.add(campaign, products);
		}
		
	}

	@Override
	public campaign newCampaign(String id,double discount,String name) {
		
		campaign campaign = new campaign(id,discount,name);
		System.out.println(campaign.getName()+" Adli kampanya olusturuldu.");
		return campaign;
		
	}

	

}
