
public class Principal {

	public static void main(String[] args) {
		
		/*
		 * REPASO DE JAVA BÁSICO
		 * 
		 * */
		
		
		//VARIABLE DE TIPO PRIMITIVO
		
		//DE TIPO ENTERO 
		
		//Variables de tipo entero
		int num = 2020;
		
		//Variables de tipo short
		short num_peque=1000;
		
		//VARIABLES DE TIPO FLOTANTE 
		
		//Variables de tipo double
		double num_dec=10.25;
		
		//Variable de tipo float
		float num_dec_pequ=5.5f;
		
		
		//Variables de tipo booleano
		boolean condicion=true;
		
		//Variables de tipo caracter
		char caracter='c';
						
		//variable de tipo cadena
		String nombre="cualquier texto";
		
		
		/*
		 * CONVERSIONES DE VARIALBLES
		 * */
		
		//COnversiones a cadena
		
		String var_convertida=String.valueOf(num);
		
		String var_convertida2=String.valueOf(condicion);
		
		//Cnversiones de double a entero
		
		int convertir_entero=(int)num_dec;
		
		double convertir_double=num;
		
		//Obtener caracteres
		
		char obtener_caracter=nombre.charAt(0); //Devuelve "D"
		
		//Obtener subcadenas
		
		String subcadena=nombre.substring(2); //Devuelve "Dav"
		
		
		//OPERADORES ARITMETICOS
		
		int a = 5;
		int b =10;
		
		//operador suma
		
		int suma=a+b; //Devuelve 15
		
		//operador resta
		int resta_de_a_y_b=a-b;  //Devuelve -5
		
		//operador multiplicacion
		
		int multiplicacion= a*b;  //devuelve 50
		
		//operador division
		
		double division= a/b;    //devuelve 0.5
		
		//resto o residuo
		
		int residuo=b%a;    //devuelve 0
		
		//OPERADORES LOGICOS y SENTENCIAS DE CONTROL
		
		//SENTENCIA IF
		if(a==b) {
			//ejecuta si se cumple
		}else if(a>b) {
			//ejecuta si se cumple la nueva condicion
		}
		else{
			//ejecuta si no se cumple
		}
		
		//SENTENCIA SWITCH
		String condicion2="RESTA";
		switch(condicion2) {
		
		case "SUMA": 
			//System.out.println("La operacion es SUMA");
			break;
		case "RESTA":
			//System.out.println("la operacion es RESTA");
			break;
		case "DIVISION":
			//System.out.println("la operacion es division");
			break;		
		}
		
		//CICLOS
		
		//CICLO FOR
		
		for(int i=0;i<=10;i=i+1) {
			
			//System.out.println(i);	
		}
		//System.out.println("----------con WHILE----------");
		
		//CICLO WHILE
		int contador =0;
		
		while(contador<=10) {
			//System.out.println(contador);
			contador++;
		}
		//System.out.println("----------con DO WHILE----------");
		
		
		//CICLO do WHILE
		int contador2 =0;
		do{
			//System.out.println(contador2);
			contador2++;
		}while(contador2<=10);
			
		/*
		 * */
		
		//METODOS
		int numero1=33;
		int numero2=44;
		
		int resultado_suma=numero1+numero2;
		//System.out.println(resultado_suma);
		//LLAMADA FUNCIONES
		int respuesta_funcion=sumarFuncion(numero1,numero2);
		System.out.println(respuesta_funcion);
		System.out.println("----- con procedimiento------");
		//LLAMADA PROCEDIMIENTO
		sumarProcedimiento(numero1,numero2);
	}
	
	/*
	 * FUNCIONES
	 * 
	 * */
	//FUNCION SUMAR
	static int sumarFuncion(int num1,int num2) {
		
		int resultado=num1+num2;
		
		return resultado;
	}
	
	
	/*PROCEDIMIENTO
	 * 
	 * */
	
	//PROCEDIMIENTO SUMAR
	
	static void sumarProcedimiento(int num1, int num2) {
		
		int resultado=num1+num2;
		System.out.println(resultado);
		
	}

}
