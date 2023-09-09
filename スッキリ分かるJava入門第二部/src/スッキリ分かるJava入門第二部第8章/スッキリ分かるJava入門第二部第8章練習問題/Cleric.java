package スッキリ分かるJava入門第二部第8章.スッキリ分かるJava入門第二部第8章練習問題;

import java.util.Random;

public class Cleric {
	String name;
	int hp;
	final int MAXHP = 10;
	int mp;
	final int MAXMP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println(this.name + "は、体力が満タンになった！");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った");
		//ここより下から解答見た
		
		//論理上の回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;
		
		//実際の回復量を計算する
		int recoverActual  = Math.min(this.MAXMP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
