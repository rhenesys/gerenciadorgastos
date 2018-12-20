package entity;

public class Usuario {
	private String primeiroNome;
	private String ultimoNome;
	private String senha;
	private String nickname;
	private String email;
	private int id;
	
	public Usuario(String primeiroNome, String ultimoNome, String email, String nickname, String senha)
	{
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.senha = senha;
		this.nickname = nickname;
		this.email = email;
		id = criarNovaId();
	}
	
	//TODO criar um método random para gerar uma id
	private int criarNovaId()
	{
		return 123456;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
