package com.zbatch1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zbatch1.Entity.address;
import com.zbatch1.Service.addressService;

@RestController
public class addressController 
{ 
	@Autowired
	addressService addrsrv;
	
	 @RequestMapping("/addresses")
	  public List<address> getAddress()
	  {
	  return addrsrv.getAddress();
	}
	  @PostMapping("/addresses")
	  public address createAddress(@RequestBody address payload)
	  {
		  return addrsrv.createAddress(payload);
	  }

}
