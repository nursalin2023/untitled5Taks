public class Cow extends DomesticAnimal{
    private String nickName ;
    public  Cow (){

    }

    public Cow(int weinht, int age, String gender, String nickName) {
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
        return "Cow:" +"\n"+
                "nickName: " + nickName + "\n" +
                super.toString();
    }
}
