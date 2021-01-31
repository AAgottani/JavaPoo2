package Cachorrada;

import java.util.Random;

public class Pet {
    private String nome;
    private String raca;
    private String tamanho;
    private int idade;
    private String cor;
    private boolean brinca;

     public Pet(){
        this.nome="Bingo";
        this.raca="Beagle";
        this.tamanho="Médio";
        this.idade=3;
        this.cor= "Branco e preto";
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getRaca(){
        return this.raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho= tamanho;
    }
    public int getIdade(){
        return this.idade;
    } 
    public void setIdade(int idade){
        this.idade=idade;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public boolean getBrinca(){
        return this.brinca;
    }
    public void setBrinca(boolean brincalhao){
        this.brinca=brincalhao;
    }

    public static String latido() {
        String latido = "Woof! Wooof! Woof!";
        return latido;
    }

    public String brincar() {
        if (this.brinca == true) {
            String brincando = "Correndo atrás da bolinha";
            return brincando;
        } else {
            String brincando = "To nem aí...";
            return brincando;
        }

    }

    // O uso do static permite que o método seja chamado sem instanciar um objeto
    public static String movimento() {
        Random number = new Random();
        int ram_num = number.nextInt(3);
        String aux=null;
        switch (ram_num) {
            case 0:
                aux = "Tudo tranquilo! ";
                
            case 1:
                aux = "Carteiro passando! ";
                System.out.println(Pet.latido());

            case 2:
            aux = "Olha um gato! ";
            System.out.println(Pet.latido());
                
        }
        return aux;
        
    } 
}
