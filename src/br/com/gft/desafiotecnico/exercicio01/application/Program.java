package br.com.gft.desafiotecnico.exercicio01.application;

import br.com.gft.desafiotecnico.exercicio01.entity.Veiculo;

public class Program {
    public static void main(String[] args) {

        Veiculo celtinha = new Veiculo();

        celtinha.pintar("Amarelo");
        System.out.printf("A cor do celtinha é: %s", celtinha.getCor());
        System.out.println();

        celtinha.frear();
        System.out.println("A velocidade do celtinha atualmente é de: " + celtinha.getVelocidade());

        System.out.println("A velocidade do celtinha antes do método acelerar é de: " + celtinha.getVelocidade());
        celtinha.acelerar();
        System.out.println("A velocidade do celtinha atualmente é de: " + celtinha.getVelocidade());

        celtinha.frear();
        System.out.println("A velocidade do celtinha atualmente é de: " + celtinha.getVelocidade());

    }
}
