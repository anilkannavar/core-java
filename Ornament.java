class Ornament
{
    long ornamentNo;
	String name;
	double ornamentInGram;
	int no;
	
	Ornament()
	{
		super();
		System.out.println("Ornament has been created");
	}
	Ornament(long ornamentNo)
	{
		super();
		System.out.println("OrnamentNo has been created:"+ornamentNo);
		this.ornamentNo=ornamentNo;
	}
	Ornament(long ornamentNo,String name)
	{
		super();
		System.out.println("OrnamentNo,name has been created:"+ornamentNo+","+name);
		this.ornamentNo=ornamentNo;
		this.name=name;
	}
	Ornament(long ornamentNo,String name,double ornamentInGram)
	{
		super();
		System.out.println("OrnamentNo,name has been created:"+ornamentNo+","+name+","+ornamentInGram);
		this.ornamentNo=ornamentNo;
		this.name=name;
		this.ornamentInGram=ornamentInGram;
	}
	Ornament(long ornamentNo,String name,double ornamentInGram,int no)
	{
		super();
		System.out.println("OrnamentNo,name has been created:"+ornamentNo+","+name+","+ornamentInGram+","+no);
		this.ornamentNo=ornamentNo;
		this.name=name;
		this.ornamentInGram=ornamentInGram;
		this.no=no;
	}
}