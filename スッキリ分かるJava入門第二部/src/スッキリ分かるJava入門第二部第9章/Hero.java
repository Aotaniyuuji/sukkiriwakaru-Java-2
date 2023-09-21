package スッキリ分かるJava入門第二部第9章;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は" + sword + "で攻撃した!");
	}
	
	//コンストラクタ1
	public Hero(String name) { //HeroクラスにHero()メソッドを定義することでnewされた直後に自動的に実行される。nameは毎回異なるので引数で受け取れるようにする
		this.hp = 100;
		this.name = name;
	}
	
	//コンストラクタ2(オーバーロード)
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
}
