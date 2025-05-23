
class Persona {
    private String nombre;
    private String direction;
    private String telefono;
    private String email;
    private int edad;
    
    // Constructor vacío
    public Persona() {}
    
    public Persona(String nombre, String direction) {
        this.nombre = nombre;
        this.direction = direction;
    }
    
    // Constructor completo
    public Persona(String nombre, String direction, String telefono, String email, int edad) {
        this.setNombre(nombre);;
        this.direction = direction;
        this.telefono = telefono;
        this.email = email;
        this.setEdad(edad);
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDirection() {
        return direction;
    }
    
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if(edad > 0) { // Validación básica para edad
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
            this.edad = 0; // Valor por defecto
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direction);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Edad: " + edad);
    }
}