package com.examle.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.baeldung.com/");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        try (
            Reader reader = new InputStreamReader(
                    con.getInputStream(), "utf-8");
            BufferedReader buf = new BufferedReader(reader);
            )

            {
                String line = "";
                while ((line = buf.readLine()) != null) {
                    System.out.println(line);
                }

            }
        System.out.println(con.getReadTimeout());
    }
}
