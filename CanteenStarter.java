class CanteenStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in CanteenStarter");
		
		Canteen canteen=new Canteen("nonveg");
		canteen.showInfo();

		String[] values={"plate","mug","jar","grinder","jug","bottle","stove","cylinder","fork","spoon","owen","mixer","tawa","bowl",
		                 "straw","cups","holder","fingerbowl","container","fridge","cooker","fork","bigbowl","smallbowl","vessels",
						 "mug1","gas1","mediumplate","bigplate","stick","plasticcup","spoon1","dosatawa","idlytawa","fishfrytawa",
						 "tandoor","grill","ironstick","plasticstick","glassbottles"};
		Canteen canteen1=new Canteen(values);
		canteen1.display();
		
		System.out.println("ending main in CanteenStarter");

	}
}