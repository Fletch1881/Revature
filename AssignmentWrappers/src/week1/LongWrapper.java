package week1;

public class LongWrapper {

	public static void main(String[] args) {
		
		Long i1=10L;
		Long i2=10L;
		Long i3=new Long(10);
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("(i1.equals(i2)) : "+(i1.equals(i2)));
		System.out.println("(i1.equals(i3)) : "+(i1.equals(i3)));
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		
		i2++;
		System.out.println(System.identityHashCode(i2));
		
		
		long x=i2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7;
		i2=x; 
		System.out.println("i2 = "+i2);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		String s="123";
		long d=Long.parseLong(s);
		System.out.println(d);
		
		
		Float f=i2.floatValue();  //double long etc
		System.out.println("f = "+f);
		
		f=22.333f;
		long m=f.longValue();
		System.out.println("m = "+m);
		
		
		Integer x1=19;
		System.out.println(x1.compareTo(19)); //both are same so it will give 0
		System.out.println(x1.compareTo(22)); //2nd value is greater then the first so it will give -ve value here
		System.out.println(x1.compareTo(10)); //1st value is greater then the second so it will give +ve value here

	}

}
