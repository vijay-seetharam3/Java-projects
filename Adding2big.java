public class Adding2big {
	public static void main(String[] args) {
		int a = 98;
		int b = 9022;
		int c = 769;
		if(a>b && a>c && b>c) {
			System.out.println("Addition of two biggest numbers is:"+ (int)(a+b));
		}else if (b>a && b>c && c>a){
			System.out.println("Addition of two biggest numbers is:"+ (int)(b+c));
		}else{
			System.out.println("Addition of two biggest numbers is:"+(int)(c+a));
}
}
}
