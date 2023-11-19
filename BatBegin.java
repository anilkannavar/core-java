class BatBegin
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in main class");
		Wood wood=new Bat();
		wood.cut();
		
		Bat bat=(Bat)wood;
		bat.hit();
		
	}
}