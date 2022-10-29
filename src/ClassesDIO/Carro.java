package ClassesDIO;

import Heranca.Veiculo;

public class Carro extends Veiculo {

    String cor;
    String modelo;
    int capacidade;


    Carro () {

    }


    Carro(String cor, String modelo, int capacidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    double totalTanque (double valorCombustivel){
        return  capacidade*valorCombustivel;

    }


}
