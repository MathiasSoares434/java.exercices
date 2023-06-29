package Fundamentos;

public class exercicio28 {
public static void main(String[] args) {
	int[] arrayOne = {87,68,52,5,49,83,45,12,64};
	int total = 0;
	
	for(int i : arrayOne) {
		total += i;		
	}
	System.out.print("Total de elementos arrayOne: %d\n " + total);
}
}
