package entity;

public class Categoria {
	private Integer id;
	private String nome;
	private String codigo;
	
	public Categoria() {
	}

	public Categoria(Integer id, String nome, String codigo) {
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
	}	

	@Override
	public String toString() {
		return "Categoria = {id=" + id + ", nome=" + nome + ", codigo=" + codigo + "}";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	

}
