class Comapny
{
  Job job;	
  String name="TCS";
  long gstno=7588373342l;
  String location="Davangere";
  
  Comapny(Job job)
  {
	  this.job=job;
  }
  void showInfo()
  {
	  	  	  System.out.println("Starting display in Company");
			  System.out.println("name:"+name);
			  System.out.println("gstno:"+gstno);
			  System.out.println("location:"+location);
			  System.out.println("role:"+job.role);
              System.out.println("salary:"+job.salary);
			  System.out.println("type:"+job.type);
			  System.out.println("Ending display in Company");

  }
}