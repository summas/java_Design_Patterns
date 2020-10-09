package DreamGateCSVSample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import DreamGateCSVSample.csvData.Key;

//import javax.servlet.http.Part;
//
//import Beans.alldispbean;
//import Classes.SqlConnection;
//import Classes.SqlManager;
//import Classes.URL;

public class dfgcsvTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String fileName = "Sheet1.csv";
		System.out.println(fileName);

		String path = "C:\\Users\\Owner\\Documents\\SE関連\\雑\\csvTEST\\" + fileName;

		List<csvData> csvList = new ArrayList<>();

		try {
			// 追加CSV
			FileInputStream fis = new FileInputStream(path);

			InputStreamReader csv;

			csv = new InputStreamReader(fis, "UTF-8");

			BufferedReader br = new BufferedReader(csv);

			ArrayList<String> data = new ArrayList<>();
			// List<alldispbean> list = new ArrayList<>();

			String line;

			// 最終行まで読み込む
			while ((line = br.readLine()) != null) {

				// 1行をデータの要素に分割
				String[] csvData = line.split(",");
				List<String> srtCsv = Arrays.asList(csvData);
				csvList.add(new csvData(csvData[0], csvData[1], csvData[2], csvData[3], csvData[4], csvData[5]));

				StringBuffer buf = new StringBuffer();
				srtCsv.forEach(x -> buf.append(x));

				System.out.println(line.toString());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map<Integer, csvData> mapData = new HashMap<>();
		Map<Integer, Map<Integer, csvData>> mapDataSeq = new HashMap<>();
		for (csvData csvLine : csvList){
			 mapData.put(csvLine.getKey().hashcode(), csvLine);
			 mapDataSeq.put(csvLine.getKey().hashcodeSeq(), mapData);
		}
			
//		csvList.forEach(x -> mapData.put(x.getKey().hashcode(), x));
//		csvList.forEach(x -> mapDataSeq.put(x.getKey().hashcodeSeq(), (mapData.put(x.getKey().hashcode(), x))));

		Map<Integer, String> csvMap = csvList.stream()
				.map(x -> x.getKey())
				.filter(x -> mapData.get(x.hashcode()) != null)
				.collect(Collectors.toMap(Key::hashcode, x -> createTest(mapDataSeq.get(x.hashcodeSeq()).get(x.hashcode()))));
		String out = csvMap.values().toString();
		System.out.println("out前");
		System.out.println(out);
		return;
	}

	private static String createTest(csvData csvData) {
		String re = "2";
		re = re + csvData.getKey1() + csvData.getKey2() + csvData.getSeq() + csvData.getData1() + csvData.getData2()
				+ csvData.getData3();
		System.out.println("re前");
		System.out.println(re);
		return re;
	}

}
