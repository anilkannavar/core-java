class Atm
{
	String bankName;
	String[] branches;
	String[] acs;
	String[] cctvBrands;
	
	Atm(String bankName,String[] branches,String[] acs,String[] cctvBrands)
	{
		this.bankName=bankName;
		this.branches=branches;
		this.acs=acs;
		this.cctvBrands=cctvBrands;
	}
	void showInfo()
	{
		System.out.println("Starting showInfo in Atm");
        System.out.println("bankName:"+bankName);
		System.out.println("branches:"+branches);
		if(this.branches!=null)
		{
			for(int seq=0;seq<this.branches.length;seq++)
			{
				String branch=branches[seq];
				System.out.println("branch:"+branch);
			}
		
		}
		else
		{
			System.out.println("branches are not selected");
		}
        System.out.println("accounts:"+acs);
        if(this.acs!=null)
        {
	        for(int seq=0;seq<this.acs.length;seq++)
	        {
		        String account=acs[seq];
		        System.out.println("account:"+account);
	        }
        }
		else
		{
			System.out.println("account are not selected");
        }
		System.out.println("cctvBrands:"+cctvBrands);
		if(this.cctvBrands!=null)
		{
			for(int seq=0;seq<this.cctvBrands.length;seq++)
			{
				String cctv=cctvBrands[seq];
				System.out.println("cctv:"+cctv);
			}
				
		}
		else
		{
			System.out.println("cctvBrands are not selected");
        }
		System.out.println("ending showInfo in Atm");
    }
}