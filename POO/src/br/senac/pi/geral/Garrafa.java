package br.senac.pi.geral;

public class Garrafa {

    private String tipoMaterial;
    private int capacidade;

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void encher() {
        System.out.println("Garrafa cheia com sucesso!");
    }

    public void esvaziar() {
        System.out.println("Garrafa esvaziada!!! Zerada mano!!!!");
    }

    public void mostrarConteudo() {
        System.out.println("Material: " + this.tipoMaterial +
                "\nCapacidade: " + this.capacidade);
    }
}
