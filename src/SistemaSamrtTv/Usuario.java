package SistemaSamrtTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("qual Canal esta: "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("qual Canal esta: "+smartTv.canal);
        System.out.println("Volume atual :"+ smartTv.volume);




        System.out.println("TV esta ligada? "+smartTv.ligada);
        System.out.println("qual Canal esta: "+smartTv.canal);
        System.out.println("qual Volume esta: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -  esta ligada? "+smartTv.ligada);


    }
}
