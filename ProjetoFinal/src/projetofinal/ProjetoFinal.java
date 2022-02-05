package projetofinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Receita de Brownie");
        v[1] = new Video("Introdução a Linguagem Python");
        v[2] = new Video("Receita de bolo de chocolate");
        System.out.println("VÍDEOS \n ----------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        //System.out.println(v[0].toString());
        
        Gafanhoto g[] = new Gafanhoto[3];
       
        g[0] = new Gafanhoto("Aquiles",12,"M","aquiles01");
        g[1] = new Gafanhoto("Bruna Marquezine",27,"F","bruninha01");
        g[2] = new Gafanhoto("thiago Ventura",30,"M","thiagodeespearta01");
        Visualizacao vis[] = new Visualizacao [5];
        vis[0] = new Visualizacao(g[0],v[0]);
        //vis[0].avaliar();
        vis[1] = new Visualizacao(g[0],v[2]);
        vis[2] = new Visualizacao(g[0],v[1]);
        vis[3] = new Visualizacao(g[1],v[1]);
        vis[4] = new Visualizacao(g[2],v[0]);
       
        System.out.println(vis[0].toString());
        
    

         System.out.println("\nGAFANHOTOS \n ---------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());
        
    
    } 
}
