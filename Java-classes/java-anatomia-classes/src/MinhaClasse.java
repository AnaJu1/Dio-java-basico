public class MinhaClasse {

    public static void main (String [] args) {
       String primeiroNome = "Ana";
       String segundoNome = "Julia";
       String sobrenome = "Oliveira";

       String nomeCompleto = nomeCompleto (primeiroNome, segundoNome, sobrenome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String sobrenome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(sobrenome);       
       
        
    }

}
