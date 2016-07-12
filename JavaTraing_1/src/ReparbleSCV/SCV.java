package ReparbleSCV;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitpoint = MAX_HP;
	}
	void repair(Repairable r){
		if(r instanceof Unit){
			Unit u = (Unit)r;
			while (u.hitpoint != u.MAX_HP) {
				//유닛의 HP를 증가.
				u.hitpoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}

}
