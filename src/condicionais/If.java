package condicionais;

public class If {
    public static void main(String[] args) {
        int idade = 17;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulta");
        }
    }
}
