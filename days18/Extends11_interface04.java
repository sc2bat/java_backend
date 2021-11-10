package days18;

interface Repairable{
	
}
// 시험에 나옴

//모든 클래스의 부모클래스 최상위 클래스
abstract class Unit{
	protected int hp; // 현재 체력
	protected int max_hp; // 최대 체력
	
	Unit(int p){
		max_hp = p; // super() 로 호출되고 전달된 체력을 max_hp 에 저장
		hp = (int)(p*0.8);
	}
	
	public void prnHP() {
		System.out.println("최대 체력 : " + max_hp + ", 현재 체력 : " + hp);
	}
	// 이동
	public abstract void move(int x, int y);
	//public void move(int x, int y) {
	//	System.out.println("x : " + x + ", y : " + y + "로 이동합니다");	}
	
}

class GroundUnit extends Unit{
	GroundUnit(int p) { super(p); }
	@Override
	public void move(int x, int y) {
		System.out.println("x : " + x + ", y : " + y + "로 뛰어갑니다");
	}
}
class AirUnit extends Unit{
	AirUnit(int p) { super(p); }
	@Override
	public void move(int x, int y) {
		System.out.println("x : " + x + ", y : " + y + "로 날아갑니다");
	}
	
}
// 탱크 유닛
// implements Repairable 를 통해 자식클래스화
class Tank extends GroundUnit implements Repairable {
	Tank() { super(150); }
	public String toString() {
		return "Tank";
	}
}
// 의료선
class Dropship extends AirUnit implements Repairable {
	Dropship() { super(150); }
	public String toString() {
		return "Dropship";
	}
}
//해병
class Marine extends GroundUnit{
	Marine() { super(40); }
	public String toString() {
		return "Marine";
	}
}
// 건설로봇
class SCV extends GroundUnit implements Repairable {
	SCV() { super(40); }
	public String toString() {
		return "SCV";
	}
	
	// 이렇게 쓰면 유닛마다 만들어야함
//	public void repair(Tank t) {}
//	public void repair(Dropship d) {}
//	public void repair(SCV s) {}
	
	public void repair(Repairable r) {
		if( r instanceof Unit ) {
			Unit u = (Unit)r;
			// Tank, Dropship 이나 SCV 로 형변환 하지 않고
			// HP 와 MAX_HP를 공통적으로 다룰 수 있는 부모클래스 Unit 으로 변환
			if(u.hp != u.max_hp)System.out.println(u + "의 수리를 시작합니다 \n");
			else {
				System.out.println(u + "의 Hp는 Max입니다 \n");
				return;
			}
			while(u.hp != u.max_hp) {
				u.hp += 2;
				System.out.println("체력 2를 repair 했습니다 현재 체력 : " + u.hp);
			}
			System.out.println(u + "의 수리가 끝났습니다 \n");
		}
	}
}



public class Extends11_interface04 {

	public static void main(String[] argrs) {
		/**/
		//
		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV s1 = new SCV();
		SCV s2 = new SCV();
		
		t.prnHP();
		System.out.printf(t.toString() + "이(가) ");
		t.move(10, 20);
		d.prnHP();
		System.out.printf(d.toString() + "이(가) ");
		d.move(5, 15);
		m.prnHP();
		System.out.printf(m.toString() + "이(가) ");
		m.move(15, 20);
		s1.prnHP();
		System.out.printf(s1.toString() + "이(가) ");
		s1.move(10, 35);
//		최대 체력 : 150, 현재 체력 : 120
//		Tank이(가) x : 10, y : 20로 뛰어갑니다
//		최대 체력 : 150, 현재 체력 : 120
//		Dropship이(가) x : 5, y : 15로 날아갑니다
//		최대 체력 : 40, 현재 체력 : 32
//		Marine이(가) x : 15, y : 20로 뛰어갑니다
//		최대 체력 : 40, 현재 체력 : 32
//		SCV이(가) x : 10, y : 35로 뛰어갑니다
		
		s1.repair(t);
		s1.repair(d);
		//s1.repair(m); // 에러
		s1.repair(s2);
		
		
	}

}
