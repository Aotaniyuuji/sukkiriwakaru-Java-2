package スッキリ分かるJava入門第二部第9章.スッキリ分かるJava入門第二部第9章練習問題;

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	public Thief(String name) {
		this(name, 40, 5);
	}
}
