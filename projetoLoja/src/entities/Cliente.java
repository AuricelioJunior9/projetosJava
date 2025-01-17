package entities;

import java.util.Date;

public class Cliente {

	private String name;
	private String email;
	private Date dataNascimento;
	
	Cliente(){
	}
	
	public Cliente(String name, String email, Date dataNascimento) {
		this.name = name;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
