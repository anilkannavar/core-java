class Array1
{
	public static void main(String[] args)
	{
		int originalArray[]={1,2,3,4,5},temp[]={0,0,0,0,0};
		
		for(int i=0;i<originalArray.length;i++)
		{
			if(i+2<originalArray.length)
			{
				temp[i+2]=originalArray[i];
				
			}
			else
			{
				for(int j=0;j<2;j++)
				{
					temp[j]=originalArray[i];
					i++;
				}
			}
				
		}
		System.out.println("after changing array elemnts:");
		for(int i=0;i<originalArray.length;i++)
		{
			System.out.print(temp[i]);
		}
		
	}
}