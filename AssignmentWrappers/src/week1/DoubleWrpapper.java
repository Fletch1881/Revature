package week1;

public class DoubleWrpapper {

	public static void main(String[] args) {
		
		Double i1=10.25500d;
		Double i2=10.255d;
		Double i3=new Double(10.25);
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("(i1.equals(i2)) : "+(i1.equals(i2)));
		System.out.println("(i1.equals(i3)) : "+(i1.equals(i3)));
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		
		i2++;
		System.out.println(System.identityHashCode(i2));
		
		
		double x=i2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7;
		i2=x; 
		System.out.println("i2 = "+i2);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		String s="123456";
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		
		Long f=i2.longValue();  //double long etc
		System.out.println("f = "+f);
		
		f=(long) 22.333;
		double m=f.doubleValue();
		System.out.println("m = "+m);
		
		
		Integer x1=19;
		System.out.println(x1.compareTo(19)); //both are same so it will give 0
		System.out.println(x1.compareTo(22)); //2nd value is greater then the first so it will give -ve value here
		System.out.println(x1.compareTo(10)); //1st value is greater then the second so it will give +ve value here

	}

}
