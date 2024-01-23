package com.xworkz.map.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.store.dto.CompanyDTO;
import com.xworkz.store.dto.ProductDTO;

public class StoreRunner {

	public static void main(String[] args) {
		
		ProductDTO productDTO1 = new ProductDTO("Mobile", 30000, 1, 5, LocalDate.of(2023, 3, 26));
		ProductDTO productDTO2 = new ProductDTO("Watch", 5000, 2, 10, LocalDate.of(2023, 5, 15));
		ProductDTO productDTO3 = new ProductDTO("Laptop", 60000, 2, 2, LocalDate.of(2023, 8, 10));
		
		CompanyDTO companyDTO1 = new CompanyDTO("Iphone", "Rajaji-Nagar", "iphonemxtxt1211ip");
		CompanyDTO companyDTO2 = new CompanyDTO("Bolt", "Online-Flipkart", "watchmstv123wt");
		CompanyDTO companyDTO3 = new CompanyDTO("HP", "Jaipur", "lapm]vctfvhjd567lp");
		
		Map<ProductDTO, CompanyDTO> store= new HashMap<ProductDTO, CompanyDTO>();
		store.put(productDTO1, companyDTO1);
		store.put(productDTO2, companyDTO2);
		store.put(productDTO3, companyDTO3);
		
		System.out.println(" total size of store :"+store.size());
		
		System.out.println("------------------------------------");
		Set<ProductDTO> productKey= store.keySet();
		productKey.forEach(k->System.out.println("product key :"+k));
		System.out.println("------------------------------------");
		Collection<CompanyDTO> companyvalue= store.values();
		companyvalue.forEach(v->System.out.println("value of company : "+v));
	}

}
