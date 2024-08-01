package com.zbatch1.Entity;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
@Table(name="VENDOR_TABLE")
public class vendor 
{
    @Id
    @Column(nullable = false, name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
    @Column(nullable = false, name="COMPANY_NAME")
	public String companyName;
    @Column(nullable = false, name="FIRST_NAME")
	public String FirstName;
    @Column(nullable = false, name="LAST_NAME")
	public String lastName;
    @Column(nullable = false, name="WEBSITE")
	public String website;
    @Column(nullable = false, name="EMAIL")
	public String email;
    @Column(nullable = false, name="STATUS")
	public String status;
    @Column(nullable = false, name="GST_NO")
	public String Gst_No;
    
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="vendor_table", referencedColumnName = "ID")
    private List<address> addresses = new ArrayList<>();
  
    
    
    public List<address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<address> addresses) 
    {
		this.addresses = addresses;
	}

	public vendor()
    {
    	
    }
    
	public vendor(Long id, String companyName, String firstName, String lastName, String website, String email,
			String status, String gst_No) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.FirstName = firstName;
		this.lastName = lastName;
		this.website = website;
		this.email = email;
		this.status = status;
		Gst_No = gst_No;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGst_No() {
		return Gst_No;
	}
	public void setGst_No(String gst_No) {
		Gst_No = gst_No;
	}
   
 
    
    
    
    
}
	
	
	
