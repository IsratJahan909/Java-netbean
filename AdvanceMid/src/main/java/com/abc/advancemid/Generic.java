package com.abc.advancemid;

public class Generic{
static class Ball<T>{
private T  value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public Ball(T value) {
            this.value = value;
        }
        
        }

    public static void main(String[] args) {
        Ball<Integer> intBall = new Ball<>(299);
        Ball<String> strBall = new Ball<>("Type changed to string");
        System.out.println("Integer: " + intBall.getValue());
        System.out.println("Sting: " + strBall.getValue());
    }
}