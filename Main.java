import java.util.Date;
import javax.swing.JOptionPane;

import classes.Cardapio;
import classes.Cliente;
import classes.Comanda;
import classes.Funcionario;
import classes.Pedido;
import classes.Pessoa;
import classes.Produto;

public class Main {

	public static void main(String[] args, String String, Pedido Pedido) {
		// pessoa
		Pessoa cadPessoa = cadastrarPessoa();
		Pessoa atuaPessoa = atualizarPessoa();
		// cliente
		Cliente cadCliente = cadastrarCliente();
		Cliente atuaCliente = atualizarCliente();
		// funcionario
		Funcionario cadFuncionario = cadastrarFuncionario();
		Funcionario excFuncionario = excluirFuncionario();
		Funcionario atuaFuncionario = atualizarFuncionario();
		// comanda
		Comanda adiPedido = adicionarPedido(Pedido);
		Comanda removerPedido = removerPedido(String);
		Comanda fecharComanda = fecharComanda(String);
		Comanda totalComanda = calcularTotalComanda();
		// pedido
		Pedido quantidadeProduto = quantidadeProduto();
		// produto
		Produto adicProduto = adicionarProduto();
		Produto atuaProduto = atualizarProduto();
		Produto excProduto = excluirProduto();
		// cardapio
		Cardapio adicCardapio = adicionarCardapio();
		Cardapio atuaCardapio = atualizarCardapio();
		Cardapio excCardapio = excluirCardapio();
	}

	// pessoa method
	public static Pessoa cadastrarPessoa() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		Date dataNascimento = new Date();
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = true;
		return null;
	}

	public static Pessoa atualizarPessoa() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		Date dataNascimento = new Date();
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = true;

		return null;
	}

	// cliente method
	public static Cliente cadastrarCliente() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente");
		String alergia = JOptionPane.showInputDialog("Digite a alergia do cliente");
		Date dataNascimento = new Date();
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = true;
		boolean vip = true;

		return null;
	}

	public static Cliente atualizarCliente() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente");
		String alergia = JOptionPane.showInputDialog("Digite a alergia do cliente");
		boolean vip = true;

		return null;
	}

	// funcionario method
	public static Funcionario atualizarFuncionario() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do funcionario");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		Date dataNascimento = new Date();
		String cpf = JOptionPane.showInputDialog("Digite o CPF do funcionario");
		String rg = JOptionPane.showInputDialog("Digite o rg do funcionario");
		String pis = JOptionPane.showInputDialog("Digite o PIS");
		String escolaridade = JOptionPane.showInputDialog("Digite a escolaridade");
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		String cargo = JOptionPane.showInputDialog("Digite o cargo");
		Date dataAdmissao = new Date();
		Date dataDemissao = new Date();
		boolean ativo = true;
		return null;
	}

	public static Funcionario excluirFuncionario() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Funcionario cadastrarFuncionario() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do funcionario");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		Date dataNascimento = new Date();
		String cpf = JOptionPane.showInputDialog("Digite o CPF do funcionario");
		String rg = JOptionPane.showInputDialog("Digite o rg do funcionario");
		String pis = JOptionPane.showInputDialog("Digite o PIS");
		String escolaridade = JOptionPane.showInputDialog("Digite a escolaridade");
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		String cargo = JOptionPane.showInputDialog("Digite o cargo");
		Date dataAdmissao = new Date();
		Date dataDemissao = new Date();
		boolean ativo = true;
		return null;
	}

	// comanda method
	public static Comanda adicionarPedido(Pedido pedido) {

		return null;
	}

	public static Comanda removerPedido(String pedido) {

		return null;

	}

	public static Comanda fecharComanda(String codigo) {

		return null;

	}

	public static Comanda calcularTotalComanda() {

		return null;

	}

	// pedido method
	public static Pedido quantidadeProduto() {
		return null;

	}

	// produto method
	public static Produto adicionarProduto() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		String descricao = JOptionPane.showInputDialog("Digite a descricao do produto");
		String codigo = JOptionPane.showInputDialog("Digite o codigo do produto");
		Double precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de custo"));
		Double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda"));
		String tempoPreparo = JOptionPane.showInputDialog("Digite o tempo de preparo");
		String observacao = JOptionPane.showInputDialog("Observação");
		String tipoProduto = JOptionPane.showInputDialog("Digite o tipo de produto");
		boolean ativo = true;

		return null;

	}

	public static Produto atualizarProduto() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		String descricao = JOptionPane.showInputDialog("Digite a descricao do produto");
		String codigo = JOptionPane.showInputDialog("Digite o codigo do produto");
		Double precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de custo"));
		Double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda"));
		String tempoPreparo = JOptionPane.showInputDialog("Digite o tempo de preparo");
		String observacao = JOptionPane.showInputDialog("Observação");
		String tipoProduto = JOptionPane.showInputDialog("Digite o tipo de produto");
		boolean ativo = true;

		return null;

	}

	public static Produto excluirProduto() {
		return null;

	}

	public static Cardapio adicionarCardapio() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String produtos = JOptionPane.showInputDialog("Digite um produto");
		String nome = JOptionPane.showInputDialog("Digite um nome");
		String codigo = JOptionPane.showInputDialog("Digite um codigo");
		String descricao = JOptionPane.showInputDialog("Digite uma descricao");
		String categoria = JOptionPane.showInputDialog("Digite uma categoria");
		boolean ativo = true;
		return null;

	}

	public static Cardapio atualizarCardapio() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String produtos = JOptionPane.showInputDialog("Digite um produto");
		String nome = JOptionPane.showInputDialog("Digite um nome");
		String codigo = JOptionPane.showInputDialog("Digite um codigo");
		String descricao = JOptionPane.showInputDialog("Digite uma descricao");
		String categoria = JOptionPane.showInputDialog("Digite uma categoria");
		boolean ativo = true;
		return null;

	}

	public static Cardapio excluirCardapio() {
		return null;

	}
}
