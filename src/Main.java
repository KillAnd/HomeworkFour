public class Main {
    public static void main(String[] args) {

        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        }
        int ageTwo = 17;
        if (ageTwo < 18) {
            System.out.println("Если возраст человека равен " + ageTwo + " то, он не достиг совершеннолетия " +
                    "нужно немного подождать");
        }


        int temperature = 8;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 130;
        if (speed > 60) {
            System.out.println( "Если скорость " + speed + " то, придется заплатить штраф");
        } else if ( speed == 60 ) {
            System.out.println( "Это невозможно! :D");
        } else {
            System.out.println( "Если скорость " + speed + " то, можно ездить спокойно");
        }

        int humanAge = 6;
        if ( humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if ( humanAge >= 7 && humanAge <= 17 ) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if ( humanAge >= 18 && humanAge <= 24 ) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет");
        } else if ( humanAge > 24 ){
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу");
        }

    }
}