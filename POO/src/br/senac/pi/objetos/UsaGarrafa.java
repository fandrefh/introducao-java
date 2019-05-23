package br.senac.pi.objetos;

import br.senac.pi.geral.Garrafa;

public class UsaGarrafa {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();
        g1.encher();
        g1.capacidade = 1000;
        g1.tipoMaterial = "Vidro";
    }
}
