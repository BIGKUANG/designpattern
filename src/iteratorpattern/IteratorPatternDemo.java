package iteratorpattern;
/**
 * 迭代器模式:这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 优点：
 * 1、它支持以不同的方式遍历一个聚合对象。 
 * 2、迭代器简化了聚合类。
 * 3、在同一个聚合上可以有多个遍历。
 * 4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * @author Dekey.Shen
 *
 */
public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		for(Iterator iter = nameRepository.getIterator();iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("name:"+name);
		}
	}
}
