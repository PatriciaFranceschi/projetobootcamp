package br.dio.desafio.controle;

import java.time.LocalDate;

public class Curso extends Conteudo {


    private int cargahoraria;

    public Curso() {
    }


    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descriçao='" + getTitulo() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }
}
