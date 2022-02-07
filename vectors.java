package vectorNumbers_git;

import java.util.Arrays;
import java.util.Scanner;

public class vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vectors");
		
		
		int j = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introdueix la cuantitat d'Arrays a imprimir: ");
		int numArr = sc.nextInt();
		int finalArr[] = new int[numArr];
		
		while(j < numArr) {
			System.out.print("Introdueix la cuantitat de números a escriure: ");
			int numQuant = sc.nextInt();
			int arr[] = new int[numQuant];
			finalArr[j] = 0;
			int i = 0;
			while(i < numQuant) {
				num = sc.nextInt();
				arr[i] = num;
				i++;
			}
			
			
			if (Arrays.toString(arr).equals(arr)) {
				System.out.println("No ha fet falta ordenar, ja hi eren ordenats");
			}
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
			int elem = Integer.MIN_VALUE, max_count=1, count=1;
			
			if (arr.length == 1) {
            	elem = arr[0];
            }
			for(int x=1; x<arr.length; x++){
	            //count the successive elements as long as they are same
	            if(arr[x] == arr[x-1])
	                count++;
	                
	            if(arr[x] != arr[x-1] || x==arr.length-1) {
	                //compare the count with max_count
	                if (count > max_count){
	                    
	                    //update if count is greater
	                    max_count = count;

	                    elem = arr[x-1];
	                    
	                    
	                } 
	                //reset count to 1
	                count =1;
	            }
	            
	        }
			
			finalArr[j] = elem;
			j++;
		}
		
		System.out.println("Resultat:");
		
		for (int i = 0; i<finalArr.length; i++) {
			System.out.println(finalArr[i]);   
		}
		
		Result(Arrays.toString(finalArr));
		 
	}
	
	public static String Result(String res) {
		return res;	
	}
}

class VectorConstr {
	public static void main(String[] args) {
		vectors vector = new vectors() ; 
	}
	
	public static void mains(String[] args) {
		
	}
}
