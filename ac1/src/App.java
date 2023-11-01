public class App {
    public static void main(String[] args) {
        notas(8.5, 9.0, 7.5);
        numeros();
        ePrimo(17);
        diaDaSemana(3);
        eBissexto(1995);
    }

    public static void notas(double ap1, double ap2, double ac) {
        double media = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println("Média: " + media);
    }

    public static void numeros() {
        for (int i = 150; i <= 200; i++) {
            System.out.println(i);
        }
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " não é primo. É divisível por " + i);
                return false;
            }
        }
        System.out.println(num + " é primo.");
        return true;
    }

    public static void diaDaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }

    public static void eBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " nao é um ano bissexto.");
        }
    }
}





