package projetolivro;
public class ProjetoLivro {
    public static void main (String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0]= new Pessoa("Josias",15, "M");
        p[1] = new Pessoa("Maria",22,"F");
        
        l[0]= new Livro("Alice no páis das Maravilhas","Lewis Carroll",112,p[0]);
        l[1] = new Livro("Você sabe estudar? Quem sabe, estuda menos e aprende mais","claudio Moura Castro",176,p[1]);
        l[2]= new Livro("Seis propostas para o proxímo milênio","Italo Calvino",144,p[0]);
        System.out.println(l[1].detalhes());
    }
}
