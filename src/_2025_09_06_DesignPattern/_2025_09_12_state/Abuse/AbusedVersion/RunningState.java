package _2025_09_06_DesignPattern._2025_09_12_state.Abuse.AbusedVersion;

public class RunningState implements State {
    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopwatch is stopped");

    }
}
