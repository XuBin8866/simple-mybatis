package com.xxbb.core;

import com.xxbb.bean.Configuration;

/**
 * @author xxbb
 */
public class SqlSessionFactory {
    /**
     * 封装xml配置信息的类
     */
    private Configuration configuartion;


    public SqlSessionFactory(Configuration configuartion){
        this.configuartion=configuartion;
    }
}
