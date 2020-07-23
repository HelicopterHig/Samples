package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

import org.json.*;

public class UniqNetClient {
    public static void main(String[] args) throws IOException, JSONException {
        URL url = new URL("http://192.168.0.14:8001");

        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        //
        StringBuilder response = new StringBuilder();

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {

            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
         //   System.out.println(response.toString());
        }catch (ConnectException ex ){
            System.err.println(ex.getMessage());
            return;
        }

        con.disconnect();

        ArrayList<String> lines = new ArrayList();
        JSONArray ja = new JSONArray(response.toString());

        printUniqLines(ja);




    }
    private static void printUniqLines(JSONArray lines) throws JSONException {
        HashSet<String> linesSet = new HashSet();
        for ( int i = 0; i < lines.length(); ++i){
            String line = lines.getString(i);
            if (!linesSet.contains(line)  ){
                System.out.println(line);
                linesSet.add(line);
            }


        }
    }
}
