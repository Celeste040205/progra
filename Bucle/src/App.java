public class App {
    public static void main(String[] args) throws Exception {
        forInicialNombreM fM;
        forInicialApellidoG fG;
        forInicialNombreApellidoMG fMg;
        fM = new forInicialNombreM();
        fG = new forInicialApellidoG();
        fMg = new forInicialNombreApellidoMG();

        fM.forM();
        fG.forG();
        fMg.forMG();
    }
}
