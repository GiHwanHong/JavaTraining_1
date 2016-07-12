package ReparbleSCV;

public class Dropship extends AirUnit implements Repairable {
	public Dropship() {
		super(125);
		hitpoint = MAX_HP;
	}
	public String toString(){
		return "DropShip";
	}
}
