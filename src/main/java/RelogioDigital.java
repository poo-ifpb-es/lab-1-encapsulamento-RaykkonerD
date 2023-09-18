public class RelogioDigital {
  private int hora;
  private int minuto;
  
  public RelogioDigital() {
    this.hora = 12;
    this.minuto = 20;
  }
  
  public int getHora(){
    return this.hora;
  }
  
  public void setHora(int hora){
    if(hora < 0){
      hora = 24 + hora;
    } else if(hora > 23){
      hora -= 24;
    }
    this.hora = hora;
  }
  
  public int getMinuto(){
    return this.minuto;
  }
  
  public void setMinuto(int minuto){
    if(minuto < 0){
      minuto = 60 + minuto;
      this.hora -= 1;
    } else if(minuto > 59){
      minuto -= 60;
      this.hora += 1;
    }
    this.minuto = minuto;
  }
  
  public void tick(){
    if(this.minuto == 59){
      if(hora == 23){
        this.hora = 0;
      } else {
        this.hora++;
      }
      this.minuto = 0;
    } else {
      this.minuto++;
    }
  }
}