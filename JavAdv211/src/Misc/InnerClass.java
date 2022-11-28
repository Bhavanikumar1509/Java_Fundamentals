package Misc;
class Brand{
	protected String brandName;
	private void show() {
		System.out.println("band details");
	}
	class Product{
		String productName;
		float productPrice;
		public float getProductPrice() {
			return 2000;
		}
		public void display() {
			show();
			System.out.println(brandName);
			
		}
		
	}
	protected class AnotherProduct{
		String productDesc;
		int productQuantity;
		public int getProductQuantity() {
			return 10;
		}
		
		
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Brand brand=new Brand();
		Brand.Product prod=brand.new Product();
		Brand.AnotherProduct anotherprod=brand.new AnotherProduct();
		System.out.println(prod.getProductPrice());
		prod.display();
		System.out.println(anotherprod.getProductQuantity());
		
	}

}
