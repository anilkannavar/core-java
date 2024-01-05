package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Airport {
	
	public static void main(String[] args) {
		
		Collection<String> refCollection=new ArrayList<String>();
		
		refCollection.add("krantiveera sangolli rayanna");
		refCollection.add("Krantiveera Sangolli Rayanna International Airport");
        refCollection.add("Hartsfield-Jackson Atlanta International Airport");
        refCollection.add("Frankfurt Airport");
        refCollection.add("Hong Kong International Airport");
        refCollection.add("Denver International Airport");
        refCollection.add("Toronto Pearson International Airport");
        refCollection.add("Incheon International Airport");
        refCollection.add("San Francisco International Airport");
        refCollection.add("Amsterdam Airport Schiphol");
        refCollection.add("O'Hare International Airport");
        refCollection.add("Changi Airport");
        refCollection.add("Dubai International Airport");
        refCollection.add("Los Angeles International Airport");
        refCollection.add("Heathrow Airport");
        refCollection.add("Beijing Capital International Airport");
        refCollection.add("Sydney Kingsford Smith Airport");
        refCollection.add("Charles de Gaulle Airport");
        refCollection.add("Tokyo Haneda Airport");
        refCollection.add("Munich Airport");
        refCollection.add("Singapore Changi Airport");
        refCollection.add("Dallas/Fort Worth International Airport");
        refCollection.add("John F. Kennedy International Airport");
        refCollection.add("Seattle-Tacoma International Airport");
        refCollection.add("Abu Dhabi International Airport");
        refCollection.add("Rome Fiumicino Airport");
        refCollection.add("Zurich Airport");
        refCollection.add("Mumbai Chhatrapati Shivaji Maharaj International Airport");
        refCollection.add("Barcelona-El Prat Airport");
        refCollection.add("Melbourne Airport");
        refCollection.add("Istanbul Airport");
        refCollection.add("MIA Miami International Airport");
refCollection.add("Paris Orly Airport");
refCollection.add("Vienna International Airport");
refCollection.add("Toronto Billy Bishop Airport");
refCollection.add("Denver Centennial Airport");
refCollection.add("Seoul Gimpo International Airport");
refCollection.add("San Jose International Airport");
refCollection.add("Doha Hamad International Airport");
refCollection.add("Las Vegas McCarran International Airport");
refCollection.add("Vienna Schwechat Airport");
refCollection.add("Stockholm Arlanda Airport");
refCollection.add("Vancouver International Airport");
refCollection.add("Copenhagen Airport");
refCollection.add("Brisbane Airport");
refCollection.add("Dublin Airport");
refCollection.add("Oslo Gardermoen Airport");
refCollection.add("Madrid Adolfo Suárez Madrid-Barajas Airport");
refCollection.add("Toronto Downsview Airport");
refCollection.add("Seoul Incheon International Airport");
refCollection.add("Newark Liberty International Airport");
refCollection.add("São Paulo/Guarulhos–Governador André Franco Montoro International Airport");
refCollection.add("Minneapolis-Saint Paul International Airport");
refCollection.add("Brussels Airport");
refCollection.add("Auckland Airport");
refCollection.add("Shanghai Pudong International Airport");
refCollection.add("Baltimore/Washington International Thurgood Marshall Airport");
refCollection.add("Lisbon Humberto Delgado Airport");
refCollection.add("Moscow Sheremetyevo International Airport");
refCollection.add("Berlin Brandenburg Airport");
refCollection.add("Delhi Indira Gandhi International Airport");
refCollection.add("Cairo International Airport");
refCollection.add("Amman Queen Alia International Airport");
refCollection.add("Houston George Bush Intercontinental Airport");
refCollection.add("Perth Airport");
refCollection.add("Manila Ninoy Aquino International Airport");
refCollection.add("Kuala Lumpur International Airport");
refCollection.add("Helsinki-Vantaa Airport");
refCollection.add("Mexico City International Airport");
refCollection.add("Buenos Aires Ministro Pistarini International Airport");
refCollection.add("Phoenix Sky Harbor International Airport");
refCollection.add("Edmonton International Airport");
refCollection.add("Johannesburg OR Tambo International Airport");
refCollection.add("Warsaw Chopin Airport");
refCollection.add("San Diego International Airport");
refCollection.add("Prague Václav Havel Airport");
refCollection.add("Santiago Arturo Merino Benítez International Airport");
refCollection.add("Montreal-Pierre Elliott Trudeau International Airport");
refCollection.add("Hamburg Airport");
refCollection.add("Guangzhou Baiyun International Airport");
refCollection.add("Munich-Riem Airport");
refCollection.add("Lima Jorge Chávez International Airport");
refCollection.add("Osaka Kansai International Airport");
refCollection.add("Colombo Bandaranaike International Airport");
refCollection.add("Dublin Weston Airport");
refCollection.add("Salt Lake City International Airport");
refCollection.add("Kolkata Netaji Subhas Chandra Bose International Airport");
refCollection.add("Cancún International Airport");
refCollection.add("Geneva Airport");
refCollection.add("Puerto Vallarta International Airport");
refCollection.add("St. John's International Airport");
refCollection.add("Bangkok Suvarnabhumi Airport");
refCollection.add("Pittsburgh International Airport");
refCollection.add("Athens Eleftherios Venizelos Airport");
refCollection.add("Stuttgart Airport");
refCollection.add("Charlotte Douglas International Airport");
refCollection.add("Birmingham-Shuttlesworth International Airport");
refCollection.add("Budapest Ferenc Liszt International Airport");
refCollection.add("Cologne Bonn Airport");
refCollection.add("Manhattan Regional Airport");

Iterator<String> refIterator=refCollection.iterator();
while(refIterator.hasNext())
{
	String refString=refIterator.next();
	String ref1=refString.toUpperCase();
	
		System.out.println("airport names that turns into uppercase :"+ref1);
	}

}

	}
