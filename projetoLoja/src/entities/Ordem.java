package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import entities.enums.statusDoPedido;

public class Ordem {
	private Date momento;
	private statusDoPedido  status;
	
	private List<ItemDoPedido> itens = new ArrayList<>();
	private Cliente cliente;
	
	public Ordem() {
	}
	
	public Ordem(Date momento, statusDoPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public statusDoPedido getStatus() {
		return status;
	}

	public void setStatus(statusDoPedido status) {
		this.status = status;
	}

	public List<ItemDoPedido> getItens() {
		return itens;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(ItemDoPedido item ) {
		itens.add(item);
	}
	
	public void removerItem(ItemDoPedido item) {
	    itens.add(item);
	}
	
	public double total() {
		
	}
	

}
