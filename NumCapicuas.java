package com.mycompany.numcapicuas;

/**
 *
 * @author Brandon Hernnadez Moreno
 * email: beu7www@gmail.com
 */
import java.util.Scanner;
public class NumCapicuas {

	int nume, noNum, NumInv, rest;
	
	public void numerosCapicuas() {	
	
	Scanner num=new Scanner(System.in);
		
            System.out.println("Ingrese un número positivo: ");
            nume=num.nextInt();
		
		noNum=nume;
		NumInv=0;
		rest=0;
		
		while(noNum!=0) {
       
                rest=noNum%10;
                NumInv=NumInv*10+rest;
                noNum=noNum/10;
		}
		
	    if(NumInv==nume){	
                System.out.println("\n El numero es capicua\n");
            }else{
                System.out.println("\n El numero no es capicua\n");
		}
}
	public static void main(String args []) {
		NumCapicuas capicua=new NumCapicuas();
		capicua.numerosCapicuas();
	}
}