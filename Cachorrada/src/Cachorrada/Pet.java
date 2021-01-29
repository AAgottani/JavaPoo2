package Cachorrada;



public class Pet {
    private String nome;
    private String raca;
    private String tamanho;
    private int idade;
    private String cor;

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

    public String latido(){
        String latido= "Woof! Wooof! Woof!";
        return latido;
    }



}
