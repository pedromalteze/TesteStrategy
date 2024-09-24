interface ICalculoMedia {
    double calcularMedia(double nota1, double nota2);
    String situacao(double media);
}

class MediaAritmetica implements ICalculoMedia {
    @Override
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String situacao(double media) {
        return media >= 5.0 ? "Aprovado" : "Reprovado";
    }
}

class MediaGeometrica implements ICalculoMedia {
    @Override
    public double calcularMedia(double nota1, double nota2) {
        return Math.sqrt(nota1 * nota2);
    }

    @Override
    public String situacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}

class Disciplina {
    private ICalculoMedia calculoMedia;

    public Disciplina(ICalculoMedia calculoMedia) {
        this.calculoMedia = calculoMedia;
    }

    public String verificarSituacao(double nota1, double nota2) {
        double media = calculoMedia.calcularMedia(nota1, nota2);
        return calculoMedia.situacao(media);
    }
}