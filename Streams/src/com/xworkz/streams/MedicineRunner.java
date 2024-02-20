package com.xworkz.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicineRunner {
	
	public static void main(String[] args) {
		
		String [] ref= {"Finylephrime","Paracetomel","Citrizyne"};
		MedicineDTO medicineDTO=new MedicineDTO("Coldfiz", 1, "sun pharma", LocalDate.of(2023, 4, 5), LocalDate.now(), 200,ref);
		
		String[] ref1 = {"Loratadine", "Acetaminophen", "Pseudoephedrine"};
		MedicineDTO medicineDTO1 = new MedicineDTO("Allerfix", 2, "Cipla", LocalDate.of(2023, 5, 15), LocalDate.now(), 180, ref1);

		String[] ref2 = {"Ibuprofen", "Codeine", "Diphenhydramine"};
		MedicineDTO medicineDTO2 = new MedicineDTO("PainAway", 3, "AbbVie", LocalDate.of(2023, 7, 20), LocalDate.now(), 150, ref2);

		String[] ref3 = {"Ranitidine", "Famotidine", "Omeprazole"};
		MedicineDTO medicineDTO3 = new MedicineDTO("GastroRelief", 4, "Glenmark", LocalDate.of(2023, 8, 10), LocalDate.now(), 170, ref3);

		String[] ref4 = {"Dextromethorphan", "Guaifenesin", "Phenylephrine"};
		MedicineDTO medicineDTO4 = new MedicineDTO("CoughFix", 5, "Torrent", LocalDate.of(2023, 9, 25), LocalDate.now(), 190, ref4);

		String[] ref5 = {"Aspirin", "Naproxen", "Ibuprofen"};
		MedicineDTO medicineDTO5 = new MedicineDTO("PainReliever", 6, "Sun Pharma", LocalDate.of(2023, 10, 18), LocalDate.now(), 160, ref5);

		String[] ref6 = {"Hydrocortisone", "Clotrimazole", "Mupirocin"};
		MedicineDTO medicineDTO6 = new MedicineDTO("SkinHeal", 7, "Intas Pharmaceuticals", LocalDate.of(2023, 11, 30), LocalDate.now(), 140, ref6);

		String[] ref7 = {"Melatonin", "Diphenhydramine", "Valerian Root"};
		MedicineDTO medicineDTO7 = new MedicineDTO("SleepAid", 8, "Cadila Healthcare", LocalDate.of(2023, 12, 5), LocalDate.now(), 200, ref7);

		String[] ref8 = {"Caffeine", "Ginseng", "L-Theanine"};
		MedicineDTO medicineDTO8 = new MedicineDTO("EnergyBoost", 9, "Dr. Reddy's Laboratories", LocalDate.of(2023, 12, 20), LocalDate.now(), 180, ref8);

		String[] ref9 = {"Lutein", "Zeaxanthin", "Vitamin C"};
		MedicineDTO medicineDTO9 = new MedicineDTO("EyeHealth", 10, "Aurobindo Pharma", LocalDate.of(2024, 1, 10), LocalDate.now(), 190, ref9);

		String[] ref10 = {"Meclizine", "Dimenhydrinate", "Diphenhydramine"};
		MedicineDTO medicineDTO10 = new MedicineDTO("DizzinessRelief", 11, "Lupin Limited", LocalDate.of(2024, 2, 15), LocalDate.now(), 170, ref10);

		String[] ref11 = {"Guaifenesin", "Bromhexine", "Diphenhydramine"};
		MedicineDTO medicineDTO11 = new MedicineDTO("CoughSuppressant", 12, "Torrent", LocalDate.of(2024, 3, 20), LocalDate.now(), 150, ref11);

		String[] ref12 = {"Loperamide", "Bismuth Subsalicylate", "Simethicone"};
		MedicineDTO medicineDTO12 = new MedicineDTO("StomachRelief", 13, "Sun Pharma", LocalDate.of(2024, 4, 5), LocalDate.now(), 160, ref12);

		String[] ref13 = {"Albuterol", "Fluticasone", "Montelukast"};
		MedicineDTO medicineDTO13 = new MedicineDTO("AsthmaControl", 14, "Dr. Reddy's Laboratories", LocalDate.of(2024, 5, 15), LocalDate.now(), 200, ref13);

		String[] ref14 = {"Calcium", "Vitamin D", "Magnesium"};
		MedicineDTO medicineDTO14 = new MedicineDTO("BoneStrength", 15, "Cipla", LocalDate.of(2024, 6, 20), LocalDate.now(), 180, ref14);

		String[] ref15 = {"Omega-3 Fatty Acids", "Vitamin E", "Coenzyme Q10"};
		MedicineDTO medicineDTO15 = new MedicineDTO("HeartHealth", 16, "Glenmark", LocalDate.of(2024, 7, 10), LocalDate.now(), 170, ref15);

		String[] ref16 = {"Vitamin B12", "Folic Acid", "Iron"};
		MedicineDTO medicineDTO16 = new MedicineDTO("AnemiaRelief", 17, "Lupin Limited", LocalDate.of(2024, 8, 25), LocalDate.of(2024,2,19), 190, ref16);

		String[] ref17 = {"Probiotics", "Prebiotics", "Digestive Enzymes"};
		MedicineDTO medicineDTO17 = new MedicineDTO("GutHealth", 18, "Intas Pharmaceuticals", LocalDate.of(2024, 9, 18), LocalDate.now(), 160, ref17);

		String[] ref18 = {"Lactase", "Simethicone", "Peppermint Oil"};
		MedicineDTO medicineDTO18 = new MedicineDTO("DigestiveComfort", 19, "Dr. Reddy's Laboratories", LocalDate.of(2024, 10, 5), LocalDate.of(2024,1,19), 140, ref18);

		String[] ref19 = {"Aloe Vera", "Calamine", "Hydrocortisone"};
		MedicineDTO medicineDTO19 = new MedicineDTO("SkinRelief", 20, "Sun Pharma", LocalDate.of(2024, 11, 18), LocalDate.now(), 200, ref19);
		
		List<MedicineDTO> list=new ArrayList<MedicineDTO>();
		list.add(medicineDTO19);
		list.add(medicineDTO18);
		list.add(medicineDTO17);
		list.add(medicineDTO16);
		list.add(medicineDTO15);
		list.add(medicineDTO14);
		list.add(medicineDTO12);
		list.add(medicineDTO13);
		list.add(medicineDTO11);
		list.add(medicineDTO10);
		list.add(medicineDTO9);
		list.add(medicineDTO8);
		list.add(medicineDTO7);
		list.add(medicineDTO5);
		list.add(medicineDTO6);
		list.add(medicineDTO4);
		list.add(medicineDTO3);
		list.add(medicineDTO2);
		list.add(medicineDTO1);
		list.add(medicineDTO);
		
		for (MedicineDTO ef : list) {
			System.out.println(ef);
			
		}
		
		System.out.println("**************Sorting all medicines by company name*********");
        Collections.sort(list);
        list.forEach(f->System.out.println(f));
        
        System.out.println("********Sort all by expiry date**********");
        list.stream().sorted((p1,p2)->Double.compare(p1.getCost(), p2.getCost())).forEach(f->System.out.println(f));
        
        System.out.println("****************Collect all elements where ingredients greater than*********");
        list.stream().filter(e->e.getIngredients().length>2).forEach(e1->System.out.println(e1));
        
        System.out.println("************Collect only ingredients************");
        for (MedicineDTO medicineDTO20 : list) {
        	String[] medicinStrings=medicineDTO20.getIngredients();
        	for (String ingredients : medicinStrings) {
        		System.out.println(ingredients);
				
			}
		}
        
        System.out.println("************collect only company sort by desc and print uppercase*************");
        list.stream().sorted((e1,e2)->e2.getCompany().compareTo(e1.getCompany())).map(g->g.getCompany().toUpperCase()).forEach(t->System.out.println(t));
	
	    System.out.println("************collect only name in lower case i desc order*************");
	    list.stream().sorted((t1,t2)->t2.getName().compareTo(t1.getName())).map(z->z.getName().toLowerCase()).forEach(d->System.out.println(d));
	    
	    System.out.println("***********collect all elements and manufactureddate less than 30 days***********");
	    LocalDate resDate=LocalDate.parse("2024-02-20");
	    LocalDate resDate1=LocalDate.parse("2024-01-20");
        list.stream().filter(f->f.getManDate().isBefore(resDate) && f.getManDate().isAfter(resDate1)).forEach(y->System.out.println(y));
        
	    System.out.println("***********collect all elements and manufactureddate greater than 30 days***********");
	    LocalDate resDate2=LocalDate.parse("2024-01-20");
        list.stream().filter(f->f.getManDate().isAfter(resDate2)).forEach(y->System.out.println(y));
        
	    System.out.println("***********collect all elements and expireddate less than 30 days***********");
	    LocalDate resDate3=LocalDate.parse("2024-01-20");
        list.stream().filter(f->f.getExpiryDate().isBefore(resDate3)).forEach(y->System.out.println(y));
       
	}
	

}
