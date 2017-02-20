package strategypattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		//����+���Է���
		Context context = new Context(new OperationAdd());
		System.out.println("5+2="+context.executeStrategy(5, 2));
		
		//����-���Է���
		context = new Context(new OperationSubstract());
		System.out.println("5-2="+context.executeStrategy(5, 2));
		
		//����*���Է���
		context = new Context(new OperationMultiply());
		System.out.println("5*2="+context.executeStrategy(5, 2));
		

	}

}
