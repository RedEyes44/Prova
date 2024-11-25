import java.util.Scanner;

public class Gestione {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.print("Inserire il nome della biblioteca --> ");
		nome=input.nextLine();
		Biblioteca b = new Biblioteca(nome);
		int nLibri;
		do {
			System.out.print("Inserire il numero di libri --> ");
			nLibri=input.nextInt();
		}while(nLibri<=0 || nLibri>10);
		b.setNumbLibri(nLibri);
		String a,g,t;
		int pg;
		double pz;
		String x=input.nextLine();
		for(int i=0;i<b.getNumbLibri();i++) {
			System.out.println("\n** LIBRO NUMERO " + (i+1) + " **" + "\n");
			System.out.print("Inserire l'autore --> ");
			a=input.nextLine();
			System.out.print("\n");
			System.out.print("Inserire il genere --> ");
			g=input.nextLine();
			System.out.print("\n");
			System.out.print("Inserire il titolo --> ");
			t=input.nextLine();
			System.out.print("\n");
			System.out.print("Inserire il numero di pagine --> ");
			pg=input.nextInt();
			System.out.print("\n");
			b.setLibri(a, g, t, pg, i);
		}
		
		b.elenco();

	}

}
