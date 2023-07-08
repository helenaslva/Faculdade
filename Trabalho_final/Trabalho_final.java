package Trabalho_final;

import java.util.Scanner;

public class Trabalho_final {
    private Trabalho_final() {// construtor

        Scanner input = new Scanner(System.in);
        char[][] tabuleiro = new char[6][7]; // Vertical|Linha = 6, Horizontal|Coluna = 7

        boolean ganhou = true;
        char resposta = 'S'; // criação de duas variáveis.

        do { // faça este processo enquanto a resposta for SIM.
            char time = selecionarTime(input); // time = selecionar time.

            comeco(tabuleiro);

            while (ganhou == true) {
                if (encher(input, tabuleiro, time)) {
                    ganhou = true;

                    System.out.println("Deseja jogar novamente? S/N");
                    resposta = input.next().toUpperCase().charAt(0);

                    break;

                }

                if (encherComputador(tabuleiro, time)) {
                    ganhou = true;

                    System.out.println("Deseja jogar novamente? S/N");
                    resposta = input.next().toUpperCase().charAt(0);
                    break;

                }
            }
        } while (resposta == 'S');

    }

    // literalemente o tabuleiro e suas dimensões.
    private void imprimir(char[][] tabuleiro) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=-------------------=");
    }

    private void comeco(char[][] tabuleiro) { // preenche os lugares com B no tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = 'B';
            }
        }
        imprimir(tabuleiro); // imprime o tabuleiro completo.
    }

    private char selecionarTime(Scanner teclado) { // char porque ele seleciona uma letra.
        System.out.print("Escolha entre o time Vermelho (V) e o time Azul (A): ");
        char time = teclado.next().toUpperCase().charAt(0);

        while (time != 'A' && time != 'V') {// verificação
            System.out.print("Escolha entre o time Vermelho (V) e o time Azul (A): ");
            time = teclado.next().toUpperCase().charAt(0);
        }

        if (time == 'V') {
            System.out.println("Você é do time Vermelho! Boa Sorte!");
            return time;
        } else {
            System.out.println("Você é do time Azul! Boa Sorte!");
            return time;
        }
    }

    private boolean checarVitoria(char[][] tabuleiro, char t) {
        boolean vitoria = false;

        // horizontal e T é o time.
        for (int i = 0; i < tabuleiro.length; i++) { // lê todas as linhas
            for (int j = 0; j < 4; j++) { // vai ler somente 4 colunas I LINHA J COLUNA
                if (tabuleiro[i][j] == t && tabuleiro[i][j + 1] == t && tabuleiro[i][j + 2] == t && tabuleiro[i][j + 3] == t) { // checagem de
                                                                                                        // coluna
                                                                                                        // 0,1,2,3 e 4
                                                                                                        // ele ganha
                    vitoria = true;
                    break;
                }
            }
        }

        // vertical
        for (int i = 0; i < 3; i++) { // vi ler todas as linhas na vertical, lendo de cima para baixo.
            for (int j = 0; j < tabuleiro[0].length; j++) {
                if (tabuleiro[i][j] == t && tabuleiro[i + 1][j] == t && tabuleiro[i + 2][j] == t && tabuleiro[i + 3][j] == t) { // checagem de
                                                                                                        // linha.
                    vitoria = true;
                    break;
                }
            }
        }

        // verificar vitória na diagonal para a direita
        for (int i = 0; i < 3; i++) { // checagem para linha
            for (int j = 0; j < 4; j++) { // checagem para coluna
                if (tabuleiro[i][j] == t && tabuleiro[i + 1][j + 1] == t && tabuleiro[i + 2][j + 2] == t && tabuleiro[i + 3][j + 3] == t) {
                    vitoria = true; // calculo para ir para a direita + [posicao]
                    break;
                }
            }
        }

        // verificar vitória na diagonal para a esquerda
        for (int i = 0; i < 3; i++) { // checagem para linha
            for (int j = 3; j < 7; j++) { // checagem para coluna
                if (tabuleiro[i][j] == t && tabuleiro[i + 1][j - 1] == t && tabuleiro[i + 2][j - 2] == t && tabuleiro[i + 3][j - 3] == t) {
                    vitoria = true; // calculo para ir voltando para a esquerda - [posicao]
                    break;
                }
            }
        }
        return vitoria;
    }

       private boolean checarEmpate(char[][] tabuleiro) {
        for (int j = 0; j < tabuleiro[0].length; j++) {
            if (tabuleiro[0][j] == 'B') { // posição 0 de linha 
                return false;
            }
        }
        return true;
    }

    private boolean encher(Scanner teclado, char[][] tabuleiro, char time) {

        System.out.print("Jogador, faça sua jogada (coluna de 1 a 7): ");
        int coluna = teclado.nextInt() - 1;

        while (coluna < 0 || coluna > 6) { // coluna está delimitada em 1 a 7.
            System.out.println("Jogada inválida. Tente novamente.");
            System.out.print("Jogador, faça sua jogada (coluna de 1 a 7): ");
            coluna = teclado.nextInt() - 1;

        }
        System.out.println();

        int linha = 5;
        for (int i = 0; i < 6; i++) {
            boolean cheio = true;
            for (linha = 5; linha >= 0; linha--) {
                if (tabuleiro[linha][coluna] == 'B') {
                    tabuleiro[linha][coluna] = time;
                    cheio = false;
                    break;
                }
            }

            if (cheio) {
                System.out.println("A coluna está cheia! Tente outra");
                coluna = teclado.nextInt() - 1;
            } else
                break;
        }

        imprimir(tabuleiro);

        if (checarVitoria(tabuleiro, time)) {
            System.out.println("Você ganhou!");
            return true;
        }
        if (checarEmpate(tabuleiro)) {
            System.out.print("EMPATOU!");
            return true;
        }

        return false;
    }

    private boolean encherComputador(char[][] tabuleiro, char time) {
        System.out.println("Vez do computador!");
        int coluna = (int) (Math.random() * 7);

        int linha = 5;
        for (int i = 0; i < 6; i++) {
            boolean cheio = true;
            for (linha = 5; linha >= 0; linha--) {
                if (tabuleiro[linha][coluna] == 'B') {
                    if (time == 'V')
                        tabuleiro[linha][coluna] = 'A';
                    else
                        tabuleiro[linha][coluna] = 'V';
                    cheio = false;
                    break;
                }
            }

            if (cheio) {
                coluna++;
                if (coluna > 6)
                    coluna = 0;
            } else
                break;
        }

        imprimir(tabuleiro);

        if (time == 'V') {
            if (checarVitoria(tabuleiro, 'A')) {
                System.out.println("O computador ganhou!");
                return true;
            }
        } else if (checarVitoria(tabuleiro, 'V')) {
            System.out.println("O computador ganhou!");
            return true;
        }
        if (checarEmpate(tabuleiro)) {
            System.out.print("EMPATOU!");
            return true;
        }

        return false;
    }

 

    public static void main(String[] args) {
        new Trabalho_final();
    }
}
