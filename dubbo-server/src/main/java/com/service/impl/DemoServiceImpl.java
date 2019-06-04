package com.service.impl;

import java.util.List;

import com.service.DemoService;

public class DemoServiceImpl implements DemoService {  
  
    public String sayHello(String name) {  
        System.out.println("init : server is starting: " + name);  
        return "hello ," + name +",you have get info from server by dubbo and zookeeper!";  
    }

	public List getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
