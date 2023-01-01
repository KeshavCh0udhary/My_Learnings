package question5;

public class Teacher implements Education{

	public void teaches123(){
		 System.out.println("Teacher teaches");
		}

	@Override
	public void start() {
		teaches123();
		
	}
}
