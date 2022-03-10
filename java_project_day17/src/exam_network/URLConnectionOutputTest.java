package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class URLConnectionOutputTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		BufferedReader in = null;
		URL url = new URL("https://www.hanbit.co.kr/search/search_list.html");
		URLConnection con = url.openConnection();
		con.setDoOutput(true); // URLConnection의 출력 스트림을 사용할지의 여부를 나타낸다.

		OutputStream os = con.getOutputStream();
		PrintWriter out = new PrintWriter(os);
		out.println("keyword=자바");
		out.close();

		in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inLine;
		while ((inLine = in.readLine()) != null) {
			System.out.println(inLine);
		}

	}

}
