package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalProdutosComList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d1 = new Date(System.currentTimeMillis());

		
		
		System.out.println();
		System.out.println("LIMOEIRO, " + sdf1.format(d1));
		sc.close();
	}

}
