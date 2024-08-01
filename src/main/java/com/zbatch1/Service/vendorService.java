package com.zbatch1.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zbatch1.Entity.vendor;

@Component
public class vendorService 
{ 
	@Autowired
    IVendorPersistance interfaceObj;
	
	public List<vendor> readALLVendors()
	{
		return interfaceObj.findAll();
	 }

	 
	 public vendor createVendor(vendor myBodyObj)
	 { 
		 return interfaceObj.save(myBodyObj);
	 }
	 
	 public List<vendor> searchBycompanyName(String companyName)
	 {
		 return interfaceObj.findByCompanyName(companyName);
	 }
	 
	 public List<vendor> lookupVendorByGST(String GSTNo)
	 {
		 return interfaceObj.lookupVendorByGST(GSTNo);
	 }
	 
	 public Optional<vendor> getSingleVendor(Long id)
	 {
		 return interfaceObj.findById(id);
	 }
	 
	 public vendor changeVendor(vendor payload)
	 {
		 Optional<vendor> myVendor = interfaceObj.findById(payload.getId());
		 if(!myVendor.isPresent())
		 {
			 return new vendor((long)0, "","","","","","","");
		 }
		 return interfaceObj.save(payload);
				 
	 }
	 
	 public String deleteVendor(Long Id)
	 {
		 interfaceObj.deleteById(Id);
		return "Deleted Successfully";
	 }


}
