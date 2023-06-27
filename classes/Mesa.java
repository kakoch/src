package classes;

import java.util.List;

import enums.StatusMesa;

public class Mesa {
	private int id;
	private Funcionario funcionario;
	private List<Comanda> comandas;
	private String nome;
	private String codigo;
	private int numero;
	private int quantidadeMaximaPessoas;
	private StatusMesa statusMesa;
	public Mesa(int id, Funcionario funcionario, List<Comanda> comandas, String nome, String codigo, int numero,
			int quantidadeMaximaPessoas, StatusMesa statusMesa) {
		super();
		this.id = id;
		this.funcionario = funcionario;
		this.comandas = comandas;
		this.nome = nome;
		this.codigo = codigo;
		this.numero = numero;
		this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
		this.statusMesa = statusMesa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public List<Comanda> getComandas() {
		return comandas;
	}
	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidadeMaximaPessoas() {
		return quantidadeMaximaPessoas;
	}
	public void setQuantidadeMaximaPessoas(int quantidadeMaximaPessoas) {
		this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
	}
	public StatusMesa getStatusMesa() {
		return statusMesa;
	}
	public void setStatusMesa(StatusMesa statusMesa) {
		this.statusMesa = statusMesa;
	}
	
}
