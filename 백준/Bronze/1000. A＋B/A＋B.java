import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ss = br.readLine();
        String[] s = ss.split(" ");
        System.out.print(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
    }
}