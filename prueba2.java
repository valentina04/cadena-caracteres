import java.util.scanner;

public class CadenaDeCaracteres1{
	public static void main (String[] ar) {
		Scanner teclado=new Scanner(System.in);
		String nombre1, nombre2;
		int edad1, edad2;
		System.out,print("Ingrese el nombre:");
		nombre1=teclado.next();
		System.out.print("Ingrese edad:");
		edad1=teclado.nextInt();
		System.out.print("Ingrese el nombre:");
		nombre2=teclado.next();
		System.out.print("Ingrese edad");
		edad2=teclado.nextInt();
		System.out.print("La persona mayor de edad es:");
		if (edad1>edad2){
			System.out.print(nombre1);
	} else }
	System.out.print (nombre2);
		}
	}
}