package com.xworkz.anil;

public class Runner {
	
	public static void main(String[] args)
	{
		System.out.println("Starting main in Runner");
		
		Guiter guiter=new Guiter(1,25000,"wood");
		Guiter guiter1=new Guiter(2,35000,"wood");
		
		guiter.equals(guiter1);
		
        guiter.equals(null);
		
		
		WifiDongle wifidongle=new WifiDongle("jio",400,100);
		WifiDongle wifidongle1=new WifiDongle("jio",500,200);
		
		wifidongle.equals(wifidongle1);
		
		wifidongle.equals(null);
		
		
		UsbHub usbhub=new UsbHub(23,300,4000);
		UsbHub usbhub1=new UsbHub(56,560,5000);
		
		usbhub.equals(usbhub1);
		
		usbhub.equals(null);

		System.out.println("Ending main in Runner");

	}

}
