package controller;

import java.util.List;

import javax.ejb.EJB;
import javax.annotation.PostConstruct;

import entity.Player;
import service.PlayerService;
import util.ProgramUtil;

public class PlayerController {

		@EJB
		private PlayerService playerService;
		
		private Player registeredPlayer, pickedPlayer;
		
		private List<Player> players, filteredPlayers;
		
		private ProgramUtil programUtil;
		
		@PostConstruct
		public void init() {
			registeredPlayer = new Player();
			pickedPlayer = new Player();
			players.
		}
		
}
