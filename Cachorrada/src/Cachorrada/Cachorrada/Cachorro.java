package Cachorrada;

public class Cachorro {
    public static void main(String[] args) throws Exception {
        System.out.println("Woof!");
    

    Pet dog= new Pet();
    dog.setNome("kymmy");
    System.out.println(dog.getNome());
    System.out.println(Pet.latido());
    dog.setBrinca(true);
    System.out.println(dog.brincar());
    System.out.println(Pet.movimento());
    
}
}