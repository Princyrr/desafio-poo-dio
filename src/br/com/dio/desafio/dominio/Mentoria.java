package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Representa uma mentoria dentro de um bootcamp.
 * Herda de Conteudo e adiciona o atributo 'data' para representar a data da mentoria.
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    /**
     * Construtor padrão.
     */
    public Mentoria() {
    }

    /**
     * Retorna a data da mentoria.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Implementação do cálculo de XP específico para mentorias.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Retorna uma representação textual da mentoria.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
