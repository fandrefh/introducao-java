package br.senac.pi.geral;

public class Pessoa {

    private String nome;
    private String pai;
    private String mae;

    public Pessoa() {}
    public Pessoa(String nome, String mae) {
        this.nome = nome;
        this.mae = mae;
    }
    public Pessoa(String nome, String mae, String pai) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
}
