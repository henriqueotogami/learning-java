package Teoria;

public class Equals {

    public static void main(String[] args) {

        Usuario userOne = new Usuario();
        userOne.nome = "Pedro Silva";
        userOne.email = "pedro.silva@email.com";

        Usuario userTwo = new Usuario();
        userTwo.nome = "Pedro Silva";
        userTwo.email = "pedro.silva@email.com";

        System.out.println(userOne == userTwo);
        // false porque o objeto possui endereco de memoria diferente

        System.out.println(userOne.equals(userTwo));
        // Se nao implementar esse metodo, o resultado sera false



    }


}
