public class Principal {
    public static void main(String[] args) {
        Lampada led = new Lampada();
        led.modelo = "Led AliExpress";
        led.marca = "Chinesa";
        led.tipo = "Led";
        led.voltagem = 220;
        led.cor = "Amarela";
        led.garantia = ": 30 dias";
        led.preco = 15;

        led.status();
        led.desligar();
        

        
    }
}

