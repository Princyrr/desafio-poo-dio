package br.com.dio.desafio.dominio;

/**
 * Classe abstrata que representa um conteúdo educacional genérico.
 * É estendida pelas classes Curso e Mentoria.
 */
public abstract class Conteudo {

    // XP padrão aplicado a todos os conteúdos
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    /**
     * Método abstrato que deve ser implementado por subclasses
     * para definir como o XP será calculado.
     */
    public abstract double calcularXp();

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo != null ? titulo : "Sem título";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao != null ? descricao : "Sem descrição";
    }
}
