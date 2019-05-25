import java.util.ArrayList;
import java.util.List;

public class Sentencia {
	String codigo;
	String resultado;
	String tipo;
	List<String> tiposArgumentos;
	public Sentencia(String codigo, String resultado){
		this.codigo = codigo;
		this.resultado = resultado;
		this.tiposArgumentos = new ArrayList();
	 }
	
}
