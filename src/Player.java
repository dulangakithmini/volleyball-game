public class Player {
    private String name;
//    private boolean ball;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void passBall(){
//        this.ball = false;
//    }

    public void receiveBall(String name){
//        this.ball = true;
        System.out.println(name + " receieved the ball and passed.");
    }
}
