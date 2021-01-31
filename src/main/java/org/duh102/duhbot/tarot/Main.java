package org.duh102.duhbot.tarot;

import org.duh102.duhbot.tarot.action.Action;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Action action = new Action();
        System.out.println(action.performAction(".tarot " + Arrays.stream(args).collect(Collectors.joining(" "))));
    }
}
