package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daus")
public class Daus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long dausID;
	
	@Column
	private int dau1;
	
	@Column
	private int dau2;
	
	@Column
	private Boolean guanyat;
	
	@Column
	private long playerID;

	public Daus() { }
	
	public Daus(long playerID) {
		this.dau1 = 1 + (int)(Math.random() * 6);
		this.dau2 = 1 + (int)(Math.random() * 6);
		this.playerID = playerID;

		if (this.dau1 + this.dau2 == 7)
			this.guanyat = true;
		else
			this.guanyat = false;
	}

	public long getDausID() {
		return dausID;
	}

	public void setDausID(long dausID) {
		this.dausID = dausID;
	}

	public int getDau1() {
		return dau1;
	}

	public void setDau1(int dau1) {
		this.dau1 = dau1;
	}

	public int getDau2() {
		return dau2;
	}

	public void setDau2(int dau2) {
		this.dau2 = dau2;
	}

	public long getPlayerID() {
		return playerID;
	}

	public void setPlayer(long playerID) {
		this.playerID = playerID;
	}

	public boolean getExit() {
		return guanyat;
	}

	public void setExit(boolean exit) {
		this.guanyat = exit;
	}
	
	
}
