

public class Persona {
        private String nombre;
        private Integer edad;



        public Persona (String nombrePersona, int edad){
            this.edad = edad;
            this.nombre = nombrePersona;
        }
        public String getNombre(){
            return this.nombre;
        }

        public Integer getEdad() {
        return edad;
    }
}
