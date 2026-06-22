/*public class day14 {
    static class Student {
        String name;
        int age;
        int regno;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regno = builder.regno;
        }

        static class Builder {
            private String name;
            private int age;
            private int regno;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }

            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }

            public Builder regNo(int regNoValue) {
                this.regno = regNoValue;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("subasree")
                .age(18)
                .regNo(2528)
                .build();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.regno);
    }
}
*/

public class Day14_Factory {
    interface Notification {
        void send(String to, String message);
    }

    class EmailNotification implements Notification{

        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: "+message +", to "+to);
        }
    }
    class WhatsappNotification implements Notification{

        @Override
        public void send(String to, String message) {
            System.out.println("Sending Whatsapp: "+message +", to "+to);
        }
    }

    static Notification getNotification(Day14_Factory factory, String type){
        return switch (type){
            case "Email"-> factory.new EmailNotification();
            case "Whatsapp"-> factory.new WhatsappNotification();
            default -> throw new IllegalArgumentException("Invalid notification type: "+type);
        };
    }

    static void main() {
        Day14_Factory factory = new Day14_Factory();

        String type = "Whatsapp";
        getNotification(factory, type).send("56784","Hello World");
    }
}