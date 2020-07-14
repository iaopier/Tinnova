
public class Fatorial {
	public static void main(String[] args) {
		System.out.println(fat(4));

	}
	
	public static int fat(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else{
			return n*fat(n-1);
		}
	}

}
