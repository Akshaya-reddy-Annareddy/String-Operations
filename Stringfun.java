public class Stringfun {
    public static void main(String[] args) {
        String str = "Akshaya";
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("String length: "+str.length());
        String newstr = str.replace('h','R');
        System.out.println(newstr);
        String substr = str.substring(2, 5);
        System.out.println("Sub string: "+substr);

    }
}




