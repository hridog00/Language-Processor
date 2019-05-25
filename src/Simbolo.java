import java.util.ArrayList;
import java.util.List;

public class Simbolo {
	String nombre;
	String valor;
	String tipo;
	int tam;
    int tam2;
    List<String> param;
	public Simbolo(String nombre, String valor){
		this.nombre = nombre;
		this.valor = valor;
        this.param = new ArrayList<>();

		
	 }
	
}