package スッキリ分かるJava入門第二部第9章;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は" + sword + "で攻撃した!");
	}
}
