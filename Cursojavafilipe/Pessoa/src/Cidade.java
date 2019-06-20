import java.util.Date;

public class Cidade {

	public int 		codcidade;
	public String 	nome;
	private int 	codestado;
	private int 	longitude;
	private int 	latitude;
	protected Date 	datafundacao;

	public Cidade(int xcodcidade, String xnome, int xcodestado, int xlongitude, int xlatitude, Date xdatafundacao) {
		this.codcidade = xcodcidade;
		this.nome = xnome;
		this.codestado = xcodestado;
		this.longitude = xlongitude;
		this.latitude = xlatitude;
		this.datafundacao = xdatafundacao;
	}

	public int getCodcidade() {
		return codcidade;
	}

	public void setCodcidade(int codcidade) {
		this.codcidade = codcidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodestado() {
		return codestado;
	}

	public void setCodestado(int codestado) {
		this.codestado = codestado;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public Date getDatafundacao() {
		return datafundacao;
	}

	public void setDatafundacao(Date datafundacao) {
		this.datafundacao = datafundacao;
	}

}