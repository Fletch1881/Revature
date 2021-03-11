package com.demo.main;

import java.util.List;

import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;
import com.demo.playerdao.impl.PlayerDAOImpl;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerDAO dao=new PlayerDAOImpl();
		
		
		// Testing the addPlayer function //
		/*Player p = new Player(110, "Raj", 23, "Bangalore", "M");
		
		int c = dao.addPlayer(p);
		if(c > 0) {
			System.out.println("Player Registered with below details");
			System.out.println(p);
		}else {
			System.out.println("Failure in register");
		}*/
		
		
		// Testing the getPlayerById function //
		/*int id = 103;
		Player player=dao.getPlayerById(id);
		if(player==null) {
			System.out.println("No player found with id "+id);
		}else {
			System.out.println("Player found with id = "+ id+ "and the details are below: ");
			System.out.println(player);
		}*/
		
		
		
		// Testing the updatePlayerCity function //
		/*String newCity = "Bangalore";
		int id = 104;
		int c = dao.updatePlayerCity(id, newCity);
		if(c > 0) {
			System.out.println("Player with id "+id+"'s city has been updated to "+newCity);
		}else {
			System.out.println("Failure in update");
		}*/
		
		
		// Testing the deletePlayerById function //
		/*int id = 109;
		int c = dao.deletePlayerById(id);
		if(c > 0) {
			System.out.println("Player with id "+id+" city has been deleted");
		}else {
			System.out.println("Failure in delete");
		}*/
		
		
		
		// Testing the getAllPlayers function //
		/*List<Player> playerList= dao.getAllPlayers();
		if(playerList.size()==0) {
			System.out.println("No players as of now in DB");
		}else {
			System.out.println("Total there are "+playerList.size()+" number of player/s in DB");
			System.out.println("Printing their details:");
			for(Player p: playerList) {
				System.out.println(p);
			}
		}*/
		
		
		
		// Testing the getAllPlayersByAge function //
		/*int age = 23;
		List<Player> playerList= dao.getAllPlayersByAge(age);
		if(playerList.size()==0) {
			System.out.println("No players in the DB with age "+age);
		}else {
			System.out.println("Total there are "+playerList.size()+" number of player/s in DB with age "+age);
			System.out.println("Printing their details:");
			for(Player p: playerList) {
				System.out.println(p);
			}
		}*/
		
		
		// Testing the getAllPlayersByTeamName //
		/*String teamName = "ABC Riders";
		List<Player> playerList= dao.getAllPlayersByTeamName(teamName);
		if(playerList.size()==0) {
			System.out.println("No players in the DB with team name "+teamName);
		}else {
			System.out.println("Total there are "+playerList.size()+" number of player/s in DB with team name "+teamName);
			System.out.println("Printing their details:");
			for(Player p: playerList) {
				System.out.println(p);
			}
		}*/
		
		
		// Testing the getAllPlayersByTeamLocation //
		/*String teamLocation = "Chennai";
		List<Player> playerList= dao.getAllPlayersByTeamLocation(teamLocation);
		if(playerList.size()==0) {
			System.out.println("No players in the DB with team location "+teamLocation);
		}else {
			System.out.println("Total there are "+playerList.size()+" number of player/s in DB with team location "+teamLocation);
			System.out.println("Printing their details:");
			for(Player p: playerList) {
				System.out.println(p);
			}
		}*/
		
		
		// Testing the getAllPlayersByTeamId //
		/*String teamId = "T0001";
		List<Player> playerList= dao.getAllPlayersByTeamId(teamId);
		if(playerList.size()==0) {
			System.out.println("No players in the DB with team id "+teamId);
		}else {
			System.out.println("Total there are "+playerList.size()+" number of player/s in DB with team id "+teamId);
			System.out.println("Printing their details:");
			for(Player p: playerList) {
				System.out.println(p);
			}
		}*/
		
		
		
		// Testing the getAllPlayersByCity //
		String city = "Bangalore";
		List<Player> playerList= dao.getAllPlayersByCity(city);
		if(playerList.size()==0) {
			System.out.println("No players in the DB with city "+city);
		}else {
			System.out.println("Total there are "+playerList.size()+" number of player/s in DB with city "+city);
			System.out.println("Printing their details:");
			for(Player p: playerList) {
				System.out.println(p);
			}
		}
		
		
	}

}
