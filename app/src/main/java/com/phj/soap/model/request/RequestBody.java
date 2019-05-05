package com.phj.soap.model.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

/**
 * 描述：Body层XML
 * Created by PHJ on 2019/5/5.
 */

@NamespaceList({
        @Namespace(reference = "http://WebXml.com.cn/")
})
public class RequestBody {

    @Element(name = "getWeatherbyCityName")
    private RequestModel getWeatherbyCityName;

    public void setGetWeatherbyCityName(RequestModel getWeatherbyCityName) {
        this.getWeatherbyCityName = getWeatherbyCityName;
    }
}
