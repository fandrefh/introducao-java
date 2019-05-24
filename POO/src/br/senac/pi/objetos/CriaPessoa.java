package br.senac.pi.objetos;

import br.senac.pi.geral.Pessoa;

public class CriaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Francisco André", "Amparo");
        Pessoa p3 = new Pessoa("João Gabriel", "Thaline", "Francisco André");

        p1.setNome("Thiago");
        p1.setMae("Mãe do Thiago");

        System.out.println("Dados da P1");
        System.out.println("Nome:" + p1.getNome());
        System.out.println("Mãe:" + p1.getMae());

        System.out.println("Dados da P2");
        System.out.println("Nome:" + p2.getNome());
        System.out.println("Mãe:" + p2.getMae());

        System.out.println("Dados da P3");
        System.out.println("Nome:" + p3.getNome());
        System.out.println("Mãe:" + p3.getMae());
        System.out.println("Pai:" + p3.getPai());
    }
}
