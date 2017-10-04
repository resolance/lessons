package ru.ezhov.lessons.homework.resolance.homework.HttpGet;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HttpGetTest {
    public static void main(String[] args) throws Exception {
        final String PUBLIC_URL = "https://poloniex.com/public?command=returnTicker";
        //final String PUBLIC_URL = "https://prog-tools.ru/rest-services/json";
        //List<NameValuePair> list = new ArrayList();
        //list.add("USDT_BTC");
        // list.add("USDT_ETH");

        /*HttpGetResp httpClient = new HttpGetResp();
        Gson gson = new Gson();
        try {
            //System.out.println(httpClient.getHttp(PUBLIC_URL));
            gson.fromJson(httpClient.getHttp(PUBLIC_URL),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }
        };

        // Install the all-trusting trust manager
        SSLContext sslcont = SSLContext.getInstance("SSL");
        sslcont.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sslcont.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting host verifier
        //HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

       /* //URL url = new URL("https://prog-tools.ru/rest-services/json");
        URL url = new URL("https://poloniex.com/public?command=returnTicker");
        URLConnection con = url.openConnection();
        Reader reader = new InputStreamReader(con.getInputStream());
        String json = "";
        while (true) {
            int ch = reader.read();
            Character character = (char)ch;
            json =json + String.valueOf(character);
            //System.out.print(character);
            if (ch==-1) {
                break;
            }
        }

        //Gson gson = new Gson();
       // JsonClass read = gson.fromJson(json, JsonClass.class);
       // System.out.println(read);
        System.out.println(json);
*/
       System.out.print("readJson: ");
        readJson();
        System.out.println();
    }

    private static void readJson() throws IOException {
        //String str;
        String str = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}";

       /* URL url = new URL("https://poloniex.com/public?command=returnTicker");
        URLConnection con = url.openConnection();
        Reader reader = new InputStreamReader(con.getInputStream());
        String json = "";
        while (true) {
            int ch = reader.read();
            Character character = (char)ch;
            json =json + String.valueOf(character);
            //System.out.print(character);
            if (ch==-1) {
                break;
            }
        }
        str = json;*/
        str = "{\"BTC_BCN\":{\"id\":7,\"last\":\"0.00000029\",\"lowestAsk\":\"0.00000030\",\"highestBid\":\"0.00000029\",\"percentChange\":\"-0.03333333\",\"baseVolume\":\"38.13187387\",\"quoteVolume\":\"129751079.03233366\",\"isFrozen\":\"0\",\"high24hr\":\"0.00000031\",\"low24hr\":\"0.00000028\"}," +
                "\"BTC_BELA\":{\"id\":8,\"last\":\"0.00003331\",\"lowestAsk\":\"0.00003336\",\"highestBid\":\"0.00003301\",\"percentChange\":\"0.04781377\",\"baseVolume\":\"14.83464931\",\"quoteVolume\":\"459158.09359665\",\"isFrozen\":\"0\",\"high24hr\":\"0.00003488\",\"low24hr\":\"0.00003018\"}}";

        InputStream in = new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8")));
        JsonReader jReader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        while (jReader.hasNext()) {
            JsonToken jsonToken = jReader.peek();
            if(jsonToken == JsonToken.BEGIN_OBJECT) {
                jReader.beginObject();
            } else if(jsonToken == JsonToken.END_OBJECT) {
                jReader.endObject();
            } if(jsonToken == JsonToken.STRING) {
                System.out.print(jReader.nextString() + " "); // print Hi World!
            } if(jsonToken == JsonToken.NUMBER) {
                System.out.print("\nid: " + jReader.nextString() + "\n"); // print Hi World!
            } if(jsonToken == JsonToken.BOOLEAN) {
                System.out.print("\nisFrozen: " + jReader.nextString() + "\n"); // print Hi World!
            } else {
                jReader.skipValue();
            }
        }
        jReader.close();
    }
}
