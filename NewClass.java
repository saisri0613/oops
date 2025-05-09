//strig is array of Characters

public class NewClass {
    public static void main(String[] args) {
      String s1 =new String("Parul");
      String s2 ="University";
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1.length());
      System.out.println(s1.charAt(3));
      System.out.println(s1.substring(1,3));
      System.out.println(s1.compareTo(s2));
      System.out.println(s1.toUpperCase());
      System.out.println(s2.toLowerCase());
      System.out.println(s1.trim());
      System.out.println(s1.indexOf('u'));
      System.out.println(s1.replace('a','e'));
      System.out.println(s1.contains("ar"));
  }
}