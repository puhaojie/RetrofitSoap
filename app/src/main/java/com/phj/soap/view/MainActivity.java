package com.phj.soap.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.phj.soap.R;
import com.phj.soap.model.request.RequestBody;
import com.phj.soap.model.request.RequestEnvelope;
import com.phj.soap.model.request.RequestModel;
import com.phj.soap.model.response.ResponseEnvelope;
import com.phj.soap.net.Network;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        getWeatherByCityName();
    }


    /**
     * 根据城市名获取天气情况
     * @return
     */
    public void getWeatherByCityName() {
        RequestEnvelope requestEnvelop = new RequestEnvelope();
        RequestBody requestBody = new RequestBody();
        RequestModel requestModel = new RequestModel();
        requestModel.setCityName("合肥");
        requestBody.setGetWeatherbyCityName(requestModel);
        requestEnvelop.setRequestBody(requestBody);



        Call<ResponseEnvelope> call = Network.remote().getWeatherByCityName(requestEnvelop);
        call.enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {

                ResponseEnvelope responseEnvelope = response.body();
                if (responseEnvelope != null ) {
                    List<String> weatherResult = responseEnvelope.getResponseBody().getWeatherResponseModel().getResult();
                    textView.setText(weatherResult.get(0));
                }
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {

            }
        });
    }
}
