package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLTest {

	public static void main(String[] args) throws Exception{

		String site = "http://apis.data.go.kr/B551182/pubReliefHospService/getpubReliefHospList?ServiceKey=YE6ffrNxT5aMCIO6u1g7JT2a%2Fxh0QoDiQipTgqcLVJoDHzBNaFYflJvMwEuVwgqH35%2FrDSGeB84BViqT2SCGfg%3D%3D&pageNo=1&numOfRows=10&spclAdmTyCd=A0";

		
		URL url = new URL(site);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
//		//여기서 실제로 웹서버로 데이터가 전송된다.
//		conn.setRequestMethod("GET");
//		conn.setRequestProperty("ServiceKey", "");
//		conn.setRequestProperty("pageNo", "1");
//		conn.setRequestProperty("numOfRows", "10");
//		conn.setRequestProperty("spclAdmTyCd", "A0");
		
		int resCode = conn.getResponseCode();
		System.out.println("응답 코드 : " + resCode);
		
		System.out.println("\n---코로나-19관련 병원 운영기관 현황 정보(기관명,소재지,코로나-19관련 운영 유형 등) - 국민안심병원 ---");
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inLine;
		StringBuffer out = new StringBuffer();
		
		while((inLine = in.readLine()) != null) {
			out.append(inLine);
		}
		in.close();
		
		System.out.println(out);
			
		
		
		
	
	}

}
