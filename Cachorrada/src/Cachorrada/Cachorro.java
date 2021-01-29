package Cachorrada;

public class Cachorro {
    public static void main(String[] args) throws Exception {
        System.out.println("Woof!");
    

    Pet dog= new Pet();
    dog.setNome("kymmy");
    System.out.print(dog.getNome());
    System.out.print(dog.latido());
}
}