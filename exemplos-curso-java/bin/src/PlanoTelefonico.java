public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano ="T"; //M,B ou T

        switch(plano){
            case "T":{
                System.out.println("5GB de Youtube");
            }case "M":{
                System.out.println("Whatsapp e Instagram Ilimitado");
            }case "B":{
                System.out.println("100 minutos em ligações grátis");
            }
        }
    }
}
