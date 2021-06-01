package Lab9.b;

import Dependencies.RandomDate;

public class lab9b {
    public static void main(String[] args) {
        String[] messages = RandomDate.getFaker().lorem().fixedString(100).split("[.;!?]");
        for (int i = 0; i < messages.length - 1; i++) {
            for (int j = i + 1; j < messages.length; j++) {
                if (messages[i].split(" ").length > messages[j].split(" ").length) {
                    String tmp = messages[i];
                    messages[i] = messages[j];
                    messages[j] = tmp;
                }
            }
        }
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i] + "\t Count symbols " + messages[i].length());
        }
    }

}
