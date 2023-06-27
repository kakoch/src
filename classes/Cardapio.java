package classes;

import java.util.List;

public class Cardapio {
	private int id;
	private List<Produto> produtos;
	private String nome;
	private String codigo;
	private String descricao;
	private String categoria;
	private boolean ativo;
	public Cardapio(int id, List<Produto> produtos, String nome, String codigo, String descricao, String categoria,
			boolean ativo) {
		super();
		this.id = id;
		this.produtos = produtos;
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.ativo = ativo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

}
