class DatabaseDeveloper extends Developer 
{
	DatabaseDeveloper()
	{
		System.out.println("creating no-arg const in DatabaseDeveloper");
    }
	void runScripts()
	{
		System.out.println("Running runScripts in DatabaseDeveloper");
    }
}