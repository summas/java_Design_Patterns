package DreamGateCSVSample;

public class csvData {

	class Key {
		private String key1;
		private String key2;
		private String seq;

//		public String getKey1() {
//			return key1;
//		}
//
//		public String getKey2() {
//			return key2;
//		}
//
//		public String getSeq() {
//			return seq;
//		}
		
		public int hashcode(){
			String hash = key1 + key2;
			return hash.hashCode();
		}
		
		public int hashcodeSeq(){
			String hash = key1 + key2 + seq;
			return hash.hashCode();
		}

	}

	private Key key = new Key();
	private String data1;
	private String data2;
	private String data3;

	public Key getKey() {
		return key;
	}
	
	public String getKey1() {
		return key.key1;
	}

	public void setKey1(String key1) {
		this.key.key1 = key1;
	}

	public String getKey2() {
		return key.key2;
	}

	public void setKey2(String key2) {
		this.key.key2 = key2;
	}

	public String getSeq() {
		return key.seq;
	}

	public void setSeq(String seq) {
		this.key.seq = seq;
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}

	public csvData(String key1, String key2, String seq, String data1, String data2, String data3) {
		this.key.key1 = key1;
		this.key.key2 = key2;
		this.key.seq = seq;
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

}
