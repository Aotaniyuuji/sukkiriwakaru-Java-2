package スッキリ分かるJava入門第二部第9章;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");//コンストラクタは直接呼び出せないので、newするときに引数を指定する
		System.out.println(h1.name);
		
		Hero h2 = new Hero();
		System.out.println(h2.name);
	}
}
