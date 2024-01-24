package tuan4;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class Bai456 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://sharecode.vn/tim-kiem.htm?tu-khoa=code&ngon-ngu=0");
            //Phan tich thong tin tu url
            System.out.println("Protocol : "+url.getProtocol());
            System.out.println("Host : "+url.getHost());
            System.out.println("Port : " + url.getPort());
            System.out.println("Path : " + url.getPath());
            System.out.println("Query : " + url.getQuery());
            System.out.println("Reference : " + url.getRef());
            URLConnection urlConnection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            FileWriter fileWriter = new FileWriter("data.html");
            
            while((line = reader.readLine()) != null){
                System.out.println(line);
                fileWriter.write(line + "\n");
            }
            fileWriter.close();
            reader.close();
            
        } catch (Exception e) {
        }
    }
}
