package com.feiniao.factorypattern.test;

import com.feiniao.factorypattern.dao.Shape;
import com.feiniao.factorypattern.service.ShapeFactory;

//测试
public class FactoryPatternTest {
	public static void main(String[] args){
		//新建一个工厂
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//获取Circle的对象，并调用它的draw方法
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		//获取Square的对象，并调用它的draw方法
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		//获取Rectangle的对象，并调用它的draw方法
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
	}
}
