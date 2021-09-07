package Teoria;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

//    public boolean equals(Object object) {

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
//        if (object instanceof Usuario){
//            Usuario user = (Usuario) object;
//
//            boolean nomeIgual = user.nome.equals(this.nome);
//            boolean emailIgual = user.email.equals(this.email);
//
//            return nomeIgual && emailIgual;
//
//        }
        // --------------------------------------
        // Terceira Opcao - Fim

//        return false;
//    }

    // TODO: HashCode será implementado em outra aula.

    // HashCode provisório
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, email);
//    }

    // --------------------------------------
    // Quarta Opcao - Inicio
    // Equals e HashCode gerado pelo próprio IntelliJ

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Usuario)) return false;
        Usuario usuario = (Usuario) object;
        return nome.equals(usuario.nome) && email.equals(usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    // --------------------------------------
    // Quarta Opcao - Fim
}
