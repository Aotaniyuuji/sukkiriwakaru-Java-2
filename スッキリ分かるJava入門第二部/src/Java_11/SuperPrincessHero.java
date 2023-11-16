package Java_11;
//継承と実装を同時に行う
public class SuperPrincessHero extends PrincessHero implements Human{
	public void talk() {
		System.out.println(this.name + "は楽しそうに話している");
	}
	
	public void watch() {
		System.out.println(this.name + "はモンスターを観察している");
	}
	public void hear() {
		System.out.println(this.name + "は静かに耳を澄ましている");
	}
}
