package classes;

import java.security.Timestamp;

import enums.StatusPreparo;

public class Pedido {
	private int id;
	private Produto produto;
	private Timestamp dataHoraSolicitacao;
	private Timestamp dataHoraInicioPreparo;
	private Timestamp tempoPreparoRestante;
	private StatusPreparo statusPreparo;
	private String observacao;
	private int quantidade;

	public Pedido(int id, Produto produto, Timestamp dataHoraSolicitacao, Timestamp dataHoraInicioPreparo,
			Timestamp tempoPreparoRestante, StatusPreparo statusPreparo, String observacao, int quantidade) {
		super();
		this.id = id;
		this.produto = produto;
		this.dataHoraSolicitacao = dataHoraSolicitacao;
		this.dataHoraInicioPreparo = dataHoraInicioPreparo;
		this.tempoPreparoRestante = tempoPreparoRestante;
		this.statusPreparo = statusPreparo;
		this.observacao = observacao;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Timestamp getDataHoraSolicitacao() {
		return dataHoraSolicitacao;
	}

	public void setDataHoraSolicitacao(Timestamp dataHoraSolicitacao) {
		this.dataHoraSolicitacao = dataHoraSolicitacao;
	}

	public Timestamp getDataHoraInicioPreparo() {
		return dataHoraInicioPreparo;
	}

	public void setDataHoraInicioPreparo(Timestamp dataHoraInicioPreparo) {
		this.dataHoraInicioPreparo = dataHoraInicioPreparo;
	}

	public Timestamp getTempoPreparoRestante() {
		return tempoPreparoRestante;
	}

	public void setTempoPreparoRestante(Timestamp tempoPreparoRestante) {
		this.tempoPreparoRestante = tempoPreparoRestante;
	}

	public StatusPreparo getStatusPreparo() {
		return statusPreparo;
	}

	public void setStatusPreparo(StatusPreparo statusPreparo) {
		this.statusPreparo = statusPreparo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
