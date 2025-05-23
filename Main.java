public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Mateo");
        persona.setDirection("Calle 123");
        persona.setEdad(-10); 
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        
        Persona marvin = new Persona("Marvin", "Calle 123", "78458956", "antonio@gmail.com", 30);
        marvin.mostrarDatos();
        
        Persona antonio = new Persona("Antonio", "Calle 100");
        System.out.println(antonio.getNombre());
    }
}
