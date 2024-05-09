public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       smartTv.aumentarVolume();
       System.out.println("volume atual: " + smartTv.volume);
       smartTv.aumentarVolume();
       System.out.println("volume atual: " + smartTv.volume);
       smartTv.diminuirVolume();
       System.out.println("volume atual: " + smartTv.volume);

       
       System.out.println("Canal atual: " + smartTv.canal);
       smartTv.mudarCanal(13);
       System.out.println("Canal atual: " + smartTv.canal);

       System.out.println("Tv ligada? " + smartTv.ligada);
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: " + smartTv.volume);

      

       smartTv.ligar();
       System.out.println("Tv ligada? " + smartTv.ligada);
    }
}
