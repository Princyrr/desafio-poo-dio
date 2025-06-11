package br.com.dio.desafio.dominio;

/**
 * Representa um curso dentro de um bootcamp.
 * Herda de Conteudo e implementa o cálculo de XP com base na carga horária.
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    // Construtor padrão
    public Curso() {
    }

    // Calcula XP baseado na carga horária
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Representação textual da classe Curso
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
