package com.appleyk.DMA10_桥接模式.DM10.paint.shape;

/**
 * <p>矩形、长方形</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:09 2018-11-19
 * @version V.0.1.1
 */
public class Rectangle extends AbstractShape {
    @Override
    public  void draw() {
        getColor().painting("矩形");
    }
}
