public class Rav1 {
	public static void main(String[] args) {
		String cmd1 = "rundll32 url.dll,FileProtocolHandler " +"C:\\Documents and Settings\\developer\\Desktop\\id.val";
		try {
			Runtime.getRuntime().exec(cmd1);
		} catch (Exception ex) {
			if (ex.toString().contains("java.io.IOException: Cannot run program \"rundll32\"")) {
				try {
					Runtime rt = Runtime.getRuntime();
					rt.exec("open " + "C:\\Documents and Settings\\developer\\Desktop\\id.val");
				} catch (Exception as) {
					as.printStackTrace();
				}
			} else {
				System.out.println("mar gaye");
			}
		}
	}
}