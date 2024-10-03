package arrays;

public class Array {
    public static void main(String[] args) {
        int[] idades = new int[5];
        idades[0] = 17;
        System.out.println(idades[0]);

        String[] nomes = new String[3];
        nomes[0] = "Daniel";
        nomes[1] = "Silviane";
        nomes[2] = "Naldo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
      }
}
