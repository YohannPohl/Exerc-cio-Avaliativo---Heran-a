package formas;

public class RetLinhasDuplas extends Retangulo{
    public RetLinhasDuplas(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        int comprimento = texto.length() + 4;
        desenharLinha(comprimento, "=");
        System.out.println("|| " + texto + " ||");
        desenharLinha(comprimento, "=");
    }

    private void desenharLinha(int comprimento, String caractere) {
        for (int i = 0; i < comprimento; i++) {
            System.out.print(caractere);
        }
        System.out.println();
    }
    
}
