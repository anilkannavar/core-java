class MachineBegin
{
	public static void main(String args[])
	{
		System.out.println("Running main in machinebegin");
		Machine machine=new Generator();
		machine.show();
		
		Generator generator=(Generator)machine;
		generator.display();
	}
}