package ru.netology;

public class service {
    private final int boundary = 1000;
        public int remain(int amount) {
            return boundary - amount % boundary;
        }
    }

