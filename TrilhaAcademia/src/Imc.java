public class Imc {
    int peso;
    float altura;

    public Imc() {
    }

    public Imc(int peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float calculoImc(){
        float imc = (peso/(altura*altura));
        return imc;
    }
}
