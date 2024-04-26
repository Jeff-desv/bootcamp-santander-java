public class Usuario {

    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        System.out.println("TV Ligada ?: " + smartTv.Ligada);
        System.out.println("Canal Atual ?: " + smartTv.canal);
        System.out.println("Volume Atual ?: " + smartTv.volume);

        smartTv.ligada();
        System.out.println("Tv Ligada " + smartTv.Ligada);

        smartTv.desligada();
        System.out.println("Tv desligada " + smartTv.Ligada);
    }

}
