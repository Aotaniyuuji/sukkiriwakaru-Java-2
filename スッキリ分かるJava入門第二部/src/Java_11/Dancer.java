package Java_11;

public class Dancer 
implements Character {
	String name;
	int hp;
	public void dance() {
		System.out.println(this.name + "は舞を披露した！");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void run() {
		System.out.println();
	}
}
