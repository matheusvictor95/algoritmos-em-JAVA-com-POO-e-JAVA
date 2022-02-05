package projetofinal;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totVideo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.totVideo=0;
        this.login = login;
    }
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotVideo() {
        return totVideo;
    }

    public void setTotVideo(int totVideo) {
        this.totVideo = totVideo;
    }

    @Override
    public void ganharExp() {
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+ "\nlogin = " + login + ", totVideo = " + totVideo + '}';
    }
    
    
}
