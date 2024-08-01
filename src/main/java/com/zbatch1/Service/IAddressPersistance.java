package com.zbatch1.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zbatch1.Entity.address;

public interface IAddressPersistance extends JpaRepository<address, Long>{

}
