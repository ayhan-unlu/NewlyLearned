package _2025_09_06_DesignPattern._2025_09_11_04_Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Poly means many morphism means form
//        Polymorphism many forms
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl uIControl) {
        uIControl.draw();
    }
}
