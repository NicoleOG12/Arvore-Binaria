public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RED = "\u001B[31m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {

        ArvoreBinariaBusca<Integer> a = new ArvoreBinariaBusca<>();
        int[] A = {10, 20, 30, 40, 50, 60, 70};
        for (int v : A) a.inserir(v);
        imprimirDiagnostico("Cenário A (degenerada à direita)", a);

        ArvoreBinariaBusca<Integer> b = new ArvoreBinariaBusca<>();
        int[] B = {70, 60, 50, 40, 30, 20, 10};
        for (int v : B) b.inserir(v);
        imprimirDiagnostico("Cenário B (degenerada à esquerda)", b);

        ArvoreBinariaBusca<Integer> c = new ArvoreBinariaBusca<>();
        int[] base = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45, 55, 65, 75, 85};
        for (int v : base) c.inserir(v);
        int[] alongar = {90, 95, 97, 98, 99};
        for (int v : alongar) c.inserir(v);
        imprimirDiagnostico("Cenário C (quase balanceada com ramo profundo)", c);
    }

    private static void imprimirDiagnostico(String titulo, ArvoreBinariaBusca<Integer> arv) {

        System.out.println("\n" + CYAN + BOLD + "══════════════════════════════════════════════" + RESET);
        System.out.println(CYAN + BOLD + titulo + RESET);
        System.out.println(CYAN + BOLD + "══════════════════════════════════════════════" + RESET);

        System.out.println(YELLOW + "Altura: " + RESET + arv.altura());
        System.out.println(YELLOW + "Nós: " + RESET + arv.contarNos());
        System.out.println(YELLOW + "Folhas: " + RESET + arv.contarFolhas());
        System.out.println();

        System.out.print(BLUE + "Em-ordem: " + RESET);
        arv.imprimirEmOrdem();

        System.out.print(GREEN + "Pré-ordem: " + RESET);
        arv.imprimirPreOrdem();

        System.out.print(PURPLE + "Pós-ordem: " + RESET);
        arv.imprimirPosOrdem();

        System.out.println(RED + "Por níveis:" + RESET);
        arv.imprimirPorNiveis();
    }
}
