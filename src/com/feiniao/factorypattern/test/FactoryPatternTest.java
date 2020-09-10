package com.feiniao.factorypattern.test;

import com.feiniao.factorypattern.dao.Shape;
import com.feiniao.factorypattern.service.ShapeFactory;

//����
public class FactoryPatternTest {
	public static void main(String[] args){
		//�½�һ������
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//��ȡCircle�Ķ��󣬲���������draw����
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		//��ȡSquare�Ķ��󣬲���������draw����
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		//��ȡRectangle�Ķ��󣬲���������draw����
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
	}
}
