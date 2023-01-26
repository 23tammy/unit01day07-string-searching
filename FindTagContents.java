import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        System.out.println("INSERT HTML:");
        Scanner scanner = new Scanner(System.in);
        String html = scanner.nextLine();

        System.out.println("INSERT TAG:");
        String tag = ( "<" + scanner.nextLine() + ">" );

        int htmli = html.indexOf(tag);

        if (htmli != -1){
            int aftertag = html.indexOf(">", htmli);
            int beforetag = html.indexOf("</", aftertag);

            System.out.print(html.substring(aftertag + 1, beforetag));
        }else{
            System.out.println("NO TAG FOUND.");
            
        }
        scanner.close();

    }
}