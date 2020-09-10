package com.feiniao.factorypattern.service;

import com.feiniao.factorypattern.dao.Circle;
import com.feiniao.factorypattern.dao.Rectangle;
import com.feiniao.factorypattern.dao.Shape;
import com.feiniao.factorypattern.dao.Square;

//创建一个工厂，生成基于给定信息的实体类的对象
public class ShapeFactory {
	
	//使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
}
