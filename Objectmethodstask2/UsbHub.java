package com.xworkz.anil;

public class UsbHub {
	
	int totalPorts;
	
	double transferRate;
	
	double batteryRequired;

	public UsbHub(int totalPorts, double transferRate, double batteryRequired)
	{
		this.totalPorts = totalPorts;
		this.transferRate = transferRate;
		this.batteryRequired = batteryRequired;
		System.out.println("creating totalPorts,tramsferRtae,batteryRequired in UsbHub");
		System.out.println("totalPorts:"+totalPorts);
		System.out.println("transferRate:"+transferRate);
		System.out.println("batteryRequired:"+batteryRequired);
    }
	
	@Override
	public boolean equals(Object obj)
	{
		UsbHub leftside=this;
		if(obj!=null)
		{
			if(obj instanceof UsbHub)
			{
				UsbHub rightside=(UsbHub)obj;
				if(leftside.totalPorts==rightside.totalPorts && leftside.transferRate==rightside.transferRate && leftside.batteryRequired==rightside.batteryRequired)
				{
					System.out.println("leftside and rightside are same");
                    return true;
				}
				else
				{
					System.out.println("leftside and rightside are not same");
				}
			}
			else
			{
				System.out.println("obj is not a instance of UsbHub");
			}
		}
		return false;
	}
	
	

}
