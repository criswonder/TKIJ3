package test.myenum;

public class ShareTypeTest {

	public static void main(String[] args) {
		System.out.println(ShareType.QRC);
		
		for(ShareType s:ShareType.values()){
			System.out.println(s);
		}
		
		TestSIngleton.getInstance();
	}

}
