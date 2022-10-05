package com.billing.crud.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.crud.web.dao.HomeDao;
import com.billing.crud.web.model.Product;
import com.billing.crud.web.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDao hd;

	@Override
	public void saveprodata(Product p) {
		hd.saveprodata(p);
		
	}
}
