package projetopessoas;
public class Professor extends Pessoa {
    private String especialidade;
    private float sal;
    
    public void receberAum(float aum){
        this.sal += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
    
}
