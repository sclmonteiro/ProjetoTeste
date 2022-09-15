/**
 * @author Sofia Monteiro
 *
 * Projeto de teste do Git
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos ouvir dois programas a ir escrutinar");
        Programa programa1 = new PJava("ProjetoJava");
        Programa programa2 = new PPython("ProjetoPython");
        System.out.println(programa1.getName() + " " + programa1.speak());
        System.out.println(programa2.getName() + " " + programa2.speak());
    }
}
