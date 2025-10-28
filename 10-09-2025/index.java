class temp{
    public String name="this is a public variable";
    protected String name2="this is a protected variable";
    private String name3="this is a private variable";
    String name4="this is a default variable";

    public String dispalyPrivate(){
        return name3;
    }
    protected void printProtected(){
        System.out.println("hiikkdkdfjkdjfkjdjf");
    }
}

public class index extends temp{
public static void main(String[] args) {
    IO.println("hello");
    temp t=new temp();
    IO.println(t.name);//public
    IO.println(t.name2);//protected
    IO.println(t.name4);//default
    IO.println(t.dispalyPrivate());//private
    IO.println(t);
    System.out.println(t);
}
}