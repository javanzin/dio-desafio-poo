package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev extends Entidade {

  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public Dev(final String nome) {
    super(nome);
  }

  public void inscreverBootcamp(final Bootcamp bootcamp) {
    conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    final Optional<Conteudo> conteudo =
        this.conteudosInscritos.stream().findFirst();
    if (conteudo.isPresent()) {
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosInscritos.remove(conteudo.get());
    } else {
      System.out.println("Você não está inscrito em nenhum conteúdo no momento");
    }
  }

  public void calcularTotalXp() {
    double xp = conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    System.out.println("O dev " + nome + " tem " + xp + " XPs");
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public void setConteudosInscritos(final Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setConteudosConcluidos(final Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

  @Override
  public boolean equals(final Object o) {
    if (!super.equals(o)) return false;
    Dev dev = (Dev) o;
    return Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
        Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), conteudosInscritos, conteudosConcluidos);
  }
}
