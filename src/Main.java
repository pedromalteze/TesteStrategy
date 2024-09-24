
public class Main {
    public static void main(String[] args) {
        // Usando média aritmética
        Disciplina disciplinaAritmetica = new Disciplina(new MediaAritmetica());
        String situacao = disciplinaAritmetica.verificarSituacao(7, 5);
        System.out.println(situacao); // Saída: Aprovado

        // Usando média geométrica
        Disciplina disciplinaGeometrica = new Disciplina(new MediaGeometrica());
        situacao = disciplinaGeometrica.verificarSituacao(8, 6);
        System.out.println(situacao); // Saída: Aprovado
    }
}