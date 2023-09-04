public class Circulo {
    private float raio;
    private float PI = 3.14159f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio(){
        return this.raio;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public float getArea(){
        return this.PI * (this.raio * this.raio);
    }
    
    public float getCircunferencia(){
        return 2 * this.PI * this.raio;
    }
}
