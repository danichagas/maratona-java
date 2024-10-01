package condicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagem1 = "Vou comprar uma R15";
        String mensagem2 = "Não vou comprar uma R15";
        String resultado = salario >= 6000 ? mensagem1 : mensagem2;

        System.out.println(resultado);
    }
}
