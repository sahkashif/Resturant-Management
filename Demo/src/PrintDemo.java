import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;





public class PrintDemo implements Printable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Vector<Item> tmp;
	
	Date nDate=new Date();
	SimpleDateFormat nDtFormat=new SimpleDateFormat("dd.MMM.yyyy");
	SimpleDateFormat monthFormat=new SimpleDateFormat("MMMMMMMMMM");
	SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm a");
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

	      if (pageIndex < 0 || pageIndex >= 1) {
	            return Printable.NO_SUCH_PAGE;
	        }

	        if(!(OrderWindow.billPrint.getText().equals("0 tk")))
	        {
	        	Graphics2D g2d = (Graphics2D) graphics;
		        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

		        Font header = new Font("Segoe Script",Font.BOLD, 22);
		        Font total = new Font("Courier",Font.PLAIN, 10);
		        Font item = new Font("Courier",Font.PLAIN, 10);
		        Font coders = new Font("Verdana",Font.PLAIN, 7);
		        
		        g2d.setFont(header);
		        g2d.setColor(Color.RED);
		        //g2d.drawLine(10, 20,170,20);
		        g2d.drawString("MAAZA" ,43, 15);
		        g2d.setFont(total);
		        g2d.drawString(nDtFormat.format(new Date()),10, 28);
		        g2d.drawString(dateFormat.format(new Date()),120, 28);
		        
		        int y=50;
		        int value=0;
		        
		        
		        
		        
		        try {
		        	File f=new File("store//tmp.ser");
					FileReader fr=new FileReader(f);
					FileInputStream fi=new FileInputStream(f);
					ObjectInputStream ois=new ObjectInputStream(fi);
					Order o=(Order)ois.readObject();
					
					tmp=o.items;
					value=o.totalBill;
					ois.close();
					fi.close();
					fr.close();
					ois=null;
					fi=null;
					fr=null;
				} catch (FileNotFoundException e) {
				
					JOptionPane.showMessageDialog(null,"Printing error !!");
				} catch (IOException e) {
				
					JOptionPane.showMessageDialog(null,"Printing error !!");
				} catch (ClassNotFoundException e) {
				
					JOptionPane.showMessageDialog(null,"Printing error !!");
				}
		        g2d.setFont(item);
		        g2d.setColor(Color.BLACK);
		        for(int i=0;i<tmp.size();i++)
		        {
		        	
		        	g2d.drawString(tmp.elementAt(i).name, 10,y);
		        	g2d.drawString(tmp.elementAt(i).quantity+"ps",150,y);
		        	y+=13;
		        }
		        for(int del=0;del<tmp.size();del++)
		        {
		        	tmp.remove(del);
		        }
		        g2d.setFont(total);
		        g2d.drawLine(10,(y+13),170,(y+13));
		        g2d.drawString("Total", 35,(y+26));
		        g2d.drawString(value+"tk", 100,(y+26));
		        
		        g2d.setFont(coders);
		        g2d.drawString("developed by CODERS",90,(y+55));
		        //fD.delete();
		        return Printable.PAGE_EXISTS;
	        }
	        JOptionPane.showMessageDialog(null,"No order has been taken!!");
	       	return Printable.NO_SUCH_PAGE;
	    }
    public static void main(String[] args) {
    	   PageFormat format = new PageFormat();
    	   Paper paper = new Paper();

    	  double paperWidth = 3.25;
    	   double paperHeight = 11.69;
    	   double leftMargin = 0.10;
    	   double rightMargin = 0.10;
    	   double topMargin = 0;
    	  double bottomMargin = 0.00;

    	  paper.setSize(paperWidth * 72.0, paperHeight * 72.0);
    	  paper.setImageableArea(leftMargin * 72.0, topMargin * 72.0,
    	       (paperWidth - leftMargin - rightMargin) * 72.0,
    	        (paperHeight - topMargin - bottomMargin) * 72.0);

    	   format.setPaper(paper);

    	   PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
    	   aset.add(OrientationRequested.PORTRAIT);

    	   PrinterJob printerJob = PrinterJob.getPrinterJob();
    	   Printable printable = new PrintDemo();
    	   format = printerJob.validatePage(format);
    	   printerJob.setPrintable(printable, format);
    	   try {
    	      printerJob.print(aset);
    	   }
    	   catch (Exception e) {
    	       JOptionPane.showMessageDialog(null,"Printing error !!");
    	   }
    	}

}