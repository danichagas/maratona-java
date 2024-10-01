package condicionais;

public class Switch {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1 :
                System.out.println("DOM");
                break;

            case 2 :
                System.out.println("SEG");
                break;

            case 3 :
                System.out.println("TER");
                break;

            case 4 :
                System.out.println("QUA");
                break;

            case 5 :
                System.out.println("QUI");
                break;

            case 6 :
                System.out.println("SEX");
                break;

            case 7 :
                System.out.println("SAB");
                break;

            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
