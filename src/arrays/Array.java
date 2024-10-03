package arrays;

public class Array {
    public static void main(String[] args) {
        int[] idades = {17, 41, 58};

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        String[] nomes = new String[3];
        nomes[0] = "Daniel";
        nomes[1] = "Silviane";
        nomes[2] = "Naldo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
      }
}
