package com.phj.soap.model.response;

import org.simpleframework.xml.Element;

/**
 * 描述：
 * Created by PHJ on 2019/5/5.
 */
public class WeatherResponseBody {

    @Element(name = "getWeatherbyCityNameResponse", required = false)
    private WeatherResponseModel weatherResponseModel;

    public WeatherResponseModel getWeatherResponseModel() {
        return weatherResponseModel;
    }

    public void setWeatherResponseModel(WeatherResponseModel weatherResponseModel) {
        this.weatherResponseModel = weatherResponseModel;
    }
}
