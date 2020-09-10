package com.feiniao.factorypattern.service;

import com.feiniao.factorypattern.dao.Circle;
import com.feiniao.factorypattern.dao.Rectangle;
import com.feiniao.factorypattern.dao.Shape;
import com.feiniao.factorypattern.dao.Square;

//����һ�����������ɻ��ڸ�����Ϣ��ʵ����Ķ���
public class ShapeFactory {
	
	//ʹ��getShape������ȡ��״���͵Ķ���
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
