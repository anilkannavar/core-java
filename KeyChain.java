class KeyChain
{
  double cost;
  String type;
  String material;
  int size;
  double weight;
  
  KeyChain()
  {
	  System.out.println("KeyChain has been created");
  }
  KeyChain(double cost)
  {
	  this.cost=cost;
	  System.out.println("cost has been created:"+cost);
  }
  KeyChain(double cost,String type)
  {
	  this(cost);
	  this.type=type;
	  System.out.println("cost and type has been created:"+cost+","+type);
  }
  KeyChain(double cost,String type,String material)
  {
	  this(cost,type);
	  this.material=material;
	  System.out.println("cost,type and material has been created:"+cost+","+type+","+material);
  }
  KeyChain(double cost,String type,String material,int size)
  {
	  this(cost,type,material);
	  this.size=size;
	  System.out.println("cost,type,material and size has been created:"+cost+","+type+","+material+","+size);
  }
  KeyChain(double cost,String type,String material,int size,double weight)
  {
	  this(cost,type,material,size);
	  this.weight=weight;
	  System.out.println("cost,type,material and size and weight has been created:"+cost+","+type+","+material+","+size+","+weight);
  }
}