package br.adriano.pojo;

public class Pessoa {
	
	private String nome,
		sobrenome,
		email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
        return "\"" + Pessoa.class.getSimpleName() +
        	   "\": {\n\tnome=\"" + nome +
        	   "\",\n\tidade=\"" + sobrenome +
        	   "\",\n\temail=\"" + email +
        	   "\"\n}";
    }

}
