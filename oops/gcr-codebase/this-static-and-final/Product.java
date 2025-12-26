package oops.this_static_and_final;

import java.util.Scanner;

class Product {
	 static double discount=15;
		private String productName;
		private int price;
		private int quantity;
		private final int productID;
		Product(String productName,int price,int quantity,int productID){
			this.productName=productName;
			this.price=price;
			this.quantity=quantity;
			this.productID=productID;
		}
		public static void updateDiscount(double newDiscount) {
			discount=newDiscount;
		}
		public void display(){
			if(this instanceof Product){
				System.out.println("   Product Details   ");
				System.out.println("Product Name: "+productName);
				System.out.println("Product Price: "+price);
				System.out.println("Product Quantity: "+quantity);
				System.out.println("Product ID: " +productID);
				System.out.println("Price after Discount: "+((price)-((discount/100)*price)));
			}
			else{
				System.out.println("Not an instance");
			}
		}
		public static void main(String args[]){
			Product p1=new Product("Lakme Kajal", 190, 1, 349);
			Product p2=new Product("Face Wash", 360, 1, 399);
			Product p3=new Product("Hair Oil", 590, 1, 368);
			p1.display();
			System.out.println();
			p2.display();
			System.out.println();
			p3.display();
			System.out.println();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter new Discount: ");
			double newDiscount=sc.nextDouble();
			updateDiscount(newDiscount);
			p1.display();
	        System.out.println();
	        p2.display();
	        System.out.println();
	        p3.display();
	        System.out.println();

		}

}
