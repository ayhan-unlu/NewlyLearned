package _2025_09_06_DesignPattern._2025_09_12_state.Abuse.AbusedVersion;

public class StoppedState implements State {

    private Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Stopwach is running");

    }
}
