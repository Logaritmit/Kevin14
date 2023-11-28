

public class ComidasTipicas{
    // Atributos
    public String nombre;
    public int precio;





    public ComidasTipicas(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return  nombre;
    }

    public void getNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPrecio(){
        return  precio;
    }

    public int getPrecio (int precio){
        this.precio = precio;
    }
    public void Comidas(){
        System.out.println("NOMBRE: "+ nombre);
        System.out.println("PRECIO: $"+ precio);




    }

    public static void main(String[] args){
        ComidasTipicas primera = new ComidasTipicas("GUATITA", 3);
        ComidasTipicas segunda =new ComidasTipicas("TRIGILLO", 2);
        ComidasTipicas Tercera =new ComidasTipicas("ENCEBOLLADO", 3);
        ComidasTipicas Cuarta =new ComidasTipicas("ARROZ_COLORADO", 3);
        primera.Comidas();
        segunda.Comidas();
        Tercera.Comidas();
        Cuarta.Comidas();

    }
