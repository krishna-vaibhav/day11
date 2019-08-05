package com.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pojos.Vendor;

@Service //To tell SC --following class contains B.L methods
public class VendorServiceImpl implements VendorService {
	private HashMap<String,Vendor> vendors;
	
	public VendorServiceImpl() {
		System.out.println("in constr of "+getClass().getName());
		vendors=new HashMap<>();
		vendors.put("abc@gmail", new Vendor(1, "abc", "abc@gmail", "1234", "pune", "12345678","vendor"));
		vendors.put("abc2@gmail", new Vendor(2, "abc2", "abc2@gmail", "4234", "mumbai", "67845678","admin"));
	}
	
	@Override
	public Vendor validateUser(String email, String pass) {
		Vendor v=vendors.get(email);
		if(v != null)
			if(v.getPassword().equals(pass))
				return v;
		return null;
	}

	@Override
	public List<Vendor> listVendors() {
		// TODO Auto-generated method stub
		return new ArrayList<>(vendors.values());
	}

}
