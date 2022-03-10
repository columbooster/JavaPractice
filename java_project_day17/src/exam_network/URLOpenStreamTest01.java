package exam_network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLOpenStreamTest01 {

	public static void main(String[] args) {

		BufferedReader in = null;
		PrintWriter out = null;

		try {
			URL url = new URL("https://www.hanbit.co.kr/");
			// url.openStream() 바이트 단위로 - InputStream => InputStreamReader 문자단위를 라인단위로 => BufferedReader
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			out = new PrintWriter(new FileWriter("index.html"));
			String inline;
			while ((inline = in.readLine()) != null) {
				// System.out.println(inline);
				out.println(inline);
			}
			System.out.println("파일이 출력되었습니다.");

		} catch (MalformedURLException e) {
			System.out.println("URL ERROR");
		} catch (IOException i) {
			System.out.println("IO ERROR");
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (Exception e) {
				System.out.println("CLOSE ERROR");
			}
		}

	}

}
