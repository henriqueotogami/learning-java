package Teoria;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object object) {

        // --------------------------------------
        // Primeira Opcao - Inicio
//        if (object instanceof Usuario) {
//            Usuario user = (Usuario) object;
//            return super.equals(object);
//        }
//        return false;
        // --------------------------------------
        // Primeira Opcao - Fim

        // --------------------------------------
        // Segunda Opcao - Inicio
//        Usuario user = (Usuario) object;
//
//        boolean nomeIgual = user.nome = this.nome;
//        boolean emailIgual = user.email = this.email;
//
//        return nomeIgual && emailIgual;
        // --------------------------------------
        // Segunda Opcao - Fim

        // --------------------------------------
        // Terceira Opcao - Inicio
        Usuario user = (Usuario) object;

        boolean nomeIgual = user.nome.equals(this.nome);
        boolean emailIgual = user.email.equals(this.email);

        return nomeIgual && emailIgual;
        // --------------------------------------
        // Terceira Opcao - Fim
    }
}
