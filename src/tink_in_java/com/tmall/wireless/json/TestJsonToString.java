package com.tmall.wireless.json;


import java.util.ArrayList;

/**
 * Created by hongyunmhy on 15/9/2.
 */
public class TestJsonToString {
	public static void main(String args[]){
//		TMSkinConfig obj = new TMSkinConfig();
//		TMSkinConfig.Style obj2 = new TMSkinConfig.Style();
//		obj.currentStyle = obj2;
//		obj.currentSytleId = 10002l;
//		obj.enable = true;
//		obj2.endTime = 1l;
//		obj2.startTime = 2l;
//		obj2.imgZipUrl  = "zipurl";
//		obj2.imgMap = new HashMap<String, String>();
//		obj2.imgMap.put("key1","value2");
//		obj2.imgMap.put("key2","value3");
//
//		System.out.println(obj);


//		testSplit();


		testVariableArgs();

		testVariableArgs("");

		testVariableArgs(null, "abc");
	}
	public static void testSplit(){
		String mFileName = "head...tail";
		String[] array = mFileName.split("\\.\\.\\.");
		System.out.println(array[0]);
		System.out.println(array[1]);
	}

	public static void testVariableArgs(String... args){
		if(args==null || args.length==0){
			System.out.println("arsg is empty");
		}
	}

}
class TMSkinConfig {
	public long    currentSytleId;
//	public Style   currentStyle;
	public boolean enable;
	public ArrayList styles = new ArrayList();

//	public static class Style {
//		public String                  name;
//		public long                    id;
//		public long                    startTime;
//		public long                    endTime;
//		public String                  imgZipUrl;
//		public String                  imgZipMd5;
//		public HashMap<String, String> imgMap;
//
//		public HashMap<String, Object> modules;
//
//		@Override
//		public String toString()
//		{
//			try{
//				Field[] fields = this.getClass().getFields();
//				if(fields!=null){
//					JSONObject jsonObject = new JSONObject();
//					for(Field f:fields){
//						jsonObject.put(f.getName(),f.get(this));
//					}
//					return jsonObject.toString();
//				}
//			}catch(Exception exc){
//				exc.printStackTrace();
//			}
//			return super.toString();
//		}
//	}
//
//	@Override
//	public String toString()
//	{
//		try{
//			Field[] fields = this.getClass().getFields();
//			if(fields!=null){
//				JSONObject jsonObject = new JSONObject("");
//				for(Field f:fields){
//					jsonObject.put(f.getName(),f.get(this));
//				}
//				return jsonObject.toString();
//			}
//		}catch(Exception exc){
//			exc.printStackTrace();
//		}
//		return super.toString();
//	}
}