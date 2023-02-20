public class Viewer{
    private String Name;
    private int Money;

    public Viewer(String Name, int Money) {
        this.Name = Name;
        this.Money = Money;
    }
    public String getName(){
        return Name;
    }
    public int getMoney(){
        return Money;
    }
    public void setMoney(int newMoney){
        this.Money = newMoney;
    }
    public String toString(){
        return "Viewer [Name=" + Name + ", Money=" + Money + "]";
    }
}