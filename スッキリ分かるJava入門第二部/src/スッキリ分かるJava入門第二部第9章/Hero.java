package スッキリ分かるJava入門第二部第9章;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は" + sword + "で攻撃した!");
	}
	
	//コンストラクタという
	public Hero() { //HeroクラスにHero()メソッドを定義することでnewされた直後に自動的に実行される
		this.hp = 100;
	}
}
