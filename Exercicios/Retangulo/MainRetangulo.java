package formas;

public class MainRet {
    public static void main(String[] args) {
        Retangulo simples = new RetSimples("Texto Simples");
        simples.desenhar();
        
        Retangulo duplas = new RetLinhasDuplas("Texto com Linhas Duplas");
        duplas.desenhar();
        
        Retangulo asciiArt = new RetASCIIArt("Arte ASCII");
        asciiArt.desenhar();
        
        Retangulo colorido = new RetColorido("Texto Colorido");
        colorido.desenhar();
    }
}
