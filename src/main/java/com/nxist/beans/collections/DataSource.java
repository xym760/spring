package com.nxist.beans.collections;

import java.util.Properties;

/**
 * @Author: xym760
 * @Date: 2019/5/30 17:28
 * @Description:
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
