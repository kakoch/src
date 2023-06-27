package classes;

import java.util.Date;

public class Cliente extends Pessoa{
	private String alergia;
	private boolean vip;
	public Cliente(int id, String nome, String telefone, String endereco, String cpf, String observacao, boolean ativo,
			Date dataNascimento, Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor, String alergia,
			boolean vip) {
		super(id, nome, telefone, endereco, cpf, observacao, ativo, dataNascimento, criadoEm, criadoPor, alteradoEm,
				alteradoPor);
		this.alergia = alergia;
		this.vip = vip;
	}
	public String getAlergia() {
		return alergia;
	}
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}

}
