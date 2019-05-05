## RetrofitSoap(使用Retrofit请求Webservice,并解析XML转化为对象)

### SOAP协议是基于HTTP+XML，将请求内容封装成特定格式的XML；解析是将特定格式的XML装换成对象，类似GSON。

#### 请求协议：
         POST http://www.webxml.com.cn/WebServices/WeatherWebService.asmx HTTP/1.1
         Content-Type: text/xml;charset=UTF-8
         Content-Length: 347
         SOAPAction: http://WebXml.com.cn/getWeatherbyCityName
         <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
            <soap:Body xmlns="http://WebXml.com.cn/">
               <getWeatherbyCityName>
                  <theCityName>合肥</theCityName>
               </getWeatherbyCityName>
            </soap:Body>
         </soap:Envelope>

#### 响应协议：
        200 OK http://www.webxml.com.cn/WebServices/WeatherWebService.asmx
        Content-Length: 3229
        Content-Type: application/soap+xml; charset=utf-8
        Server: Microsoft-IIS/7.5
        X-AspNet-Version: 2.0.50727
        X-Powered-By: ASP.NET
        Date: Sun, 05 May 2019 07:11:36 GMT
        OkHttp-Sent-Millis: 1557040300871
        OkHttp-Received-Millis: 1557040300923
        <?xml version="1.0" encoding="utf-8"?>
        <soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
            <soap:Body>
                <getWeatherbyCityNameResponse xmlns="http://WebXml.com.cn/">
                    <getWeatherbyCityNameResult>
                        <string>安徽</string>
                        <string>合肥</string>
                        <string>58321</string>
                        <string>58321.jpg</string>
                        <string>2019/5/5 14:51:16</string>
                        <string>15℃/28℃</string>
                        <string>5月5日 多云</string>
                        <string>东风3-4级转东北风小于3级</string>
                        <string>1.gif</string>
                        <string>1.gif</string>
                        <string>今日天气实况：气温：27℃；风向/风力：东北风 3级；湿度：46%；紫外线强度：弱。空气质量：良。</string>
                        <string>紫外线指数：弱，辐射较弱，涂擦SPF12-15、PA+护肤品。
                                健臻·血糖指数：易波动，血糖易波动，注意监测。
                                穿衣指数：舒适，建议穿长袖衬衫单裤等服装。
                                洗车指数：较适宜，无雨且风力较小，易保持清洁度。
                                空气污染指数：良，气象条件有利于空气污染物扩散。</string>
                        <string>12℃/23℃</string>
                        <string>5月6日 多云</string>
                        <string>东风3-4级转小于3级</string>
                        <string>1.gif</string>
                        <string>1.gif</string>
                        <string>13℃/20℃</string>
                        <string>5月7日 多云转小雨</string>
                        <string>东风小于3级</string>
                        <string>1.gif</string>
                        <string>7.gif</string>
                        <string>合肥市，古称庐州，又名庐阳，位于安徽省中部，地处江淮之间、巢湖北岸，辖东市、西市、中市、郊区4区和长丰、肥东、肥西3县。总面积7266平方公里，人口425.9万。市内道路宽阔，绿树成荫，景色优美，既多现代建筑，又有名胜古迹，是一座古老而又年青的城市。合肥市位于江淮之间，处于中纬度地带，为亚热带湿润季风气候。年平均气温在15℃-16℃之间，极端最低气温-20．6℃，极端最高气温38℃以上。年平均降水量在900-1000毫米之间。全年气温变化的特点是季风明显、四季分明、气候温和、雨量适中、春温多变、秋高气爽、梅雨显著、夏雨集中，总之气候条件优越，气候资源丰富。合肥市素以“三国旧地、包拯故里”闻名于世，具有“淮右襟喉、江南唇齿”的战略地位，常为兵家必争之地。三国时魏将张辽大败孙权十万大军的逍遥津战役，即发生在这里。两千多年前，这里就已开始形成商业都会。秦、汉在此设郡县，明、清为庐州府治，民国时为安徽省省会，如今已是千樯鳞次、商贾辐凑的商业都会。合肥素有“绿色城市”、“花园城市”的美名，其环城公园便修建在合肥古城墙的基础之上，沿着起伏的岗丘地形，加之原有的绿林带及护城河，精筑而成。环城公园总长约达9公里，分为六个景区，其中较为著名的有茂林修竹，夏河朝露的银河景区；湖峦相映、水碧枫赤的西山景区；林木葱茏、芳草常青的环北景区。这样的环城公园无城墙之隔阂，面水而立，一派迷人旖旎的江南风光。</string>
                    </getWeatherbyCityNameResult>
                </getWeatherbyCityNameResponse>
            </soap:Body>
        </soap:Envelope>
