package com.phj.soap.model.response;

import org.simpleframework.xml.Element;

/**
 * 描述：
 * Created by PHJ on 2019/5/5.
 */

public class ResponseEnvelope {
    @Element(name = "Body")
    private WeatherResponseBody responseBody;

    public WeatherResponseBody getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(WeatherResponseBody responseBody) {
        this.responseBody = responseBody;
    }
}
