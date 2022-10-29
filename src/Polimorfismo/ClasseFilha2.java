package Polimorfismo;

class ClasseFilha2 extends ClasseMae {

    @Override
    void metodo1(){
        System.out.println("metodo 1 da classe Filha 2");
    }

    @Override
    void metodo2() {
        super.metodo2();
    }

    void medodo2(){

        System.out.println("Metodo 2 da classe Filha 2");
    }
}
