class CameraStarter
{
	public static void main(String... args)
	{
		System.out.println("Running main in CameraStarter");
		
		DigitalCamera digitalcamera=new DigitalCamera("Canon",23,3,Color.RED);
		
		HandCamera handcamera=new HandCamera("nikon",34,3,Color.BLACK,23);
		
		
		System.out.println("Ending main in CameraStarter");

	}
}