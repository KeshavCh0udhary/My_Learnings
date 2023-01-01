package question5;

public class College {

	private Education e;
	
	
//	
//	public void setE(Education e) {
//		this.e = e;
//	}



	public College(Education e) {
		super();
		this.e = e;
	}



	public void doJob(){
		
		System.out.println("ob is started");
		e.start();
		//here it needs the service of its Dependencies
		}
}
