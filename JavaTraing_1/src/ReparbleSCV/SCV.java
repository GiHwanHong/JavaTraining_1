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
				//������ HP�� ����.
				u.hitpoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}

}
