package ru.job4j.di;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);

        ui.add(ui.askStr("Petr Arsentev"));
        ui.print();
    }
}
