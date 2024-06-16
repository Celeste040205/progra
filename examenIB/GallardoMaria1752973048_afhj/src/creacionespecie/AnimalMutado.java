package creacionespecie;

public class AnimalMutado {
    public class CelesteTortugaGallardo {
        private String nombre;

        public String nombre() {
            return "CelesteTortugaGallardo esta mutando";
        }
    
        public CelesteTortugaGallardo(String nombre) {
            this.nombre = nombre;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

}
