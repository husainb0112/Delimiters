import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[] tokens = {"(", "x + y", ")", " * 5"};
        Delimeters d = new Delimeters("(", ")");
        System.out.println(d.getDelimetersList(tokens));

        String open = "<sup>";
        String close = "</sup>";
        d = new Delimeters(open, close);
        System.out.println(d.getDelimetersList(tokens));
        ArrayList<String> delimeters = new ArrayList<String>(); 
        String[] delims = {open, open, close, open, close, close};
        for (String s : delims) delimeters.add(s);
        System.out.println(d.isBalanced(delimeters));
    }
}
