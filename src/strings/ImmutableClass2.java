package strings;

//Make class as final.
//Make variables as private and final.
//No setter method.

public final class ImmutableClass2 {

  private final int id;
  private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ImmutableClass2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ImmutableClass2 a=new ImmutableClass2(1,"java");
        System.out.println(a.name=="java");

    }
}

