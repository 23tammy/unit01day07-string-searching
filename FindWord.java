import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        System.out.println("INSERT SENTENCE:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println("INSERT LETTER:");
        String letter = scanner.nextLine();

        int letteri = sentence.indexOf(letter);

        if (letteri == sentence.length()-1){
            String sentBeforeLet = sentence.substring(0, sentence.length());
            int beforeword = sentBeforeLet.lastIndexOf(" ");

            System.out.print(sentBeforeLet.substring(beforeword+1, sentence.length()));
        }
        else if(letteri != -1){
            int afterword = sentence.indexOf(" ", letteri);
            String sentBeforeLet = sentence.substring(0, afterword);
            int beforeword = sentBeforeLet.lastIndexOf(" ");

            System.out.print(sentBeforeLet.substring(beforeword+1, afterword));
        }else{
            System.out.println("NO TAG FOUND.");
            
        }
        scanner.close();
    }
}