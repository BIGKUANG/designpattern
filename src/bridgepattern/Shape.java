package bridgepattern;
/**
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明
 * 由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程
 * 使用场景： 1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 * 		             通过桥接模式可以使它们在抽象层建立一个关联关系。
 * 	 	   2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 * 		   3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 * @author Administrator
 *
 */
public abstract class Shape {
	 protected DrawAPI drawAPI;
	 protected Shape(DrawAPI drawAPI){
	    this.drawAPI = drawAPI;
	 }
	 public abstract void draw();	
}
