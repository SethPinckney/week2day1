public class Scratch {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		l = i;
		i = s; 
		s = b;
		
		// s = i;  compile error because int is "bigger than" short
		
		l = 2147483647;
		l = 2147483648L;
		
		l = 2147483647 * 2147483647;
		System.out.println("l using integer arithmetic is "+l);
		
		l = 2147483647L * 2147483647L;
		System.out.println("l using integer arithmetic is "+l);
		
		int applePickers = 2;
		int applesPicked = 3;
		float averageApplesPicked = applesPicked / applePickers; 
		System.out.println("average number of apples picked is "+averageApplesPicked);
		
		averageApplesPicked = (float)applesPicked / applePickers;
		System.out.println("average number of apples picked is "+averageApplesPicked);
		
		int x = 2;
		int y = 3;
		float z = (float)y / x + y / x;
		System.out.println("z is "+z);
		
		float f = 1.0f;
		double d = 2.0;
		
		d = f;
	}
}