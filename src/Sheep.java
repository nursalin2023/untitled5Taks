public class Sheep  extends  DomesticAnimal{
    private String nickName;
    public Sheep (){}

    public Sheep(int weinht, int age, String gender, String nickName) {
        super(weinht, age, gender);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Sheep: " + "\n"+
                "nickName: " + nickName + "\n" +
                super.toString();
    }
}
