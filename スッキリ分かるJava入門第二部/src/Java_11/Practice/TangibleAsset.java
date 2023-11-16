package Java_11.Practice;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	
	//コンストラクタ
	public  TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	//メソッド
	public abstract String getName();
	public abstract int getPrice();
	public abstract String gerColor();
}
