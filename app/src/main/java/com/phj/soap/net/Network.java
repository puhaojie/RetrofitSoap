package com.phj.soap.net;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Retrofit 网络请求的封装
 */
public class Network {

    private static Network instance;
    private Retrofit retrofit;
    private OkHttpClient client;

    private final static String BASE_URL = "http://www.webxml.com.cn/WebServices/";
    private static Strategy strategy = new AnnotationStrategy();
    private static Serializer serializer = new Persister(strategy);


    static {
        instance = new Network();
    }

    private Network() {
    }

    private static OkHttpClient getClient() {
        if (instance.client != null)
            return instance.client;
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        // 存储起来
        instance.client = new OkHttpClient.Builder()
                // 给所有的请求添加一个拦截器
                .addInterceptor(interceptor)
                .build();
        return instance.client;
    }

    // 构建一个Retrofit
    private static Retrofit getRetrofit() {
        if (instance.retrofit != null)
            return instance.retrofit;

        // 得到一个OK Client
        OkHttpClient client = getClient();

        // Retrofit
        Retrofit.Builder builder = new Retrofit.Builder();

        // 设置电脑链接
        instance.retrofit = builder.baseUrl(BASE_URL)
                // 设置client
                .client(client)
                // 设置Json解析器
                .addConverterFactory(SimpleXmlConverterFactory.create(serializer))
                .build();

        return instance.retrofit;
    }

    /**
     * 返回一个请求代理
     *
     * @return RemoteService
     */
    public static RemoteService remote() {
        return Network.getRetrofit().create(RemoteService.class);
    }

}
