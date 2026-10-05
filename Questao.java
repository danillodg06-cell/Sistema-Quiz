/**
 * Classe que representa uma questão do quiz.
 * Guarda o enunciado, as alternativas e a resposta correta.
 */
public class Questao {

    // Atributos da questão
    private String enunciado;
    private String[] alternativas;
    private int respostaCorreta; // número da alternativa certa (1 a 4)

    // Construtor
    public Questao(String enunciado, String[] alternativas, int respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    // Getters
    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    // Mostra a questão na tela
    public void exibir() {
        System.out.println(enunciado);
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println((i + 1) + ") " + alternativas[i]);
        }
    }

    // Verifica se a resposta do usuário está certa
    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }
}
