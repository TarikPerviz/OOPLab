package People;

public class Main2 {
    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki",1);
        System.out.println(olli);
        System.out.println("Credits " + olli.credits());
        olli.study();
        System.out.println("Credits " + olli.credits());
    }
}
