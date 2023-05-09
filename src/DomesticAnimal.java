public abstract class DomesticAnimal {
    private int weinht;
    private int age;
    private  String gender;

    public DomesticAnimal() {
    }

    public DomesticAnimal(int weinht, int age, String gender) {
        this.weinht = weinht;
        this.age = age;
        this.gender = gender;
    }

    public int getWeinht() {
        return weinht;
    }

    public void setWeinht(int weinht) {
        this.weinht = weinht;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "weinht: " + weinht +"\n"+
                "age: " + age + "\n"+
                "gender: " + gender + "\n" ;
    }
}
