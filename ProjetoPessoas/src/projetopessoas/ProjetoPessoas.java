
package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Tyrion");
        p2.setNome("Ayra");
        p3.setNome("Dany");
        p4.setNome("Jon Snow");
        
        p1.setIdade(20);
        p2.setIdade(12);
        p3.setIdade(25);
        p4.setIdade(26);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("M");
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
