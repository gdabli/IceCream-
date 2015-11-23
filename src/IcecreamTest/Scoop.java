package IcecreamTest;

public class Scoop {

	private Flavor flavor;
	private Topping[] toppings;
	private float price;
	private Container container;
	private Scoop top;
	private Scoop bottom;
	private int count=0;
	
	
	public Scoop(){
		
	}
	public Scoop(Flavor flavor) {
		this.flavor = flavor;
	}
	public Flavor getFlavor() {
		// TODO Auto-generated method stub
		return this.flavor;
	}
	public Scoop getTopScoop(){
		return top;
		
	}
	public void addScoop(Scoop top){
		this.top = top;
		top.setBottomScoop(this.top);
	    
	}	
	public void setBottomScoop(Scoop bottom){
		this.bottom = bottom;
	}
	public Topping[] getToppings() {
		return this.toppings;
	}
	public void setToppings(Topping[] toppings){
		this.toppings = toppings;
	}
	public void setContainer(Container container){
		this.container = container;
	}
	
	public int getcount(){
		return count;
	}
}
