package IcecreamTest;

public class IceTest {

	public static void main(String[] args) {
		
		//	Creating a new scoop 	
		Scoop scoop1 = new Scoop(Flavor.VANILLA);
		Cup cup1 = new Cup(Size.SMALL,scoop1);
		//setting a container for the scoop 
		scoop1.setContainer(cup1); 
		//setting the top scoop for scoop1
		Scoop scoop2 = new Scoop(Flavor.ORANGE);
		scoop1.addScoop(scoop2);
	
		// Getting the reference of top scoop
		Scoop topmostscoop, bottomscoop;
		bottomscoop = cup1.bottomscoop;
		topmostscoop = bottomscoop;
		while(topmostscoop.getTopScoop()!=null){
			topmostscoop = topmostscoop.getTopScoop();
		}
		
		// Here topmost scoop contains reference of topmost scoop of scoop1  
		//setting the topping for cup1
		topmostscoop.setToppings(new Topping[]{Topping.STRAWBERRYJEERRY,Topping.NUTS, Topping.EXTRACHOCOLATE}); 
		cup1.price = (float) 5.0;
		//calling function displayIcecream to print the specification of cup1 
		displayIcecream("CUP",cup1);
				
		System.out.println("..............................");
		// creating another scoop for cone
		Scoop scoop3= new Scoop(Flavor.ORANGE);
		Cone cone1 = new Cone(Size.SMALL, scoop3);
		cone1.setTopping(Topping.NUTS);
		scoop3.setContainer(cone1);
		//adding scoop to cone1
		Scoop scoop4= new Scoop(Flavor.STRAWBERY);
		scoop3.addScoop(scoop4);
		Scoop scoop5= new Scoop(Flavor.LIME);
		scoop4.addScoop(scoop5);
		
		//getting the reference of topmost scoop for container cone
		bottomscoop = cone1.bottomscoop;
		topmostscoop = bottomscoop;
		while(topmostscoop.getTopScoop()!=null){
			topmostscoop = topmostscoop.getTopScoop();}
		
		topmostscoop.setToppings(new Topping[]{Topping.NUTS,Topping.EXTRACHOCOLATE,Topping.STRAWBERRYJEERRY});
		cone1.price = (float) 17.0;		
		displayIcecream("CONE",cone1);
		
		
		System.out.println("..............................");
		Scoop scoop6 = new Scoop(Flavor.ORANGE);
		
		Cup cup2 = new Cup(Size.LARGE,scoop6);
		scoop6.setContainer(cup2);
		bottomscoop = cup2.bottomscoop;
		topmostscoop = bottomscoop;
		while(topmostscoop.getTopScoop()!=null){
			topmostscoop = topmostscoop.getTopScoop();
		}
		topmostscoop.setToppings(new Topping[]{Topping.NUTS,Topping.EXTRACHOCOLATE});
		cup2.price = (float) 6.0;		
		displayIcecream("CUP",cup2);
		
	}
	
	// The function displayIcecream print the specifications of Icrecream
	public static void displayIcecream(String type,Container c1){
		
		Topping[] topping;
		System.out.println("The following Icecream has been ordered: "+type);
		System.out.println("The size is:"+ c1.size);
		
		// printing the total number of scoops in container
	
		if(type.equals("CONE")){
			if(c1.getTopping()!=null){
				System.out.println("The Topping is: "+c1.getTopping());
			}
		}
		
		
		System.out.println("The flavors of scoop "+type+" from top to bottom are: "); 
		Scoop topmostscoop;
		topmostscoop = c1.bottomscoop;
	
		while(topmostscoop.getTopScoop()!=null){
			System.out.println(topmostscoop.getFlavor());
			topmostscoop = topmostscoop.getTopScoop();
		}
		System.out.println(topmostscoop.getFlavor());
		System.out.println("The toppings are: ");
		topping=topmostscoop.getToppings();
		for(Topping t1 :topping){
			System.out.println(t1);
		}
		System.out.println("Price of "+type+" is: "+ c1.price);
		
	}
	

}
