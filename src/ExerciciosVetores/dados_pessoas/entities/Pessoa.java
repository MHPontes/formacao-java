package ExerciciosVetores.dados_pessoas.entities;

public class Pessoa {

    private double altura;

    String sexo;

    public Pessoa(double altura, String sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
