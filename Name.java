
public class Name {
    String name;


    public Name(){
    }

    public Name (String name) {
        this.name = name;
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Name player) {
        return name.equals(player.name);
    }

    public Name(Name player) {
        name = player.name;
    }
}
