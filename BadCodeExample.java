public class BadCodeExample {

    public static void main(String[] args) {
        // Uso inadequado de uma variável não utilizada
        int unusedVariable = 42;

        // Uso inadequado de uma instrução "if" sem chaves
        if (true)
            System.out.println("Este bloco if não tem chaves.");

        // Uso inadequado de uma string literal não internacionalizada
        String message = "Esta mensagem não deve ser hardcoded.";

        // Uso inadequado de um bloco try-catch vazio
        try {
            // Código que pode lançar exceções
        } catch (Exception e) {
            // Bloco catch vazio
        }

        // Uso inadequado de uma chamada de método com muitos parâmetros
        doSomething("par1", "par2", "par3", "par4", "par5", "par6", "par7", "par8", "par9", "par10");
    }

    private static void doSomething(String... params) {
        // Método com muitos parâmetros
    }
}
