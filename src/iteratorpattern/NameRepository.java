package iteratorpattern;
/**
 * 储藏室\仓库类
 * 要使用迭代器的对象放在此类中声明
 * @author Dekey.Shen
 *
 */
public class NameRepository implements Container {

	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	
	
	public Iterator getIterator() {
		
		return new NameIterator() ;
	}
	
	private class NameIterator implements Iterator{
		
		int index;

		public boolean hasNext() {
			if(index < names.length){
				return true;
			}
			return false;
			
		}

		public Object next() {
			if(this.hasNext()){
				return names[index++];
			}
			
			return null;
		}
		
	}

}
