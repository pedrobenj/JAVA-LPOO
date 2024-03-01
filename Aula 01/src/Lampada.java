public class Lampada {
    
    String marca;
    String tipo;
    String modelo;
    String cor;
    float preco;
    String garantia;
    float voltagem;
    boolean statusAtivo;


    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    public void ligar() {
        System.out.println("Lâmpada ligada");
        statusAtivo = true;
    }
    public void desligar() {
        System.out.println("Lâmpada desligada");
        statusAtivo = false;
    }
    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Status da lampada: " + statusAtivo);
    }
    
}

