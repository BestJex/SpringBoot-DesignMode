package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>各驱动之间的桥梁</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 4:42 2018-11-12
 * @version V.0.1.1
 */
public abstract  class AbstractBridge {

    // 聚合和关联驱动接口实例
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public abstract void connect();
}
