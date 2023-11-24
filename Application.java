class Application
{
	int id;
	String name;
	double version;
	String developer;
	String date;
	TypeCode type;
	
	Application()
	{
		System.out.println("creating no-arg const in Application");
	}
	
	Application(int id,String name,double version,String developer,String date,TypeCode type)
	{
		this.id=id;
		this.name=name;
		this.version=version;
		this.developer=developer;
		this.date=date;
		this.type=type;
		System.out.println("creating id,name,version,developer,date and type in Application");
	}
	void showInfo()
	{
		System.out.println("running showInfo in Application");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("version:"+version);
		System.out.println("developer:"+developer);
		System.out.println("date:"+date);
		System.out.println("type:"+type);
        System.out.println("ending showInfo in Application");
    }
	void run()
	{
		System.out.println("running run in Application");
    }
	void stop()
	{
		System.out.println("running stop in Application");
    }
	void execute()
	{
		System.out.println("running execute in Application");
	}
	void collectInfo()
	{
		System.out.println("running collectInfo in Application");
    }
	void displayInfo()
	{
		System.out.println("running displayInfo in Application");
	}
}