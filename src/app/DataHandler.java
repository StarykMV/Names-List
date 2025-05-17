package app;

import java.util.List;

public class DataHandler {

    // Метод формує виведення імені за певним індексом
    public String formOutput(List<String> list, int index) {
        try {
            String name = list.get(index);
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }

    // Метод формує виведення нумерованого списку імен
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNames:\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%d) %s%n", i + 1, list.get(i)));
        }
        return sb.toString();
    }
}
