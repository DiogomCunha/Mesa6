import models.Arvore;
import models.ArvoreFactory;

public class Main {
    public static void main(String[] args) {

        ArvoreFactory arvore = new ArvoreFactory();
        Arvore Ornamentais1 = arvore.getArvore(400, 200, "verde");
        Arvore Ornamentais2 = arvore.getArvore(400, 200, "verde");
        Arvore Ornamentais3 = arvore.getArvore(400, 200, "verde");
        Arvore Ornamentais4 = arvore.getArvore(400, 200, "verde");

        Arvore Frutiferas1 = arvore.getArvore(300, 500, "vermelho");
        Arvore Frutiferas2 = arvore.getArvore(300, 500, "vermelho");
        Arvore Frutiferas3 = arvore.getArvore(300, 500, "vermelho");
        Arvore Frutiferas4 = arvore.getArvore(300, 500, "vermelho");


        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));


    }

}