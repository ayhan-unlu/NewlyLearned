package _2025_09_06_DesignPattern._2025_09_12_state.Abuse.AbusedVersion;

public class Stopwatch {
    private State currentState = new StoppedState(this);

    public void click(){
        currentState.click();
    }
    public State getCurrrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

}
