package IcecreamTest;

public abstract class Container {

	protected Size size;
	protected Scoop bottomscoop;
	protected float price;
	protected int count;
	
	//Defining classes
	public abstract void setTopping(Topping topping);
	public abstract Topping getTopping();
	public Container(Scoop bottomscoop, Size size){
		this.bottomscoop = bottomscoop;
		this.size = size;
	}
	
		
}
