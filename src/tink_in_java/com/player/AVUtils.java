package com.player;

public class AVUtils {
    private static IPlayerProvider playerProvider;

    private static String playerName = "";

    public static void setPlayerProvider(IPlayerProvider provider) {
        playerProvider = provider;
    }

    public static void setPlayer(IPlayerProvider provider) {
        playerProvider = provider;
    }
}
