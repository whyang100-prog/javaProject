package extendex.instarray;

public class Goods {
	String name;
	int price,stock,sold;
	
	public Goods(String name,int price,int stock,int sold) {
		this.name=name;
		this.stock=stock;
		this.price=price;
		this.sold=sold;

	}
	public void showGoodsInfo() {
		System.out.println(name+"");
		System.out.println(price+"");
		System.out.println(stock+"");
		System.out.println(sold+"");

	}

}
