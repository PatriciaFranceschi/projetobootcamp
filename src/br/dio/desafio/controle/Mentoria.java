package br.dio.desafio.controle;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descriçao='" + getDescricao()+ '\'' +
                ", data=" + data +
                '}';
    }
}
