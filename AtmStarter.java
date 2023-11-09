class AtmStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in AtmStarter");
		
		String[] branches={"BTM","HSR","JAYANAGAR","YELAHANKA","SILK BOARD"};
		String[] acs={"PHILLIPS","VOLTAS","BLUE STAR","SAMSUNG","LG"};
		String[] cctvBrands={"PHILLIPS","SONY","SAMSUNG","MI","REDMI"};
		Atm atm=new Atm("SBI",branches,acs,cctvBrands);
		atm.showInfo();
		System.out.println("Starting main in AtmStarter");

	}
}