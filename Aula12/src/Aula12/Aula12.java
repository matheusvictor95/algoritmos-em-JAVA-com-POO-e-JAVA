package Aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave av = new Ave();
        
        m.setPeso(35.4f);
        m.setMembros(4);
        m.setIdade(5);
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        Cobra co = new Cobra();
        Cachorro ca = new Cachorro();
        Goldfish go = new Goldfish();
        Canguru cang = new Canguru();
        Arara ara = new Arara();
        Tartaruga ta = new Tartaruga();
        cang.locomover();
    }
    
}
