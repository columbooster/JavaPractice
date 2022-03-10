package exam_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// 웹에서 이미지 파일을 다운로드할 수 있도록 코드 작성해주세요.

public class DownloadImage {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;
		int readByteNo;
		String website = "https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";

		try {
			URL url = new URL(website);
			URLConnection con = url.openConnection();
			in = new BufferedInputStream(con.getInputStream());

			out = new BufferedOutputStream(new FileOutputStream("googlelogo.png"));

			byte[] data = new byte[2048];
			while ((readByteNo = in.read(data)) != -1) {
				out.write(data, 0, readByteNo);
			}
			System.out.println(website + "에서 이미지를 다운로드 완료되었습니다.");

		} catch (MalformedURLException e) {
			System.out.println("URL ERROR");
		} catch (IOException e) {
			System.out.println("IO ERROR");
		} finally {
			try {
				if (out != null)
					out.close();
				if (in != null)
					in.close();
			} catch (Exception e2) {
				System.out.println("CLOSE ERROR");
			}
		}

	}

}
