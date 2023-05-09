public class Horse extends DomesticAnimal{
    private String nickName ;
    private String color;

    public Horse(){

    }

    public Horse(int weinht, int age, String gender, String nickName, String color) {
        super(weinht, age, gender);
        this.nickName = nickName;
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse: " +
                "nickName: " + nickName + "\n" +
                "color: " + color + "\n" +
                super.toString();
    }
}
