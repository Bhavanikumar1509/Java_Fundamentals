package OOPS;
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfPurchased;
    private double pricePreItem;
    
    public Invoice(String partNumber, String partDescription, int quantityOfPurchased, double pricePreItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantityOfPurchased = quantityOfPurchased;
		this.pricePreItem = pricePreItem;
		}
    

    public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public int getQuantityOfPurchased() {
		return quantityOfPurchased;
	}


	public void setQuantityOfPurchased(int quantityOfPurchased) {
		if (quantityOfPurchased > 0) {
            this.quantityOfPurchased = quantityOfPurchased;
        } else {
            this.quantityOfPurchased = 0;
        }
	}


	public double getPricePreItem() {
		return pricePreItem;
	}


	public void setPricePreItem(double pricePreItem) {
		if (pricePreItem > 0) {
            this.pricePreItem = pricePreItem;
        } else {
            this.pricePreItem = 0;
        }
	}
	public double getInvoiceAmount() {
        return pricePreItem * quantityOfPurchased;
    }
}

public class Q1 {
	public static void main(String[] args) {
		Invoice invoice=new Invoice("3280HdhfbF", "laptop Screen", 1, 5000);
		System.out.println("Part number: " + invoice.getPartNumber() + "\nPart description: " + invoice.getPartDescription() +
                "\nItems Sold: " + invoice.getQuantityOfPurchased() + "\nPrice: " + invoice.getPricePreItem() + "\nInvoice amount: " +
                invoice.getInvoiceAmount());
	}
}

