package builderpattern;

abstract public class ColdDrink implements Item{
	
	public Packing packing(){
		return new Bottle();
	}
	
	public abstract float price();
}

