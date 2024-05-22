public class Usuario {
public static void main(String[] args) throws Exception {

  SmartTv smartTv = new SmartTv();

  smartTv.diminuirVolue();
  smartTv.diminuirVolue();
  smartTv.diminuirVolue();
  smartTv.aumentarVolume();

  System.out.println("Canal Atual: " + smartTv.canal);
  smartTv.mudarCanal(12);
  System.out.println("Canal Atual: " + smartTv.canal);
  
  System.out.println("Volume atual? " + smartTv.volume);

  System.out.println("Televisão está ligada? " + smartTv.ligada);
  System.out.println("Canal atual? " + smartTv.canal);
  System.out.println("Volume Atual? " + smartTv.volume);


  smartTv.ligar();
  System.out.println("Televisão está ligada? " + smartTv.ligada);

  smartTv.desligar();
  System.out.println("Televisão está ligada? " + smartTv.ligada);
}

}
