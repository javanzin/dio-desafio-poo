package br.com.dio.desafio.domain;

import java.util.Objects;

public abstract class Entidade {
  protected String nome;

  public Entidade(final String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(final String nome) {
    this.nome = nome;
  }

  @Override
  public boolean equals(final Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Entidade entidade = (Entidade) o;
    return Objects.equals(nome, entidade.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }
}
