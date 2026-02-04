
class Chef extends Thread{
	String chefName;
	String dish;
	long timeTaken=0;
	Chef(String chefName,String dish){
		this.chefName=chefName;
		this.dish=dish;
		if(dish.equalsIgnoreCase("Pizza")) {
			this.timeTaken=3000;
		}else if(dish.equalsIgnoreCase("Pasta")) {
			this.timeTaken=2000;
		}else if(dish.equalsIgnoreCase("Salad")) {
			this.timeTaken=1000;
		}else if(dish.equalsIgnoreCase("Burger")) {
			this.timeTaken=2500;
		}
	}

	@Override
	public void run() {
		System.out.println("chef "+ chefName +" started Prepraring "+dish);
		for(int i=25;i<=100;i+=25) {
			System.out.println(Thread.currentThread().getName()+" preparing "+dish+" "+i+"%");
		}
		try {
			Thread.sleep(timeTaken/4);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class RestaurantOrderProcessingSystem {
	public static void main(String[] args) throws InterruptedException {
		Chef c1=new Chef("Anurag","pizza");
		Thread t1=new Thread(c1,"Chef-1");
		Chef c2=new Chef("Aditya","burger");
		Thread t2=new Thread(c2,"Chef-2");
		Chef c3=new Chef("Prashant","salad");
		Thread t3=new Thread(c3,"Chef-3");
		Chef c4=new Chef("yuvraj","pasta");
		Thread t4=new Thread(c4,"Chef-4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("Kitchen closed - All orders completed");
		
		
	}
}
