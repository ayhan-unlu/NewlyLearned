package _2025_09_06_DesignPattern._2025_09_11_04_Polymorphism;

public abstract class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }

    public abstract void draw();
}
