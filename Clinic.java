class Clinic
{
  Doctor doctor;	
  String specialization;
  int totalBeds;
  int totalPatient;
  
  Clinic(Doctor doctor,String specialization,int totalBeds,int totalPatient)
  {
	  this.doctor=doctor;
	  this.specialization=specialization;
	  this.totalBeds=totalBeds;
	  this.totalPatient=totalPatient;
  }
  void showInfo()
  {
	  	System.out.println("Starting display in Clinic");
		System.out.println("specialization:"+specialization);		
	    System.out.println("totalBeds:"+totalBeds);		
		System.out.println("totalPatient:"+totalPatient);
		System.out.println("name:"+doctor.name);		
		System.out.println("exp:"+doctor.exp);		
		System.out.println("fake:"+doctor.fake);		
		System.out.println("fees:"+doctor.fees);		
	    System.out.println("Ending display in Clinic");

  }
}