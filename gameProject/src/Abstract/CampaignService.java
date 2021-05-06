package Abstract;

import Entity.campaign;

public interface CampaignService {
	void add(campaign campaign,Product product);
	void delete(campaign campaign,Product product);
	campaign update(campaign campaign,double discount,String name);
	void addToAll(campaign campaign);
	campaign newCampaign(String id,double discount,String name);

}
