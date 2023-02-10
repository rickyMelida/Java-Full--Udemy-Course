public class MetodosString {
    private String MyString;

    public MetodosString(String MyString) {
        this.MyString = MyString;
    }

    public void Metodos() {
        System.out.println("nombre.length(): " + this.MyString.length());
        System.out.println("nombre.toUpperCase: " + this.MyString.toUpperCase());
        System.out.println("nombre.toLowerCase: " + this.MyString.toLowerCase());
        System.out.println("nombre.equals(): " + this.MyString.equals("Ricardo"));
        System.out.println("nombre.equalsIgnoreCase: " + this.MyString.equalsIgnoreCase("ricardo"));
        System.out.println("nombre.compareTo: " + this.MyString.compareTo("Ric"));
        System.out.println("nombre.charAt: " + this.MyString.charAt(4));
        System.out.println("nombre.substring: " + this.MyString.substring(2, 4));

        System.out.println("nombre.replace: " + this.MyString.replace("DO", "DE"));
        System.out.println("nombre.indexOf: " + this.MyString.indexOf("A"));
        System.out.println("nombre.lastIndexOf: " + this.MyString.lastIndexOf("A"));
        System.out.println("nombre.contains: " + this.MyString.contains("Z"));

        System.out.println("nombre.startWith: " + this.MyString.startsWith("P"));
        System.out.println("nombre.endWith: " + this.MyString.endsWith("O"));

        System.out.println(" nombre.startWith: ".trim());

    }

    public String GetExtension(String name) {
        int i = name.lastIndexOf(".");

        String result = name.substring(i+1);

        return result;
    }
}
