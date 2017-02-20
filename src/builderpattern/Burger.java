package builderpattern;

abstract public class Burger implements Item {
	
	
	public Packing packing(){
		return new Wrapper();
	}
	
	public abstract  float price();
}
