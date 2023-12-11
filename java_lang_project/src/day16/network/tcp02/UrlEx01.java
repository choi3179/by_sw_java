package day16.network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx01 {
    public static void main(String[] args) throws IOException {
        URL google = new URL("https://www.google.com");

        BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));

        String inputLine;
        while((inputLine = br.readLine()) != null)
            System.out.println(inputLine);
    }
}
