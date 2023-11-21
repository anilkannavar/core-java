class Project
{
	void validate(Person3 person)
	{
		if(person!=null)
		{
			person.eat();
			person.sleep();
			if(person instanceof Developer)
			{
				Developer developer=(Developer)person;
				developer.code();
				person.eat();
				person.sleep();
			}
			if(person instanceof Tester)
			{
				Tester tester=(Tester)person;
				tester.qualityCheck();
			}
			if(person instanceof BusinessAnalyst)
			{
				BusinessAnalyst businessAnalyst=(BusinessAnalyst)person;
				businessAnalyst.checkRequirement();
			}
			if(person instanceof ProductOwner)
			{
				ProductOwner productowner=(ProductOwner)person;
				productowner.validate();
			}
			if(person instanceof DatabaseDeveloper)
			{
				DatabaseDeveloper databasedeveloper=(DatabaseDeveloper)person;
				databasedeveloper.runScripts();
			}
			if(person instanceof Devops)
			{
				Devops devops=(Devops)person;
				devops.runBuild();
			}
		}
	}
}