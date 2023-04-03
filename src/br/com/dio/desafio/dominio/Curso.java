package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "{" +
            " título='" + super.getTitulo() + "'" +
            " descrição='" + super.getDescricao() + "'" +
            " cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }

}
