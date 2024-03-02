package cpm.xworkz.arraylist;

import java.util.ArrayList;

public class AarraylistExample {
	
	public static void main(String[] args) {
		
		int n=6;
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>(n);
		
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		
//		System.out.println("Array1 :"+arrayList.size());
		
//		System.out.println("Array1 :"+arrayList2);
		
		for(int i=1;i<=n;i++) {
			arrayList.add(i);
			arrayList2.add(i);
		}
		
		arrayList.forEach(h->System.out.println(h));
//          		
//        System.out.println("Array1 :"+arrayList2);
		System.out.println("Array1 :"+arrayList.size());
		System.out.println("Array1 :"+arrayList2);

   		
                  


	}

}
