class car{
    int speed;
    String Carname;
    void drive (){
        System.out.println("My car is being driven by someone");
    }
    class main{
        public static void main(String []args){
            car Mycar= new car();
            Mycar.speed=80;
            Mycar.Carname = "G-Wagon";
        }
    }
}