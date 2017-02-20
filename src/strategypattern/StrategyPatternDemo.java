package strategypattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		//测试+策略方法
		Context context = new Context(new OperationAdd());
		System.out.println("5+2="+context.executeStrategy(5, 2));
		
		//测试-策略方法
		context = new Context(new OperationSubstract());
		System.out.println("5-2="+context.executeStrategy(5, 2));
		
		//测试*策略方法
		context = new Context(new OperationMultiply());
		System.out.println("5*2="+context.executeStrategy(5, 2));
		

	}

}
