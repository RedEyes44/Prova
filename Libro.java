
public class Libro {
	private String genere,autore,titolo;
	private int pagine;
	
	public Libro(String g, String a, String t, int pg) {
		this.autore=a;
		this.genere=g;
		this.titolo=t;
		this.pagine=pg;
	}
	
	public String toString() {
		String s="";
		s=s+autore+"\t";
		s=s+genere+"\t";
		s=s+titolo+"\t";
		s=s+pagine+"\t";
		return s;
	}
	
	public String getAutore() {
		return autore+"\t";
	}
	
	public String getGenere() {
		return genere+"\t";
	}

	public String getTitolo() {
		return titolo+"\t";
	}

	public String getPagine() {
		return pagine+"\t";
	}

	
	public void setAutore(String a) {
		this.autore=a;
	}
	
	public void setGenere(String g) {
		this.genere=g;
	}

	public void setTitolo(String t) {
		this.titolo=t;
	}

	public void setPagine(int pg) {
		this.pagine=pg;
	}



}
