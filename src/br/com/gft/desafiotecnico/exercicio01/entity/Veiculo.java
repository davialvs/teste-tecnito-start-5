package br.com.gft.desafiotecnico.exercicio01.entity;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;


    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Methods
    public void acelerar(){
        this.velocidade += 20;
    }

    public void frear(){
        if (velocidade == 0) {
            System.out.println("O veículo está parado!");
            return;
        }
        velocidade -= 20;
    }

    public void pintar(String cor){
         this.cor = cor;
    }
}