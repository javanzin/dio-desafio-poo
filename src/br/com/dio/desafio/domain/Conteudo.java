package br.com.dio.desafio.domain;

public abstract class Conteudo {
  protected static final double XP_PADRAO = 10;

  private String titulo;
  private String descricao;

  public abstract double calcularXp();

  public Conteudo(final String titulo, final String descricao) {
    this.titulo = titulo;
    this.descricao = descricao;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDescricao() {
    return descricao;
  }
}
