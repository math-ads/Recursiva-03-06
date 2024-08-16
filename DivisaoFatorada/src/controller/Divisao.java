package controller;

public class Divisao {

	public Divisao() {
		super();}
	
	public double DivFatorada(int i) {
		if(i==1) {
			
			return 1;
// o ponto de parada deve ser 1 ja que se fosse 0 retornaria 1 duas vezes, ja que 1/1=1
			
		} else {
		   
		    return (double)1/Fatorial(i) + DivFatorada(i-1);}
		// um agradecimento ao Gustavo Guimaraes que acabou com 1 hora de sofrimento
		// ja que eu nao conseguia dividir nem 1/2 que dava 0 (double) salvou
	
	}
	
	public int Fatorial(int i) {
		if(i==0) {
			return 1;
		}else {
			return i* Fatorial(i-1);
		}
	}
}
/*
o return faz a divisao e chama o fatorial e soma com as proximas chamadas da recursiva 
principal, o numero vai do digitado ate chegar a 1 e soma depois

*/