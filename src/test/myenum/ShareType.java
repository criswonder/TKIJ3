package test.myenum;

public enum ShareType {
	LAIWAWNG,
	WEIBO,
	WEIXIN,
	WEIXINPYQ,
	COPYLINK,
	JUBAO,
	QRC,
	CUSTOME;
	public static final String STR_LAIWANG="laiwang";
	public static final String STR_WEIBO="weibo";
	public static final String STR_WEIXIN="weixin";
	public static final String STR_WEIXINPYQ="weixinpyq";
	public static final String STR_COPYLINK="copylink";
	public static final String STR_JUBAO="jubao";
	public static final String STR_QRC="qrc";
	public static final String STR_CUSTOME="custome";
	
	public String toString(){
		switch(this){
		case LAIWAWNG:
			return STR_LAIWANG;
		case WEIBO:
			return STR_WEIBO;
		case WEIXIN:
			return STR_WEIXIN;
		case WEIXINPYQ:
			return STR_WEIXINPYQ;
		case COPYLINK:
			return STR_COPYLINK;
		case JUBAO:
			return STR_JUBAO;
		case QRC:
			return STR_QRC;
		case CUSTOME:
			return STR_CUSTOME;
		default:
			return "";
		}
	}
}
