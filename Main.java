import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ===== CABEÇALHO =====
        System.out.println("==========================================");
        System.out.println("  QUIZ DE VALORANT");
        System.out.println("==========================================");
        System.out.println("Aluno: DANILLO DAS GRAÇAS DE JESUS DOS SANTOS");
        System.out.println("Professor: BRENNO PIMENTA DA COSTA");
        System.out.println("Faculdade: UNIFAN");
        System.out.println("==========================================\n");

        // ===== LISTA DE QUESTÕES =====
        List<Questao> questoes = new ArrayList<>();

        questoes.add(new Questao("Qual empresa desenvolveu o Valorant?",
                new String[]{"Valve", "Riot Games", "Blizzard", "Epic Games"}, 2));

        questoes.add(new Questao("Quantos jogadores tem em cada time numa partida padrão?",
                new String[]{"3", "4", "5", "6"}, 3));

        questoes.add(new Questao("Quantas rodadas um time precisa vencer para ganhar a partida competitiva?",
                new String[]{"11", "13", "15", "16"}, 2));

        questoes.add(new Questao("Qual agente consegue curar seus aliados?",
                new String[]{"Jett", "Sage", "Raze", "Omen"}, 2));

        questoes.add(new Questao("Como é chamada a bomba do modo padrão do jogo?",
                new String[]{"Spike", "Core", "Cipher", "Orb"}, 1));

        questoes.add(new Questao("Qual mapa é conhecido por ter teleportes?",
                new String[]{"Ascent", "Split", "Bind", "Icebox"}, 3));

        questoes.add(new Questao("Qual agente usa habilidades de fogo e se cura com elas?",
                new String[]{"Phoenix", "Reyna", "Yoru", "Neon"}, 1));

        questoes.add(new Questao("Qual é a moeda premium usada para comprar skins?",
                new String[]{"Créditos", "Radianite", "Valorant Points", "Kingdom Credits"}, 3));

        questoes.add(new Questao("Qual sniper custa 4700 créditos?",
                new String[]{"Marshal", "Outlaw", "Judge", "Operator"}, 4));

        questoes.add(new Questao("Quantas classes de agentes existem no jogo (Duelista, Iniciador, Controlador e Sentinela)?",
                new String[]{"3", "4", "5", "6"}, 2));

        questoes.add(new Questao("De qual país é a agente Jett?",
                new String[]{"Japão", "Brasil", "Coreia do Sul", "Estados Unidos"}, 3));

        questoes.add(new Questao("Qual é a classe do agente Omen?",
                new String[]{"Duelista", "Controlador", "Sentinela", "Iniciador"}, 2));

        questoes.add(new Questao("Qual é o rank mais alto do Valorant?",
                new String[]{"Imortal", "Ascendente", "Radiante", "Diamante"}, 3));

        questoes.add(new Questao("Em que ano o Valorant foi lançado oficialmente?",
                new String[]{"2018", "2019", "2020", "2021"}, 3));

        questoes.add(new Questao("Qual agente usa a Flecha de Reconhecimento?",
                new String[]{"Sova", "Cypher", "Skye", "Fade"}, 1));

        // Embaralha as questões para o quiz não ser sempre igual
        Collections.shuffle(questoes);

        // Quantidade de perguntas do quiz (todas as 15 da lista)
        int quantidade = questoes.size();

        System.out.println("\nBoa sorte! Vamos começar o quiz.\n");

        // ===== EXECUÇÃO DO QUIZ =====
        int acertos = 0;

        for (int i = 0; i < quantidade; i++) {
            Questao questao = questoes.get(i);

            System.out.println("Questão " + (i + 1) + " de " + quantidade);
            questao.exibir();

            // Lê a resposta e repete enquanto for inválida
            int resposta = 0;
            while (resposta < 1 || resposta > 4) {
                System.out.print("Sua resposta (1 a 4): ");
                resposta = entrada.nextInt();

                if (resposta < 1 || resposta > 4) {
                    System.out.println("Resposta inválida! Digite um número de 1 a 4.");
                }
            }

            // Confere se acertou
            if (questao.verificarResposta(resposta)) {
                System.out.println("Resposta correta! :)\n");
                acertos++;
            } else {
                int certa = questao.getRespostaCorreta();
                System.out.println("Errou! A resposta certa era: "
                        + questao.getAlternativas()[certa - 1] + "\n");
            }
        }

        // ===== RESULTADO FINAL =====
        double porcentagem = (acertos * 100.0) / quantidade;

        System.out.println("==========================================");
        System.out.println("  RESULTADO FINAL");
        System.out.println("==========================================");
        System.out.println("Acertos: " + acertos + " de " + quantidade);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("==========================================");
        System.out.println("Obrigado por participar do Quiz de Valorant!");

        entrada.close();
    }
}
