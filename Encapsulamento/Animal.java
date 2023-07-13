package Encapsulamento;

abstract class Animal {
    public abstract void emitirSom();
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("O gato está miando.");
    }
}

