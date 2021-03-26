public class FirstJava{
	public static void main(String [] argv){

		byte			a=20;		//1byte
		short		b=30;		//2byte
		int			c=40;		//4byte
		long			d=50;		//8byte
		char			e='x';		//2byte
		float			f=1.14f;		//4byte	數值後加f,否則會被視為double
		double		g=2.17828;	//8byte
		double		h=3;			//8byte
		String		s1="Hello";
		String		s2="Good\tMorning";		//'\t'為定位字元
		final	double	PI=3.141592;				//final 具名常數, 無法更改
		boolean 		TURN=true;

		System.out.println("a and b = " + a + " and " + b);		
		System.out.println(a + b);
		System.out.println("c and d = " + c + " and " + d);
		System.out.println("e and f = " + e + " and " + f);
		System.out.println("g and PI= " + g + " and " + PI);
		System.out.println("a times b = " + a * b);
		System.out.println("a/b = " + a/b);
		System.out.println("a/h = " + a/h);
		System.out.println("a%b = " + a%b);
		System.out.println("a%h = " + a%h);		
		System.out.println(s1 + '\n' + s2);
		System.out.println("The length of s1 is " + s1.length());
		System.out.println("The length of s2 is " + s2.length());
		System.out.println("TURN = " + TURN + " !TURN= " + !TURN);
		System.out.println("a = b : " + (a==b));
		System.out.println("a != b : " + (a!=b));
		System.out.println("a >= b : " + (a>=b));
		System.out.println("a < b : " + (a<b));
	}
}
