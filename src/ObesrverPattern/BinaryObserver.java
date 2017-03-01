package ObesrverPattern;

public class BinaryObserver extends Observer {


	public BinaryObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
		
	}

	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString(subject.getState()) ); 
		

	}

}
