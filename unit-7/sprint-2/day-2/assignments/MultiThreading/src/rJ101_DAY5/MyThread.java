package rJ101_DAY5;

public class MyThread extends Thread {

	
	static int x=0;
	@Override
	public void run() {
		
		synchronized (this) {
			for(int a=0;a<10;a++) {
				x+=a;
				System.out.println("abhishek bhai gandulaal hai......."+Thread.currentThread().getName());
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		
		MyThread mt = new MyThread();
		
		
		mt.setName("abhishek gandulaal");
		
		
		mt.start();
		
		
		
		//mt.setPriority(4);
		//mt.run();
		
//		mt.start();
//		try {
//			mt.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
		synchronized (mt) {
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(x);
//			for(int i=25;i<60;i++){
//				System.out.println("inside main mehod"+i+mt.getName());
//				
//				}	
		}

		
	}
	
	
	
	
}
