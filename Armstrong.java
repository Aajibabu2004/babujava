
public class Armstrong {

	public static void main(String[] args) {
		int n = 1634;
		int tem = n;
		int armStrong = 0; 
		int count = 0;
		
		while(tem > 0) {
			count += 1;
			tem /=10;
		}
		
		tem = n;
		
		while(tem > 0) {
			int ld = tem % 10;
			armStrong = armStrong + (int)Math.pow(ld,count);
			tem /=10;
		}
		
		if(armStrong == n) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
			
	}

}
