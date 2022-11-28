package Strings;
import java.io.*;


class Invoice{
	String PartNumber,Description;
	int Quantity;
	double PricePerItem;
	public Invoice(String partNumber, String description, int quantity, double pricePerItem) {
		super();
		PartNumber = partNumber;
		Description = description;
		Quantity = quantity;
		PricePerItem = pricePerItem;
	}
	public String getPartNumber() {
		return PartNumber;
	}
	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPricePerItem() {
		return PricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		PricePerItem = pricePerItem;
	}
	@Override
	public String toString() {
		return "Invoice [PartNumber=" + PartNumber + ", Description=" + Description + ", Quantity=" + Quantity
				+ ", PricePerItem=" + PricePerItem + "]";
	}
	public double getInvoice() {
		return this.Quantity*this.PricePerItem;
		
	}
	public void setQuantity() {
		if(this.Quantity<0) {
			this.Quantity=0;
		}
		if(PricePerItem<0) {
			PricePerItem=0.0;
		}
		
	}
	
}

public class InvoiceTest {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		Invoice I=new Invoice("1001", "enigne", 10, 12.3);
		System.out.println("Descripton:"+I.getDescription());
		System.out.println("partNumber:"+I.getPartNumber());
		System.out.println("Price Per Item:"+I.getPricePerItem());
		System.out.println("Quantity:"+I.getQuantity());
		System.out.println("get Invoice:"+I.getInvoice());
		
		FileOutputStream outStream=new FileOutputStream("C:\\Users\\kbhav\\Desktop\\pend\\2.txt");
		ObjectOutputStream out=new ObjectOutputStream(outStream);
		out.writeObject(I);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("Invoice object serialized sucessfully");
		
		FileInputStream inStream=new FileInputStream("C:\\Users\\kbhav\\Desktop\\pend\\2.txt");
		ObjectInputStream in=new ObjectInputStream(inStream);
		I=(Invoice)in.readObject();
		System.out.println(I);
		in.close();
		inStream.close();
		
	}

}
