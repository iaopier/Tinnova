import java.util.ArrayList;


public class Calculo {

	public static void main(String[] args) {

		int n = 10;
		n = Integer.parseInt(args[0]);

		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			if (i == 0) {
			}
			if (i % 3 == 0) {
				l.add(i);
			}
			if (i % 5 == 0) {
				l.add(i);
			}
		}
		int soma = 0;
		for (int i = 0; i < l.size(); ++i) {
			soma += l.get(i);
		}
		System.out.println(soma);

	}

}
