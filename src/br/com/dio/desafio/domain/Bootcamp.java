package br.com.dio.desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Entidade {

  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public Bootcamp(final String nome, final String descricao) {
    super(nome);
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(final String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }

  public void setDevsInscritos(final Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }

  public Set<Conteudo> getConteudos() {
    return conteudos;
  }

  public void setConteudos(final Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  @Override
  public boolean equals(final Object o) {
    if (!super.equals(o)) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return Objects.equals(descricao, bootcamp.descricao) &&
        Objects.equals(dataInicial, bootcamp.dataInicial) &&
        Objects.equals(dataFinal, bootcamp.dataFinal) &&
        Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
        Objects.equals(conteudos, bootcamp.conteudos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), descricao, dataInicial, dataFinal, devsInscritos, conteudos);
  }
}
