package スッキリ分かるJava入門第二部第9章.スッキリ分かるJava入門第二部第9章練習問題;

public class Main {
	public static void main(String[] args) {
		Thief t1 = new Thief("ユウジ", 100, 30);
		System.out.println("盗賊1のステータスは" + t1.name + "、" + t1.hp + "、" + t1.mp);
		
		Thief t2 = new Thief("ショウゴ", 100);
		System.out.println("盗賊2のステータスは" + t2.name + "、" + t2.hp + "、" + t2.mp);
		
		Thief t3 = new Thief("ブン");
		System.out.println("盗賊3のステータスは" + t3.name + "、" + t3.hp + "、" + t3.mp);
	}
}
