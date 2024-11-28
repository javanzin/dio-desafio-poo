package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Main {
  public static void main(final String[] args) {
    final Bootcamp bootcampJava = criarBootcamp();
    final Dev devCamila = criarEInscreverDev("Camila", bootcampJava);
    final Dev devJose = criarEInscreverDev("José", bootcampJava);

    devCamila.progredir();
    devJose.progredir();
    devJose.progredir();
    devJose.progredir(); // Não deve progredir, pois já concluiu todos os conteúdos

    exibirProgressoDev(devCamila);
    exibirProgressoDev(devJose);
  }

  private static Bootcamp criarBootcamp() {
    final Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Mentoria de Java",
        LocalDate.now());
    final Curso cursoJava = new Curso("Java Básico", "Curso de Java Básico", 10);

    final Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp " +
        "Java Developer");
    bootcampJava.getConteudos().add(mentoriaJava);
    bootcampJava.getConteudos().add(cursoJava);

    return bootcampJava;
  }

  private static Dev criarEInscreverDev(final String nome, final Bootcamp bootcamp) {
    final Dev dev = new Dev(nome);
    dev.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos " + nome + ": " + dev.getConteudosInscritos());
    return dev;
  }

  private static void exibirProgressoDev(final Dev dev) {
    System.out.println("---");
    System.out.println("Conteúdos inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
    System.out.println(
        "Conteúdos concluídos " + dev.getNome() + ": " + dev.getConteudosConcluidos());
    dev.calcularTotalXp();
  }
}
