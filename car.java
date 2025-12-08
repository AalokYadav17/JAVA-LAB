class car{
    static class Cars {
        void drive() {
            System.err.println("The car is being driven");
        }
    }
    public static void main(String[] args) {
        Cars newCar = new Cars();
        newCar.drive();
    }
}

