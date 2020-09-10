package com.feiniao.factorypattern.dao;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		// 创建实现Shape接口的实体类并具体实现draw()方法
		System.out.println("画了一个长方形");
		
	}

}
