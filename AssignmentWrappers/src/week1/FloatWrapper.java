package week1;

public class FloatWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float i1=10.000f;
		Float i2=10.00f;
		Float i3=new Float(10f);
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("(i1.equals(i2)) : "+(i1.equals(i2)));
		System.out.println("(i1.equals(i3)) : "+(i1.equals(i3)));
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		
		i2++;
		System.out.println(System.identityHashCode(i2));
		
		
		float x=i2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7;
		i2=x; 
		System.out.println("i2 = "+i2);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		
		String s="123";
		float d=Float.parseFloat(s);
		System.out.println(d);
		
		
		Double f=i2.doubleValue();  //double long etc
		System.out.println("f = "+f);
		
		f=22.333d;
		int m=f.intValue();
		System.out.println("m = "+m);
		
		
		Integer x1=19;
		System.out.println(x1.compareTo(19)); //both are same so it will give 0
		System.out.println(x1.compareTo(22)); //2nd value is greater then the first so it will give -ve value here
		System.out.println(x1.compareTo(10)); //1st value is greater then the second so it will give +ve value here
	}

}
