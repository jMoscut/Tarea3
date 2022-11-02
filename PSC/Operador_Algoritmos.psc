	Funcion re<-su(op1,op2)
		
		Definir re como Real
		
		re <- op1 + op2
FinFuncion


Funcion re<-res(op1, op2)
	
	Definir re Como Real
	
	re <- op1 - op2
	
FinFuncion

Funcion re <- mu(op1,op2)
	
	Definir re Como Real
	 
	re<- op1 * op2
	
FinFuncion

Funcion re<-div(op1,op2)
	
	Definir re Como Real
	
	re<- op1 / op2
FinFuncion



Algoritmo operador_calculadora
	
	Definir op Como Entero
	Definir re1,n1,n2 como Real
	Escribir "1.- Para Sumar";
	Escribir "2.- Para Restar";
	Escribir "3.- Para Multiplicar";
	Escribir "4.- Para Dividir";
	
	Leer op
	Escribir "Ingresa el primer numero"
	leer n1
	Escribir "Ingresa el segundo numero"
	leer n2
	
	Segun operacion Hacer
		1: re1 <- su(n1,n2)
		2: re1 <- res(n1,n2)
		3: re1 <- mu(n1,n2)
		4: re1 <- div(n1,n2)
	FinSegun
	
	Escribir "El resultado de su operacion es ", re1;
	
FinAlgoritmo
	

