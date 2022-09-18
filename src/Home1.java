
public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 6;
		int total = 0;
		
		for(int i = 1 ;i<number;i++) {
		if( number % i==0) {
			total = total+i;
		}	
			
		}	
		if(total==number) {
			
		System.out.println("mükemmel sayıdır");	
		}else {
			System.out.println("mükemmel sayı değildir");
			
		}
			
	int[] sayılar = new int [] {1,2,5,7,9,0};
	int aranacak = 5;
	boolean varMı=false;
	 for (int sayı:sayılar) {
		 if(sayı==aranacak) {
			 varMı=true;
			 break;
		 }
		
	 }
			
		
	if	(varMı)	{
	System.out.println("sayı mevcuttur");
	}else {
	System.out.println("sayı mevcut değildir");
	}
		
			
		

	}

}