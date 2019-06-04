package com.dr.service;

import com.dr.api.DemoService;

public class DemoServiceImpl implements DemoService {

    public String hello(String name) {
        return "hello, "+name;
    }
}
