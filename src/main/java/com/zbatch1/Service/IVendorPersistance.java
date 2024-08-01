package com.zbatch1.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zbatch1.Entity.vendor;

public interface IVendorPersistance extends JpaRepository<vendor, Long>
{
   List<vendor> findByCompanyName(String companyName);
   
   @Query(nativeQuery=true,
		   value="SELECT * FROM public.vendor_table where lower(GST_NO) like %?1% ")
   List<vendor> lookupVendorByGST(String GSTNo);
}
