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
		String abc = "fuck";
		String str = "{8:\""+abc+"\"}";
		System.err.println(str);
	}
}
