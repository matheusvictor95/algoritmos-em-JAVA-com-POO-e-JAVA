package aula011;
public class Aula011 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Homer Simpsom");
        v1.setIdade(45);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println("----------------------------------------------------");
        
        Aluno a1 = new Aluno();
        a1.setNome("Bart Simpsom");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(12);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        System.out.println("---------------------------------------------------");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Lisa Simpsom");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setCurso("Informática");
        b1.setIdade(10);
        b1.setSexo("F");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
    
}
