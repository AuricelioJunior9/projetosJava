package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer  likes;
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post(Date monento, String titulo, String conteudo, Integer likes) {
		this.momento = monento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMonento() {
		return momento;
	}

	public void setMonento(Date monento) {
		this.momento = monento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario); 
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario); 
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Conteudo: \n");
		for(Comentario c : comentarios) {
			sb.append(c.getText());
		}
		
		return sb.toString();
	}
	

}
