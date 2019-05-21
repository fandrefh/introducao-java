public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        System.out.println("numero1 maior que numero2: " + (numero1 > numero2));
        System.out.println("numero1 menor que numero2: " + (numero1 < numero2));
        System.out.println("numero1 maior ou igual que numero2: " + (numero1 >= numero2));
        System.out.println("numero1 menor ou igual que numero2: " + (numero1 <= numero2));
        System.out.println("numero1 diferente de numero2: " + (numero1 != numero2));
        System.out.println("numero1 igual a numero2: " + (numero1 == numero2));
        // E Lógico ou AND ---> && => numero1 && numero2
        // Ou Lógico ou OR ---> || => numero1 || numero2
        // Negação ou NOT ---> ! => !numero1 ou !numero2
    }
}
