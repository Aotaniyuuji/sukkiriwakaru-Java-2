package スッキリ分かるJava入門第二部第10章;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた!");
	}
	public final void slip() { //finalがついているのでオーバーライドできない
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ");
	}
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した!");
	}
}
