public class Variaveis {
    public static void main(String[] args) {
        String nome = "Francisco André";
        int idade = 37;
        double altura = 1.70;
        char sexo = 'M';
        boolean casado = true;
        System.out.println("### Informações Pessoais ###");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + (casado == true ? "Casado" : "Solteiro"));
    }
}
