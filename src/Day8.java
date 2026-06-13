/*public class Day8{
    record CourseRecord(String name, String dept) {

    }

    void main() {
        CourseRecord courserecord = new CourseRecord("java programming", "artificial intelligence");
        System.out.println(courserecord.name());
        System.out.println(courserecord.dept());

    }
}
*/
public class Day8 {
    enum LANGUAGE {
        EN("English"),
        GN("German"),
        JP("Japanese"),
        TN("Tamil");


        String description;

        LANGUAGE(String description) {
            this.description = description;
        }
    }

    static void main() {
        System.out.println(LANGUAGE.EN.description);
        System.out.println(LANGUAGE.GN.description);
        System.out.println(LANGUAGE.JP.description);
        System.out.println(LANGUAGE.TN.description);
    }
}

