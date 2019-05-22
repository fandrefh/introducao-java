import java.io.DataInputStream;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        String s = "";
        float nota1, nota2, nota3, nota4, media;
        DataInputStream dado;
        try {
            System.out.println("Entre com uma nota 1");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            nota1 = Float.parseFloat(s);

            System.out.println("Entre com uma nota 2");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            nota2 = Float.parseFloat(s);

            System.out.println("Entre com uma nota 3");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            nota3 = Float.parseFloat(s);

            System.out.println("Entre com uma nota 4");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            nota4 = Float.parseFloat(s);

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("Média do aluno:" + media);

        } catch (IOException erro) {
            System.out.println("Deu caca na entrada de dados do usuário" + erro);
        }
    }
}
