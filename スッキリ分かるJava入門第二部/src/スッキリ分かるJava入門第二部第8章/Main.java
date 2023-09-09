package スッキリ分かるJava入門第二部第8章;

public class Main {
	public static void main(String[] args) {
		//1.勇者インスタンスを生成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました!");
		//3.勇者のメソッドを呼び出していく
		h.sit(5); //この場合は5秒座れ
		h.slip();
		h.sit(25);
		h.run();
	}
}