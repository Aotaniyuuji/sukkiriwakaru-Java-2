package スッキリ分かるJava入門第二部第10章;

public class SuperHero extends Hero {
	boolean flying;
	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
	//子クラスでメソッドの上書き(オーバーライド)
	public void run() {
		System.out.println(this.name + "は撤退した!");
	}
}
