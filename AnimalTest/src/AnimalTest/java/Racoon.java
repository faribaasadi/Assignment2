package AnimalTest.java;

    class Racoon extends Animals implements Domesticated2 {


        Racoon(String typeOfanimal, String name, int age, String gender, String enviroment) {
            super(typeOfanimal, name, age, gender, enviroment);
        }

        @Override
        public void move() {
            System.out.println("Racoon moves fast!");
        }

        @Override
        public void sound() {
            System.out.print("Racoon sound are mewing, crying");
        }

        @Override
        public void eat() {
            System.out.println("Racoons eat vegetables\n");
        }

        @Override
        public void sleep() {
            System.out.print("Racoons are nocturnal and sleep during the day");
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public void scratch() {
            System.out.println("Racoon Scratch!");
        }

    }


