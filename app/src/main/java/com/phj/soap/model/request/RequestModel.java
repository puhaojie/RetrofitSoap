package com.phj.soap.model.request;

import org.simpleframework.xml.Element;

/**
 * 描述：参数
 * Created by PHJ on 2019/5/5.
 */
public class RequestModel {

    @Element(name = "theCityName")
    public String cityName;     //城市名字


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
