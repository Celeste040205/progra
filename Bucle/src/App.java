public class App {
    public static void main(String[] args) throws Exception {
        ForNombreM fM;
        ForApellidoG fG;
        ForNombreApellidoMG fMg;
        fM = new ForNombreM();
        fG = new ForApellidoG();
        fMg = new ForNombreApellidoMG();

        fM.forM();
        fG.forG();
        fMg.forMG();
    }
}
