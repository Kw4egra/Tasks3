public class Main {
    public static class Person {
        String name;
        int age;
        char gender;

        public Person(String name, int age, char gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;
        }
        public void PersonInfo(){
            System.out.println("Имя - " + name + "\nвозраст - " + age + "\nПол - " + gender);
        }
        public void AddAge(int age){
            this.age += age;
        }
        public void ChangeName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Леонид",19,'М');
        person.PersonInfo();
        person.AddAge(1);
        person.PersonInfo();
        person.ChangeName("Никита");
        person.PersonInfo();
    }
}