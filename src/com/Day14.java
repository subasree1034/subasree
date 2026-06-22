public class  Day14 {
    static class Employee {
        String name;
        String gender;
        int age;
        Employee(Builder builder){
            this.name = name;
            this.gender = gender;
            this.age = age;
        }
        static class Builder {
            private String name;
            private String gender;
            private int age;
            public builder name(String namevalue){
                this.name = namevalue
                        return this;
            }
            public builder gender(String gendervalue){
                this.gender = gendervalue
                        return this;
            }
            public builder age(String agevalue){
                thiS.age = agevalue
                        return this;
            }
        }
        static void main() {
            Employee employee = new Employee.Builder()
                    .name("subasree")
                    .gender("female")
                    .age("18")
            System.out.println(employee.name);
        }
    }
}