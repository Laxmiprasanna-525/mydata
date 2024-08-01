package com.zbatch1.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zbatch1.Entity.vendor;

@RepositoryRestResource(collectionResourceRel = "VENDOR_TABLE", path = "newVendor")
public interface vendorContollerNew extends JpaRepository<vendor, Long> {

}
