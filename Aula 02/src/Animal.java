public class Animal {
    String nome, tipo;
    int idade;

    public double calcularQntAlimento() {
        double qntAlimento = 0;

        switch(tipo.toLowerCase()) {
            case "mamífero":
                qntAlimento = idade*365*2;
            case "ave":
                qntAlimento = idade*365*0.1;
            case "peixe":
                qntAlimento = idade*365*0.02;
            default:
                
        }

        return qntAlimento;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Tipo: "+ tipo);
        System.out.println("Quantidade de Alimento Diário: "+calcularQntAlimento());
    }
}

