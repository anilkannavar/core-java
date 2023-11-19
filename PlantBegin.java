class PlantBegin
{
	public static void main(String args[])
	{
		System.out.println("Running main in PlantBegin");
		Plant plant=new Food();
		plant.show();
		
		Food food=(Food)plant;
		food.display();
	}
}