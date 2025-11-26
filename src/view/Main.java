package view;

import model.SingletonLogger;

public class Main {
    public static void main(String[] args) {

        SingletonLogger logger1 = SingletonLogger.getInstance();
        SingletonLogger logger2 = SingletonLogger.getInstance();

  
        System.out.println(logger1.format("Sistema iniciou."));
        System.out.println(logger2.format("Execução continuando."));

        boolean mesmaInstancia = (logger1 == logger2);
        System.out.println("Será que as duas referências são iguais? " + mesmaInstancia);
    }
}
