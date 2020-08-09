package service;

import entity.Player;
import javax.ejb.Stateless;

@Stateless
public class PlayerService extends TemplateService<Player> {
	
	public PlayerService() {
		super(Player.class);
	}
	
}
