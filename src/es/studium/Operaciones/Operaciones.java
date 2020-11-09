package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println( "Dame un numero" );
		numero1=teclado.nextInt();
		System.out.println( "Dame un numero" );
		numero2=teclado.nextInt();
		teclado.close();
		System.out.println( "La suma es " + (numero1+numero2) );
		System.out.println( "La suma es " + (numero1-numero2) );
		System.out.println( "La suma es " + (numero1*numero2) );
		if(numero2==0)
		{
			System.out.println( "No se puede dividir");
		}
		else
		{
			System.out.println( "El resultado es " + ((float)numero1/(float)numero2));
		}
	}
}

/*PROGRAMA ejercicio18
VARIABLES
ENTERO a,b
INICIO
ESCRIBIR "Introduce el primer número"
LEER a
ESCRIBIR "Introduce el segundo número"
LEER b
ESCRIBIR "La suma de los dos números " + (a+b)
ESCRIBIR "La resta de los dos números " + (a-b)
ESCRIBIR "La multiplicación de los dos números " + (a*b)
SI b = 0 ENTONCES
	ESCRIBIR "No se puede dividir el 0 es indivisible"
SINO
	 ESCRIBIR "La división de los dos números  " + (a/b)
FINSI
FIN*/