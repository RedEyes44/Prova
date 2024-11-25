
public class Biblioteca {
	private Libro[] libri = new Libro[10];
	private String nome;
	private int nLibri=1;
	public Biblioteca(String name) {
		this.nome=name;
	}
	
	public void setNumbLibri(int n) {
		this.nLibri=n;
	}
	
	public int getNumbLibri() {
		return this.nLibri;
	}
	public void setLibri(String a, String g, String t, int pg,int i) {
			libri[i].setAutore(a);
			libri[i].setGenere(g);
			libri[i].setTitolo(t);
			libri[i].setPagine(pg);
	}
	
	public void elenco() {
		for(int i=0;i<nLibri;i++) {
			System.out.println("Libro " + (i+1) + " --> " + libri[i]);
		}
	}
}
