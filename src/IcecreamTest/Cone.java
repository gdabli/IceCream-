package IcecreamTest;

public class Cone extends Container{
		private Topping topping;

		public Cone(Size size, Scoop bottomscoop) {
			super(bottomscoop,size);
		}	
		public void setTopping(Topping topping){
			this.topping = topping;
		}
		public Topping getTopping(){
			return this.topping;
		}
	
}
