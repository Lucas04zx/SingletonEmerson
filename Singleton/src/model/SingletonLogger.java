package model;

public class SingletonLogger {

    private static SingletonLogger instance;

    private SingletonLogger() {
    }

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }
    
    public String format(String mensagem) {
        return "[LOG] " + mensagem;
    }
}
