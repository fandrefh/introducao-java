package br.senac.pi.objetos;

import br.senac.pi.geral.Garrafa;

public class UsaGarrafa {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();
        Garrafa g2 = new Garrafa();
        g1.encher();
        g1.setCapacidade(1000);
        g1.setTipoMaterial("Vidro");
        System.out.println(g1.getTipoMaterial());
        System.out.println(g1.getCapacidade());
        g1.mostrarConteudo();

        g2.encher();
        g2.setCapacidade(500);
        g2.setTipoMaterial("Plástico");
        System.out.println(g2.getTipoMaterial());
        System.out.println(g2.getCapacidade());
        g2.mostrarConteudo();
    }
}
