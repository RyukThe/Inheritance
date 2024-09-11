package Inhertiance;

public class example4_HirarchicleInheritance 
{
	public static void main(String []args)
	{
		System.out.println("-----------Features of Son1-----------");
		Son1 s1=new Son1();
		s1.laptop();
		s1.car();
		s1.land();
		s1.gold();
		s1.plot();
		s1.flat();
		System.out.println("-----------Features of Son2-----------");
		Son2 s2=new Son2();
		s2.smartphone();
		s2.car();
		s2.land();
		s2.gold();
		s2.plot();
		s2.flat();
		System.out.println("-----------Features of Son3-----------");
		Son3 s3=new Son3();
		s3.bike();
		s3.car();
		s3.land();
		s3.gold();
		s3.plot();
		s3.flat();
	}
}
