package com.company;

import br.dio.desafio.controle.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descriçao curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Jsa");
        curso2.setDescricao("descriçao curso Js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descriçao Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" +devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devLuca = new Dev();
        devLuca.setNome("Luca");
        devLuca.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luca" + devLuca.getConteudosInscritos());
        devLuca.progredir();
        System.out.println("Conteudos Concluídos Luca" + devLuca.getConteudosConcluidos());


    }
}
