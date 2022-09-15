import java.util.Scanner;
public class Ex2 {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		String x;

        System.out.println("Digite uma palavra ou frase: ");
		x = sc.nextLine();
        System.out.print("Inicias: " + (x.toUpperCase()).charAt(0));
        for (int i = 0; i < x.length(); i++){
            boolean validador = true;
            if ((x.charAt(i)) == ' '){
                if (i + 2 < x.length()){
                    if (x.charAt(i + 2) == ' '){
                        if ((x.substring(i + 1, i + 2)).equalsIgnoreCase("E")){
                            validador = false;
                        }
                    }
                }
                if (i + 2 < x.length()){
                    if (x.charAt(i + 3) == ' '){
                        if ((x.substring(i + 1, i + 3)).equalsIgnoreCase("DO") || (x.substring(i + 1, i + 3)).equalsIgnoreCase("DA") || (x.substring(i + 1, i + 3)).equalsIgnoreCase("DE") || (x.substring(i + 1, i + 3)).equalsIgnoreCase("DI") || (x.substring(i + 1, i + 3)).equalsIgnoreCase("DU")){
                            validador = false;
                        }
                    }
                }    
                if (i + 3 < x.length()){
                    if (x.charAt(i + 4) == ' '){
                        if ((x.substring(i + 1, i + 4)).equalsIgnoreCase("DOS") || (x.substring(i + 1, i + 4)).equalsIgnoreCase("DAS")){
                            validador = false;
                        }
                    }
                }
                if (validador){
                    System.out.print((x.toUpperCase()).charAt(i + 1));
                }                 
            }
        }
	}
}