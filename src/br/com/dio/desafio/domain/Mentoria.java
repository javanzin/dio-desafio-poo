package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

  static final double XP_MENTORIA = 20;

  private LocalDate data;

  public Mentoria(final String titulo, final String descricao, final LocalDate data) {
    super(titulo, descricao);
    this.data = data;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(final LocalDate data) {
    this.data = data;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + XP_MENTORIA;
  }

  @Override
  public String toString() {
    return "Mentoria{" +
        "data=" + data +
        ", titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        '}';
  }
}
