package com.zbatch1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.zbatch1.Entity.address;

@Component
public class addressService 
{
  @Autowired
  IAddressPersistance InterfaceObj1;
  
  
  public List<address> getAddress()
  {
  return InterfaceObj1.findAll();
}
 
  public address createAddress(address payload)
  {
	  return InterfaceObj1.save(payload);
  }
}
  

