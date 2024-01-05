package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanParts {
	
	public static void main(String[] args) {
		
		Collection<String> refCollection=new ArrayList<String>();
		
		refCollection.add("Eye");
		refCollection.add("Heart");
		refCollection.add("Brain");
		refCollection.add("Lungs");
		refCollection.add("Kidneys");
		refCollection.add("Liver");
		refCollection.add("Stomach");
		refCollection.add("Pancreas");
		refCollection.add("Spleen");
		refCollection.add("Intestines");
		refCollection.add("Bladder");
		refCollection.add("Skin");
		refCollection.add("Muscles");
		refCollection.add("Bones");
		refCollection.add("Nerves");
		refCollection.add("Thyroid");
		refCollection.add("Adrenal Glands");
		refCollection.add("Pituitary Gland");
		refCollection.add("Thymus");
		refCollection.add("Esophagus");
		refCollection.add("Gallbladder");
		refCollection.add("Tongue");
		refCollection.add("Teeth");
		refCollection.add("Ears");
		refCollection.add("Nose");
		refCollection.add("Mouth");
		refCollection.add("Fingers");
		refCollection.add("Toes");
		refCollection.add("Knees");
		refCollection.add("Elbows");
		refCollection.add("Hips");
		refCollection.add("Shoulders");
		refCollection.add("Wrist");
		refCollection.add("Ankles");
		refCollection.add("Neck");
		refCollection.add("Back");
		refCollection.add("Chest");
		refCollection.add("Abdomen");
		refCollection.add("Pelvis");
		refCollection.add("Throat");
		refCollection.add("Jaw");
		refCollection.add("Forehead");
		refCollection.add("Cheeks");
		refCollection.add("Eyebrows");
		refCollection.add("Eyelashes");
		refCollection.add("Cheekbones");
		refCollection.add("Chin");
		refCollection.add("Forearm");
		refCollection.add("Shin");
		refCollection.add("Calf");
		refCollection.add("Hip Bone");
		refCollection.add("Spine");
		refCollection.add("Pelvis Bone");
		refCollection.add("Temples");
		refCollection.add("Navel");
		refCollection.add("Wrist Bone");
		refCollection.add("Jawbone");
		refCollection.add("Collarbone");
		refCollection.add("Backbone");
		refCollection.add("Fingernails");
		refCollection.add("Toenails");
		refCollection.add("Mouth Roof");
		refCollection.add("Larynx");
		refCollection.add("Uvula");
		refCollection.add("Ribcage");
		refCollection.add("Temporomandibular Joint");
		refCollection.add("Lymph Nodes");
		refCollection.add("Blood Vessels");
		refCollection.add("Aorta");
		refCollection.add("Cerebellum");
		refCollection.add("Cornea");
		refCollection.add("Retina");
		refCollection.add("Iris");
		refCollection.add("Eardrum");
		refCollection.add("Tonsils");
		refCollection.add("Bronchi");
		refCollection.add("Ulna");
		refCollection.add("Radius");
		refCollection.add("Metatarsals");
		refCollection.add("Metacarpals");
		refCollection.add("Coccyx");
		
		Iterator<String> refIterator=refCollection.iterator();
		while(refIterator.hasNext())
		{
			String refString=refIterator.next();
			if(refString.length()<=5)
			{
				System.out.println("body names that less than 5 :"+refString);
			}
		}
	}

}
