package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2
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
		System.out.println( "La suma es " + suma(numero1,numero2));
		System.out.println( "La suma es " + resta(numero1,numero2) );
		System.out.println( "La suma es " + multi(numero1,numero2));
		if(numero2==0)
		{
			System.out.println( "No se puede dividir");
		}
		else
		{
			System.out.println( "El resultado es " + dividir(numero1,numero2));
		}
	}
	public static int suma(int a, int b)
    {
        int resultado;
        resultado=a+b;
        return(resultado);
    }
	public static int resta(int a, int b)
    {
        int resultado;
        resultado=a-b;
        return(resultado);
    }

	public static int multi(int a, int b)
    {
        int resultado;
        resultado=a*b;
        return(resultado);
    }

	public static float dividir(int a, int b)
    {
        float resultado;
        resultado=(float)a/(float)b;
        return(resultado);
    }



}


/*
PROGRAMA ejercicio19
VARIABLES
	ENTERO a,b
INICIO
	ESCRIBIR "Introduce el primer número"
	LEER a
	ESCRIBIR "Introduce el segundo número"
	LEER b
	ESCRIBIR "La suma de los dos números " + funSum(a,b)
	ESCRIBIR "La resta de los dos números " + funRest(a,b)
	ESCRIBIR "La multiplicación de los dos números " + funMult(a,b)
	SI b = 0 ENTONCES
		ESCRIBIR "No se puede dividir"
	SINO
		 ESCRIBIR "La división de los dos números  " + funDiv(a,b)
	FINSI
FIN

FUNCION funSum (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
	ENTERO c
INICIO
	c=a+b
DEVOLVER c
FIN

FUNCION funRest (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
	ENTERO c
INICIO
	c=a+b
DEVOLVER c
FIN

FUNCION funMult (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
	ENTERO c
INICIO
	c=a*b
DEVOLVER c
FIN

FUNCION funDiv (ENTERO a,ENTERO b,) DEVUELVE REAL

VARIABLES
	REAL c
INICIO
	c=a/b
DEVOLVER c
FIN
*/