
public class Counter {
	private static int count = 0;
	private final static int MAX_COUNT = 1000;
	public static void increment() {
		if(count < MAX_COUNT) {
			count++;
			System.out.println("count = "+count);
		}
		else {
			System.out.println("Reached max count '1000'.");
		}
	}
	public class Inner{
		public static void reset() {
			count = 0;
			System.out.println("count = "+count);
		}
	}
}

