package スッキリ分かるJava入門第二部第8章;

public class Main {
	public static void main(String[] args) {
		//勇者生成と初期化
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		
		//敵A(一匹目)を生成と初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		//敵B(二匹目)を生成と初期化
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}