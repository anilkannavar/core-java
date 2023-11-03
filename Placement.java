class Placement
{
  String name;
  String availableCompanies;
  int noOfPlaced;
  double maxPackage;
  long companyNo;
  double minPackage;
  String companyAddress;
  String type;
  double highestPackage;
  int agreementYears;
  String role;
  String testtype;
  
  Placement(String name,String availableCompanies,int noOfPlaced,double maxPackage,long companyNo,double minPackage,String companyAddress,String type,double highestPackage,int agreementYears,String role,String testtype)
  {
	  this.name=name;
	  this.availableCompanies=availableCompanies;
	  this.noOfPlaced=noOfPlaced;
	  this.maxPackage=maxPackage;
	  this.companyNo=companyNo;
	  this.minPackage=minPackage;
	  this.companyAddress=companyAddress;
	  this.type=type;
	  this.highestPackage=highestPackage;
	  this.agreementYears=agreementYears;
	  this.role=role;
	  this.testtype=testtype;
  }
  void showPlacement()
  {
	  System.out.println("Starting Placement in showPlacement");
	  System.out.println("name of the institution:"+name);
	  System.out.println("companies available:"+availableCompanies);
	  System.out.println("no of placed trainee:"+noOfPlaced);
	  System.out.println("maximum package from the comapny:"+maxPackage);
	  System.out.println("companyNo:"+companyNo);
	  System.out.println("maximum package from the comapny:"+minPackage);
	  System.out.println("address of company:"+companyAddress);
	  System.out.println("type of company:"+type);
	  System.out.println("highestPackage of placed trainee:"+highestPackage);
	  System.out.println("agreementYears for trainee:"+agreementYears);
	  System.out.println("role of employees:"+role);
	  System.out.println("type of test:"+testtype);
      System.out.println("Ending Placement in showPlacement");

	  

  }
  
}