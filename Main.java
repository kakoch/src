import java.util.Date;

import javax.swing.JOptionPane;

import classes.Cliente;
import classes.Comanda;
import classes.Funcionario;
import classes.Mesa;
import classes.Pedido;
import classes.Pessoa;

public class Main {

	public static void main(String[] args) {
		//pessoa
		Pessoa cadPessoa = cadastrarPessoa();
		Pessoa atuaPessoa = atualizarPessoa();
		//cliente
		Cliente cadCliente = cadastrarCliente();
		Cliente atuaCliente = atualizarCliente();
		//comanda
		Comanda adicPedido = adicionarPedido(null);
		//mesa
		Mesa reserMesa= reservarMesa();
	}

	public static Pessoa cadastrarPessoa() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		Date dataNascimento = new Date();
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = true;
		
		/*Pessoa pessoa = new Pessoa(int id, String nome, String telefone, String endereco, String cpf, String observacao, boolean ativo,
				Date dataNascimento, Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor);
		*/
		return null ;
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
		
		/*Pessoa pessoa = new Pessoa(int id, String nome, String telefone, String endereco, String cpf, String observacao, boolean ativo,
				Date dataNascimento, Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor);
		*/
		return null ;
	}
	public static Cliente cadastrarCliente() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		String alergia = JOptionPane.showInputDialog("Digite a alergia do cliente");
		Date dataNascimento = new Date();
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = true;
		boolean vip = true;
		
		/*Pessoa pessoa = new Pessoa(int id, String nome, String telefone, String endereco, String cpf, String observacao, boolean ativo,
				Date dataNascimento, Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor);
		*/
		return null ;
	}
	public static Cliente atualizarCliente() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		String alergia = JOptionPane.showInputDialog("Digite a alergia do cliente");
		Date dataNascimento = new Date();
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = true;
		boolean vip = true;
		
		/*Pessoa pessoa = new Pessoa(int id, String nome, String telefone, String endereco, String cpf, String observacao, boolean ativo,
				Date dataNascimento, Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor);
		*/
		return null ;
	}
	public static Comanda adicionarPedido(Pedido pedido) {
	    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
	    String mesa = JOptionPane.showInputDialog("Digite o nome da mesa");
	    String cliente = JOptionPane.showInputDialog("Digite o endereço da pessoa");
	    String telefone = JOptionPane.showInputDialog("Digite o telefone");

	    // Criação de uma nova instância de Comanda
	    Comanda comanda = new Comanda(id, mesa, cliente, telefone, telefone);

	    // Configuração das informações coletadas
	    comanda.setId(id);
	    comanda.setMesa(mesa);
	    comanda.setCliente(cliente);
	    comanda.setTelefone(telefone);

	    // Adicionando o pedido à comanda
	    comanda.adicionarPedido(pedido);

	    // Retornando a comanda atualizada
	    return comanda;
	}

	public static Mesa reservarMesa() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
		Funcionario funcionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do funcionario"));
		return null;
		
	}
}
