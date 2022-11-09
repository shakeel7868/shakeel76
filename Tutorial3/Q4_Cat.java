package Tutorial3;

public class Q4_Cat {
    private String colour;
    public Q4_Cat(String color){
        this.colour = color;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public Q4_Cat create(){
        Q4_Cat c = new Q4_Cat("Brown");
        System.out.println("\nInside Cat.create(), address of created " +
                " cat object c is " + c);
        return c;
    }
}
