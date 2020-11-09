package es.studium.Operaciones3;

import java.util.Scanner;

public class Operaciones3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3 ;
		System.out.println( "Primer número" );
		numero1=teclado.nextInt();
		System.out.println( "Segundo número" );
		numero2=teclado.nextInt();
		System.out.println( "Tercer número" );
		numero3=teclado.nextInt();
		teclado.close();
		System.out.println( "La suma es " + suma(numero1,numero2,numero3));
		System.out.println( "La multiplicación es " + multi(numero1,numero2,numero3));
		System.out.println( "La media es " + media(numero1,numero2,numero3));
	}
	public static int suma(int a, int b, int c)
    {
        int resultado;
        resultado=a+b+c;
        return(resultado);
    }
	public static int multi(int a, int b,int c)
    {
        int resultado;
        resultado=a*b*c;
        return(resultado);
    }
	public static int media(int a, int b,int c)
    {
        int resultado;
        resultado=suma(a,b,c)/3;
        return(resultado);
    }
}
/*
 PROGRAMA ejercicio20
VARIABLES
	ENTERO a,b
INICIO
	ESCRIBIR "Introduce el primer número"
	LEER a
	ESCRIBIR "Introduce el segundo número"
	LEER b
	ESCRIBIR "Introduce el tercer número"
	LEER C
	ESCRIBIR "La suma de los tres números " + funSum(a,b,c)
	ESCRIBIR "La multiplicación de los tres números " + funMult(a,b,c)
	ESCRIBIR "La media de los tres números " + media(a,b,c)
FIN

FUNCION funSum (ENTERO a,ENTERO b,ENTERO c ) DEVUELVE ENTERO

VARIABLES
	ENTERO r
INICIO
	r=a+b+c
DEVOLVER r
FIN

FUNCION funMult (ENTERO a,ENTERO b,ENTERO c ) DEVUELVE ENTERO

VARIABLES
	ENTERO r
INICIO
	r=a*b*c
DEVOLVER r
FIN

FUNCION media (ENTERO a,ENTERO b,ENTERO c ) DEVUELVE REAL

VARIABLES
	ENTERO m
INICIO
	m=funSum(a,b,c)/3
DEVOLVER m
FIN*/
 