import java.util.Random;

public class JogoAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.setNome("Macaco");
        animal1.gerarDanoAleatorio();
        animal1.setForcaMordida(10);


        System.out.println("O dano aleatorio é: "+animal1.getDano());
        System.out.println("O dano total causado foi de "+animal1.calcularDano());

        animal1.setForcaMordida(13);
        System.out.println("O dano total causado foi de "+animal1.calcularDano());
        System.out.println(animal1.getNome());
        System.out.println(animal1.getDano());
        System.out.println(animal1.getForcaMordida());

    }
}
