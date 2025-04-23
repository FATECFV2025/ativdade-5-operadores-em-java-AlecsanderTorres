import java.util.Scanner;

public class App {

    public static float adicao(float v1, float v3) {
        return v1 + v3;
    }

    public static float subtracao(float v1, float v3) {
        return v1 - v3;
    }

    public static float multiplicacao(float v1, float v3) {
        return v1 * v3;
    }

    public static float divisao(float v1, float v3) {
        return v1 / v3;
    }

    public static void funcao_teste() {
        Scanner ler = new Scanner(System.in);
        String v2;
        float v1;
        float v3;

        System.out.println("Comando de Saída de Dados");

        System.out.print("Informe uma palavra: ");
        v2 = ler.next();

        System.out.print("Informe um número: ");
        v1 = ler.nextFloat();

        System.out.print("Informe outro número: ");
        v3 = ler.nextFloat();

        float resultado_adi = adicao(v1, v3);
        System.out.printf("O resultado da adição de %s é: %.2f\n", v2, resultado_adi);

        float resultado_sub = subtracao(v1, v3);
        System.out.printf("O resultado da subtração de %s é: %.2f\n", v2, resultado_sub);

        float resultado_multi = multiplicacao(v1, v3);
        System.out.printf("O resultado da multiplicação de %s é: %.2f\n", v2, resultado_multi);

        float resultado_divi = divisao(v1, v3);
        System.out.printf("O resultado da divisão de %s é: %.2f\n", v2, resultado_divi);

        ler.close();
    }

    public static void main(String[] args) {
        funcao_teste();
    }
}
