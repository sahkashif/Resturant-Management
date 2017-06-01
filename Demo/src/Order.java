import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;


public class Order implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4488466956532915560L;
	public int orderNo;
	public Vector<Item> items=new Vector<Item>();
	public int totalBill=0;
	String fileName;
	Date orderDate;
	Date date=new Date();
	
	SimpleDateFormat show=new SimpleDateFormat("dd.MMM.yyyy");
	File dir=new File(show.format(date));
	
	Order()
	{
		fileName=show.format(date)+" -- "+orderNo+".ser";	
	}
}
