import java.io.DataInputStream;
import java.io.IOException;

public class EntradaArrayNotas {
    public static void main(String[] args) {
        String s = "";
        float[] notas = new float[4];
        float media = 0;
        DataInputStream dado;
        int contador = 0;
        while (contador <= notas.length) {
            try {
                System.out.println("Entre com uma nota " + contador);
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                notas[contador] = Float.parseFloat(s);
                contador++;

                media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;

            } catch (IOException erro) {
                System.out.println("Deu caca na entrada de dados do usuário" + erro);
            }
        }
        System.out.println("Média do aluno:" + media);
    }
}
