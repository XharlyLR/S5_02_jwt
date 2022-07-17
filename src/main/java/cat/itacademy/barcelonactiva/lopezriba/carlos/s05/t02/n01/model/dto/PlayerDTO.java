package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.dto;

import java.util.Date;

public class PlayerDTO {

	private long playerID;
	String nomPlayer;
	Date dataRegistre;
	
	public PlayerDTO() { }
	
	public PlayerDTO(String nomPlayer) {
		this.nomPlayer = nomPlayer;
		this.dataRegistre = new Date();
	}

	public long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(long playerID) {
		this.playerID = playerID;
	}

	public String getNomPlayer() {
		return nomPlayer;
	}

	public void setNomPlayer(String nomPlayer) {
		this.nomPlayer = nomPlayer;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}
	
	
	
}
