package classes;

import java.util.List;

public class Comanda {
	private int id;
	private Mesa mesa;
	private Cliente cliente;
	private List<Produto> pedidos;
	private String codigo;
	private String observacoes;
	private String statusComanda;
	public Comanda(int id, Mesa mesa, Cliente cliente, List<Produto> pedidos, String codigo, String observacoes,
			String statusComanda) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.cliente = cliente;
		this.pedidos = pedidos;
		this.codigo = codigo;
		this.observacoes = observacoes;
		this.statusComanda = statusComanda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Produto> pedidos) {
		this.pedidos = pedidos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getStatusComanda() {
		return statusComanda;
	}
	public void setStatusComanda(String statusComanda) {
		this.statusComanda = statusComanda;
	}

	
}
