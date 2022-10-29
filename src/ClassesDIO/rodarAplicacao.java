package ClassesDIO;

public class rodarAplicacao {

    public static void main(String[] args) {


        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Porsche");
        carro1.setCapacidade(30);
        System.out.println("O carro "+carro1.getModelo() + " da cor "+ carro1.getCor()+" tem capacidade de " +
                "armazenamento de "+ carro1.getCapacidade()+" litros\n");

        System.out.println("o valor do combustivel e "+ carro1.totalTanque(6.35d));

        Carro carro2 = new Carro();

        carro1.setCor("Rosa");
        carro1.setModelo("Mustang");
        carro1.setCapacidade(35);
        System.out.println("\nO carro "+carro1.getModelo() + " da cor "+ carro1.getCor()+" com capacidade de " +
                "armazenamento de "+ carro1.getCapacidade());

        System.out.println("\no valor do combustivel e "+ carro1.totalTanque(5d));


    }
}
