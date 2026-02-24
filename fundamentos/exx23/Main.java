package ex23;

public class Main {
    public static void main(String[] args) {

        FilaImpressao fila = new FilaImpressao();

        fila.adicionarDocumento("Documento1.pdf");
        fila.adicionarDocumento("Foto.png");
        fila.adicionarDocumento("Trabalho.docx");
        fila.adicionarDocumento("Planilha.xlsx");
        fila.adicionarDocumento("Apresentacao.ppt");

        fila.processarFila();
    }
}