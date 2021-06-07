package com.examle.app;

import java.net.*;


class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.herbschildt.com");
        System.out.println(Address);
        System.out.println("  ");

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);

    }
}
















//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;

//public class Main {
//
//    public static void main(String[] args) throws Exception {
//
//        String s = "http://yandex.ru?color1=" +
//                URLEncoder.encode("красный", "utf-8") + "&color2" +
//                URLEncoder.encode("белый", "utf-8");
//
//        URL url = new URL(s);
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//
////        con.setConnectTimeout(5000);
////        con.setReadTimeout(500
////        con.setDoInput(true);
//        con.setRequestMethod("GET");
////        con.setRequestProperty("User-Agent", "MySprider/1.0");
////        con.setRequestProperty("Assept", "text/html, text/plain");
////        con.setRequestProperty("Accept-Langvige", "ru, re-Ru");
//
//        con.connect();
//
//        if (con.getResponseCode() >= 200 && con.getResponseCode() < 300) {
//            try (
//                    Reader reader = new InputStreamReader(
//                            con.getInputStream(), "utf-8");
//                    BufferedReader buf = new BufferedReader(reader);
//            )
//            {
//            String  line = "";
//            while ((line = buf.readLine()) != null) {
//                System.out.println(line);
//            }
//            }
//        }
//        else {
//                System.out.println("Код: " + con.getResponseMessage());
//            }
//        if (con != null) con.disconnect();
//        }
//
//
//}



//        URLConnection con = url.openConnection();
//
//        Map<String, List<String>> map = con.getHeaderFields();
//        for (String key: map.keySet()) {
//            System.out.println(new Date(con.getDate()));
//            //   System.out.println(key + ": "+ map.get(key).toString());
//        }




//        try (
//            Reader reader = new InputStreamReader(
//                    con.getInputStream(), "utf-8");
//            BufferedReader buf = new BufferedReader(reader);
//            )
//
//            {
//                String line = "";
//                while ((line = buf.readLine()) != null) {
//                    System.out.println(line);
//                }
//
//            }
//        System.out.println(con.getReadTimeout());
