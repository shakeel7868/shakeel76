package Tutorial3;

public class Q7_Car {
    private String licensePlate;
    private double speed;
    private double maxSpeed;

    public Q7_Car(String licensePlate, double maxSpeed1){
        this.licensePlate = licensePlate;
        this.speed = 0.0;

        if(maxSpeed1 >= 0.0)
            maxSpeed = maxSpeed1;

        else
            maxSpeed = 0.0;
    }

    public Q7_Car(String licensePlate, double maxSpeed1, double speed1){
        this.licensePlate = licensePlate;
        if (speed1 < 0.0){
            speed = 0.0;
        }

        else{
            speed = speed1;
            if (maxSpeed1 < 0.0)
                maxSpeed = 0.0;
            else {
                if (speed > maxSpeed){
                    maxSpeed = speed;
                }
                else
                    maxSpeed = maxSpeed1;
            }
        }
    }

    public void print(){
        System.out.println("License plate : " + licensePlate +
                "\nMax Speed : " + maxSpeed + "\nSpeed : " + speed);
    };
}
