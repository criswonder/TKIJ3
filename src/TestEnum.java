import java.util.Arrays;

public class TestEnum {
	public final static String COMMON_WEBVIEW_SHARE_TYPES[] = new String[]{"xxx","yyyy","zzzzz"};

    /**
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(HotelType.ECONOMY);
//        System.out.println(HotelType.ECONOMY == HotelType.valueOf("ECONOMY"));
        
        
        String array[] = Arrays.copyOfRange(COMMON_WEBVIEW_SHARE_TYPES, 0, COMMON_WEBVIEW_SHARE_TYPES.length-1);
        
        for( String str:array){
        	System.out.println(str);
        }
    }

    public enum HotelType{
        ECONOMY("economy","经济"),
        HIGH_GRADE("high_grade","高档"),
        LUXURY("luxury","奢华"),
        COMFORT("comfort","舒适");
        String label;
        String key;
        private HotelType(String key,String lb) {
            this.label = lb;
            this.key = key;
        }
        public String getLabel() {
            return label;
        }
        public String getKey() {
            HotelType.valueOf("ec");
            return key;
        }
    }
}
