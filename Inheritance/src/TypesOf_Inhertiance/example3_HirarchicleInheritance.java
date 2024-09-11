package TypesOf_Inhertiance;

public class example3_HirarchicleInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("-----Features of Instagram 1-----");
		InstaV2 v2=new InstaV2();
		v2.Feature();
		v2.post();
		v2.videos();
		v2.Story();
		v2.reels();
		System.out.println("-----Features of Instagram 2-----");
		InstaV3 v3=new InstaV3();
		v3.Settings();
		v3.post();
		v3.videos();
		v3.Story();
		v3.reels();
		System.out.println("-----Features of Instagram 3-----");
		InstaV4 v4=new InstaV4();
		v4.alternate();
		v4.post();
		v4.videos();
		v4.Story();
		v4.reels();
	}
}
