package c8;
import com.bruceeckel.simpletest.*;

public class Parcel9 {
	private static Test monitor = new Test();

	public Destination dest(final String dest, final float price) {
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			{
				cost = Math.round(price);
				if (cost > 100)
					System.out.println("Over budget!");
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.dest("Tanzania", 101.395F);
		monitor.expect(new String[] { "Over budget!" });
	}
} // /:~