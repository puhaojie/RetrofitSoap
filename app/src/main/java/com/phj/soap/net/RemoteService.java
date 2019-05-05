package com.phj.soap.net;


import com.phj.soap.model.request.RequestEnvelope;
import com.phj.soap.model.response.ResponseEnvelope;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 描述：网络请求的的接口
 * Created by PHJ on 2019/5/5.
 */
public interface RemoteService {

    @Headers({"Content-Type: text/xml;charset=UTF-8", "SOAPAction: http://WebXml.com.cn/getWeatherbyCityName"})
    @POST("WeatherWebService.asmx")
    Call<ResponseEnvelope> getWeatherByCityName(@Body RequestEnvelope requestEnvelope);
}
