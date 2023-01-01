package question5;

public class Clerk implements Education {

	public void registerStudent(){
		 System.out.println("enroll the Student in Collage");
		}

	@Override
	public void start() {
		registerStudent();
		
	}
	
	
	
}
