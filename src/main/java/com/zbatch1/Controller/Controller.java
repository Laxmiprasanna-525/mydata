package com.zbatch1.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zbatch1.Entity.vendor;

@RestController


public class Controller 
{
 @Autowired
  com.zbatch1.Service.vendorService vendorService;
 
	@RequestMapping("/vendor")
   public List<vendor> getVendors()
   {   
        return vendorService.readALLVendors();
   }
   
      @RequestMapping("/vendor/{vendorCode}")
   public vendor getVendorById(@PathVariable("vendorCode") Long code)
   {
       Optional<vendor> searchResult = vendorService.getSingleVendor(code);
       if(!searchResult.isPresent())
       {
    	   return new vendor((long)0, "","","","","","","");
       }
 	   return searchResult.get();
   }
   
   @PostMapping("/vendor")
   public vendor createVendor(@RequestBody vendor myBody)
   {
	   return vendorService.createVendor(myBody);
   }
   
   @RequestMapping("/vendor/search")
   public List<vendor> serachByCompany(@RequestParam String company)
   {
	   return vendorService.searchBycompanyName(company);
   }
   
   @RequestMapping("/vendor/lookup/{gstno}")
   public List<vendor> serachvendorByGST(@PathVariable("gstno") String GSTNo)
   {
	   return vendorService.lookupVendorByGST(GSTNo);
   }
   
   @RequestMapping(method = RequestMethod.PUT, value = "/vendor")
   public vendor updateVendor(@RequestBody vendor myChangedVendor)
   {
 	   return vendorService.changeVendor(myChangedVendor);
   }
   
   @RequestMapping(method = RequestMethod.DELETE, value = "/vendor/{id}")
   public String removeVendor(@PathVariable("id") Long Id)
   {
	   return vendorService.deleteVendor(Id);
   }
   

}
