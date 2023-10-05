public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("0123456789");
        jeep.ligar();

        Moto yamaha = new Moto();
        yamaha.setChassi("987456321");
        yamaha.ligar();
    }
}
