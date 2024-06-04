public class VariaveisMetodos {
     public static void main (String [] args){
        
        String primeiroNome = "Gustavo Henrique";
        String segundoNome = "M. da Silva";

        String juntarNome = JuntarNome(primeiroNome, segundoNome);
        System.out.print(juntarNome);
    }

    public static String JuntarNome(String primeiroNome, String segundoNome){
        return  primeiroNome + " " + segundoNome;
    }
}
