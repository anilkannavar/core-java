class Clock
{
   double weight;
   String basedOnTimings;
   String style;
   int size;
   
   
   
   Clock()
   {
	   super();
	   System.out.println("Clock has been created");
   }
   Clock(double weight)
   {
	   super();
	   System.out.println("double has been created:"+weight);
	   this.weight=weight;
   }
   Clock(double weight,String basedOnTimings)
   {
	   super();
	   System.out.println("double,basedOnTimings has been created:"+weight+","+basedOnTimings);
	   this.weight=weight;
	   this.basedOnTimings=basedOnTimings;
   }
   Clock(double weight,String basedOnTimings,String style)
   {
	   super();
	   System.out.println("double,basedOnTimings and style has been created:"+weight+","+basedOnTimings+","+style);
	   this.weight=weight;
	   this.basedOnTimings=basedOnTimings;
	   this.style=style;
   }
   Clock(double weight,String basedOnTimings,String style,int size)
   {
	   super();
	   System.out.println("double,basedOnTimings,style and size has been created:"+weight+","+basedOnTimings+","+style+","+size);
	   this.weight=weight;
	   this.basedOnTimings=basedOnTimings;
	   this.style=style;
	   this.size=size;
   }
   
}