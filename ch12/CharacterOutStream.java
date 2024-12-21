package ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterOutStream {
    public static void main(String[] args) throws IOException {
        char Character;

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in, System.console().charset())
        );

        System.out.println("Enter characters, 'q' to quit.");
        do {
            Character = (char) br.read();
            System.out.println(Character);
        } while(Character != 'q');
    }
}
