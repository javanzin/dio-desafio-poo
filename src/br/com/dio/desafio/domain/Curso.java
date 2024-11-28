package br.com.dio.desafio.domain;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public Curso(final String titulo, final String descricao, final int cargaHoraria) {
    super(titulo, descricao);
    this.cargaHoraria = cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(final int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "cargaHoraria=" + cargaHoraria +
        ", titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        '}';
  }

}
