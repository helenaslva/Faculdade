package Busca.ArvoreBinariaBusca;

public class NoArvoreBinaria {
        private int info;
        private NoArvoreBinaria esquerda;
        private NoArvoreBinaria direita;

        public NoArvoreBinaria(int info) {
            this.info = info;
            esquerda = null;
            direita = null;
        }

        public NoArvoreBinaria(int info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
            this.info = info;
            esquerda = esq;
            direita = dir;
        }

        public NoArvoreBinaria getEsquerda() {
            return esquerda;
        }

        public void setEsquerda(NoArvoreBinaria esquerda) {
            this.esquerda = esquerda;
        }

        public NoArvoreBinaria getDireita() {
            return direita;
        }

        public void setDireita(NoArvoreBinaria direita) {
            this.direita = direita;
        }

        public int getInfo() {
            return info;
        }
}
