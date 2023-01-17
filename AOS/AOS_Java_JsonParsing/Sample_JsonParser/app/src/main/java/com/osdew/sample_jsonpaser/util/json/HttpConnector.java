package com.osdew.sample_jsonpaser.util.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnector extends Thread {

    @Override
    public void run() {
        try {

            URL url = new URL("http://lara.osdew.com/api/dummy");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn != null) {
                conn.setConnectTimeout(10000); // 10초 동안 기다린 후 응답이 없으면 종료
                conn.setRequestMethod("GET");
                int resCode = conn.getResponseCode();
                if (resCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String line = null;
                    while (true) {
                        line = reader.readLine();

                        if (line == null) {
                            break;
                        }
                        JsonParser.jsonPaser(line);
                    }
                    reader.close();
                }
                conn.disconnect();
            }
        } catch (Exception e) {

        }
    }
}
