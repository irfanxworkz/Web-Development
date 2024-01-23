package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.store.dto.CountryDTO;
import com.xworkz.store.dto.PresidentDTO;

public class CountryRunner {

	public static void main(String[] args) {
		
		CountryDTO countryDTO1=new CountryDTO(840, "United States");
		CountryDTO countryDTO2=new CountryDTO(156, "CHINA");
		CountryDTO countryDTO3=new CountryDTO(356, "India");
		CountryDTO countryDTO4=new CountryDTO(40, "Australia");
		CountryDTO countryDTO5=new CountryDTO(250, "France");
		
		PresidentDTO presidentDTO1=new PresidentDTO(3, "Joe Bidae");
		PresidentDTO presidentDTO2=new PresidentDTO(1, "Xi Jimping");
		PresidentDTO presidentDTO3=new PresidentDTO(5, "Droupadi Murmu");
		PresidentDTO presidentDTO4=new PresidentDTO(8, "Sue Lines");
		PresidentDTO presidentDTO5=new PresidentDTO(4, "Emmanuel Macron");
		
		Map<CountryDTO, PresidentDTO> countryWithPresident = new HashMap<CountryDTO, PresidentDTO>();

		countryWithPresident.put(countryDTO1, presidentDTO1);
		countryWithPresident.put(countryDTO2, presidentDTO2);
		countryWithPresident.put(countryDTO3, presidentDTO3);
		countryWithPresident.put(countryDTO4, presidentDTO4);
		countryWithPresident.put(countryDTO5, presidentDTO5);
		
		System.out.println("size of CountryWithPresident : "+countryWithPresident.size());
		
		System.out.println("-----------------------------------------------");
		
		Set<CountryDTO> countrySet= countryWithPresident.keySet();
		countrySet.forEach(ck->System.out.println("Country Key : "+ck));
		
		Collection<PresidentDTO> presidentValue= countryWithPresident.values();
		presidentValue.forEach(pv->System.out.println("President Value : "+ presidentValue));
		
		System.out.println("---------------------------------------------------------------");
		
		Set<Entry<CountryDTO, PresidentDTO>> entrySet= countryWithPresident.entrySet();
		entrySet.forEach(es->System.out.println(es));
		
		System.out.println("---------------------------------------------------------------");
		
		Iterator<Entry<CountryDTO, PresidentDTO>>  iteraorSet =entrySet.iterator();
		while (iteraorSet.hasNext()) {
			
		Entry<CountryDTO, PresidentDTO> entry =iteraorSet.next();
		System.out.println(entry);
			
			
		}
	}

}
