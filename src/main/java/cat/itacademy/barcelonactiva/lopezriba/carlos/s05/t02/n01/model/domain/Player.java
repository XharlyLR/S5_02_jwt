package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long playerID;
	
	@Column(name = "nom_player")
	String nomPlayer = "ANÒNIM";
	
	@Column
	Date dataRegistre;
	
	@Column
	int percExit;
	
	@Column
	int tirades;	

	private int tiradesExit;
	
	public int getPercExit() {
		return percExit;
	}

	public void setPercExit(int tiradesExit) {
		this.tiradesExit += tiradesExit;
		
		this.tirades++;
		
		this.percExit = (int) ((float) ((float) this.tiradesExit / (float) tirades) * 100);
	}

	public Player() {
	}

	public Player(String nomPlayer) {
		this.nomPlayer = nomPlayer;
		this.dataRegistre = new Date();
		this.tirades = 0;
		this.percExit = 0;
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

	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", nomPlayer=" + nomPlayer + ", dataRegistre=" + dataRegistre + "]";
	}

	
}
