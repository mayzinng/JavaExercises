package fluxoEtiposDeVariaveis;

public class TesteWhile {
	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 10) {
			
			contador++;
			System.out.println(contador);
			contador += 1;
			System.out.println(contador);
		}
	}
}
