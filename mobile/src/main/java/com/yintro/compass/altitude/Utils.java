package com.yintro.compass.altitude;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hoyin on 21/2/2017.
 */
public class Utils {

//    private static double getAltitude(Double longitude, Double latitude) {
//        double result = Double.NaN;
//        HttpClient httpClient = new DefaultHttpClient();
//        HttpContext localContext = new BasicHttpContext();
//        String url = "http://gisdata.usgs.gov/"
//                + "xmlwebservices2/elevation_service.asmx/"
//                + "getElevation?X_Value=" + String.valueOf(longitude)
//                + "&Y_Value=" + String.valueOf(latitude)
//                + "&Elevation_Units=METERS&Source_Layer=-1&Elevation_Only=true";
//        HttpGet httpGet = new HttpGet(url);
//        try {
//            HttpResponse response = httpClient.execute(httpGet, localContext);
//            HttpEntity entity = response.getEntity();
//            if (entity != null) {
//                InputStream instream = entity.getContent();
//                int r = -1;
//                StringBuffer respStr = new StringBuffer();
//                while ((r = instream.read()) != -1)
//                    respStr.append((char) r);
//                String tagOpen = "<double>";
//                String tagClose = "</double>";
//                if (respStr.indexOf(tagOpen) != -1) {
//                    int start = respStr.indexOf(tagOpen) + tagOpen.length();
//                    int end = respStr.indexOf(tagClose);
//                    String value = respStr.substring(start, end);
//                    result = Double.parseDouble(value);
//                }
//                instream.close();
//            }
//        } catch (ClientProtocolException e) {}
//        catch (IOException e) {}
//        return result;
//    }
}
