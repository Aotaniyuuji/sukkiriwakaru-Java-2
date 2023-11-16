package Java_11;

public class PrincessHero 
implements Hero, Princess, Character {
	String name;
	public void run() {
		System.out.println(this.name + "は裾を結び、全力で逃げた");
	}
	public void attack (Matango m) {
		
	}
}
