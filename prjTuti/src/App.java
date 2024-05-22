public class App {
    public static void main(String[] args) throws Exception {

        persona oP = new persona();
        persona oP2 = new persona(null, null, null);
        cliente cP = new cliente();

        oP.setNombre("Shato");
        oP.setCedula("1752073048");
        oP.setApellido("Gallardo");

        System.out.println(oP.getNombre());
        System.out.println(oP.getApellido());
        System.out.println(oP.getCedula());
        
        System.out.println(oP2.getNombre());
        System.out.println(oP2.getApellido());
        System.out.println(oP2.getCedula());
    }
}
