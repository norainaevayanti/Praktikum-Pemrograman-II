package MODUL1;
import java.util.Scanner;
public class PRAK103_2210817120004_NORAINAEVAYANTI {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print(" ");
			int N = input.nextInt();

			System.out.print(" ");
			int bilanganAwal = input.nextInt();
			int baris = 1;
			int bilangan = bilanganAwal;

			while (baris <= N) {
			    if (bilangan % 2 != 0) {
			        System.out.print(bilangan);
			        if (baris < N) {
			            System.out.print(", ");
			        }
			        baris++;
			    }
			    bilangan++;
			}
		}
    }
}