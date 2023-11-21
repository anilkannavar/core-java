class ProjectStarter
{
	public static void main(String... args)
	{
		System.out.println("Running main in ProjectStarter");
		
		Person3 person=new Person3();
		
		Project project=new Project();
		project.validate(person);
		
		Developer developer=new Developer();
		project.validate(developer);
		
		Tester tester=new Tester();
	    project.validate(tester);
		
		BusinessAnalyst businessanalyst=new BusinessAnalyst();
		project.validate(businessanalyst);
		
		ProductOwner productowner=new ProductOwner();
		project.validate(productowner);
		
		DatabaseDeveloper databasedeveloper=new DatabaseDeveloper();
		project.validate(databasedeveloper);
		
		Devops devops=new Devops();
		project.validate(devops);
		

		System.out.println("Ending main in ProjectStarter");

	}
}