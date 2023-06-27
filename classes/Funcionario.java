package classes;

import java.util.Date;

import enums.Cargo;
import enums.Disponibilidade;
import enums.Escolaridade;
import enums.EstadoCivil;

public class Funcionario extends Pessoa{
	private String rg;
	private EstadoCivil estadoCivil;
	private Escolaridade escolaridade;
	private Cargo cargo;
	private int pis;
	private Date dataAdmissao;
	private Date dataDemissao;
	private Disponibilidade disponibilidade;
	public Funcionario(int id, String nome, String telefone, String endereco, String cpf, String observacao,
			boolean ativo, Date dataNascimento, Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor,
			String rg, EstadoCivil estadoCivil, Escolaridade escolaridade, Cargo cargo, int pis, Date dataAdmissao,
			Date dataDemissao, Disponibilidade disponibilidade) {
		super(id, nome, telefone, endereco, cpf, observacao, ativo, dataNascimento, criadoEm, criadoPor, alteradoEm,
				alteradoPor);
		this.rg = rg;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.cargo = cargo;
		this.pis = pis;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.disponibilidade = disponibilidade;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public int getPis() {
		return pis;
	}
	public void setPis(int pis) {
		this.pis = pis;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Date getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
}
