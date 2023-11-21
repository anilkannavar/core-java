class GlassStarter
{
	public static void main(String... args)
	{
		System.out.println("Running main in GlassStarter");
		
		TintedGlass tintedglass=new TintedGlass(23,400,"car usage","borosil",GlassType.SODALIME,4567,4,34,"johnwick");
		
		GorillaGlass gorillaglass=new GorillaGlass(34,678,"housewear","fortali",GlassType.HIGHBALL,3459,5);
	    System.out.println("Ending main in GlassStarter");

	}
}