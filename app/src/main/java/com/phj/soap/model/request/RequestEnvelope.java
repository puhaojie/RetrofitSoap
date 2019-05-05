package com.phj.soap.model.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;


/**
 * 描述：Envelope层XML
 * Created by PHJ on 2019/5/5.
 */


// Root代表外层
@Root(name = "soap:Envelope")
@NamespaceList({
        @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
        @Namespace(reference = "http://www.w3.org/2001/XMLSchema", prefix = "xsd"),
        @Namespace(reference = "http://www.w3.org/2003/05/soap-envelope", prefix = "soap")
})
public class RequestEnvelope {
    @Element(name = "soap:Body")
    private RequestBody requestBody;

    public void setRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
    }
}
