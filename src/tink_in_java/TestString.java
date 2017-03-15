import java.io.File;


public class TestString {
	public static void main(String[] args){
//		 String filePath = "/storage/emulated/0/Android/data/com.tmall.wireless/files/common/tm_fb_1421809555492.jpg";
//         if(filePath!=null && filePath.length()>0){
//             int index= filePath.lastIndexOf(File.separator);
//             if(index+1<filePath.length()){
//            	 String fileName = filePath.substring(index+1);
//            	 System.out.println(fileName);
//             }
//         }
//		String abc = "fuck";
//		String str = "{8:\""+abc+"\"}";
//		System.err.println(str);
//
//		System.out.println(""+((Object)null));
//
//		String str1= "我是你33的谁";
//		System.out.println(str1.length());
//
//		StringBuilder sb = new StringBuilder();
//		sb.append("xxxx").append(",").append("yyyyy").append(",");
//		System.out.println(sb.toString());
//		sb.deleteCharAt(sb.length() - 1);
//		System.out.println(sb.toString());

		System.out.println(isNeedUpdate("3.2.6.999","3.2.7.0.0"));
		System.out.println(isNeedUpdate("3.2.5","3.2.6"));

	}

	private static boolean isNeedUpdate(String localVersion, String onlineVersion) {
		if (localVersion.equals(onlineVersion))
		{
			return false;
		}
		String[] localArray = localVersion.split("\\.");
		String[] onlineArray = onlineVersion.split("\\.");

		int length = localArray.length > onlineArray.length ? localArray.length : onlineArray.length;

		for (int i = 0; i < length; i++)
		{
			int onlineBit = i<onlineArray.length? Integer.parseInt(onlineArray[i]): 0;
			int localBit = i<localArray.length? Integer.parseInt(localArray[i]): 0;

			if(onlineBit==localBit)
				continue;

			if (onlineBit > localBit)
			{
				return true;
			}
			else {
				return false;
			}
		}

		return false;
	}
}
