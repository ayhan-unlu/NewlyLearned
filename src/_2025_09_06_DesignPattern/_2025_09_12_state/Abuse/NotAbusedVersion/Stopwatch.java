package _2025_09_06_DesignPattern._2025_09_12_state.Abuse.NotAbusedVersion;

public class Stopwatch {

    private boolean isRunning ;

    public void click() {
        if(isRunning){
            isRunning = false;
            System.out.println("Stopwatch is stopped");
        }else{
            isRunning = true;
            System.out.println("Stopwatch is running");
        }
    }
}
