package Lection2;

import java.io.IOException;
import java.util.logging.*;


public class Lection2 {
    public static void main(String[] args) throws IOException {

            Logger logger = Logger.getLogger(Lection2.class.getName());
            logger.setLevel(Level.INFO);
            //ConsoleHandler ch = new ConsoleHandler();
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            //SimpleFormatter sFormat = new SimpleFormatter();
            XMLFormatter xml = new XMLFormatter();
            //ch.setFormatter(sFormat);
            fh.setFormatter(xml);
            logger.log(Level.WARNING, "Тестовое логирование");
            logger.info("Тестовое логиров");
    }
}
