package br.com.gft.desafiotecnico.exercicio02.entity;

public abstract class Idioma {

    private String nomeDoIdioma;

    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    public void setNomeDoIdioma(String nomeDoIdioma) {
        this.nomeDoIdioma = nomeDoIdioma;
    }

    public abstract String saudacao();
}

