import java.util.Scanner;

public class Q04_FindTheWordWithTheMostConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int start = 0;
        String word = "";
        int maxConsonants = 0;

        
        for(int i = 0; i<=str.length(); i++){
            
            if(i==str.length() || str.charAt(i)==' '){
                int count = 0; 

                
                for(int j = i-1; j>=start; j--){
                    if(Character.isLetter(str.charAt(j)) && str.charAt(j)!='a'&&str.charAt(j)!='e'&&str.charAt(j)!='i'&&str.charAt(j)!='o'&&str.charAt(j)!='u'&&str.charAt(j)!='A'&&str.charAt(j)!='E'&&str.charAt(j)!='I'&&str.charAt(j)!='O'&&str.charAt(j)!='U'){
                        count++;
                    }
                }
                if(count>maxConsonants){
                    maxConsonants = count;
                    word = str.substring(start,i);
                }
                start = i + 1;
            }
        }
        System.out.println("Highest number of Consonants = " + maxConsonants);
        System.out.println("Word With the Most Consonants = " + word);

        sc.close();
    }
}
//Output
// Enter String = java programming code
// Highest number of Consonents = 8
// Word With the Most Consonents = programming