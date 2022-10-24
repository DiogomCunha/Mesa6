package models;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String,Arvore> macFlyweidht = new HashMap<>();


    public Arvore getArvore(int largura, int altura, String cor) {
        String arvore = "Sua Arvore foi adicionada: Altura = " + altura + "," + "Largura = " + largura + "," + "cor = " + cor;
        System.out.println(arvore);
        if (!macFlyweidht.containsKey(arvore)) {
        macFlyweidht.put(arvore,new Arvore(altura,largura,cor));
            System.out.println("Arvore criada com sucesso!");
            return macFlyweidht.get(arvore);
        }
        System.out.println("Arvore obtida!!");
        return macFlyweidht.get(arvore);
    }
}
