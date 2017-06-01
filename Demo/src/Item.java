import java.io.Serializable;


public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public int price;
	public int quantity=0;
	public int totalPrice=0;
	public boolean checkedValue=false;
	Item(){};
	
	Item(String n,int m,int o,boolean val){
		name=n;
		price=m;
		quantity=o;
		checkedValue=val;
		totalPrice=price*quantity;
	};

}
