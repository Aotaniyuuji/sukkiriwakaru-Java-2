package Java_11.Practice;

public abstract class TangibleAsset extends Asset{
	String color;
	
	//コンストラクタ
	public  TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	//メソッド
	public String gerColor() { return this.color; }
}
