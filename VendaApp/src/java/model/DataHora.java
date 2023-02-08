package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHora {
    final private static Date date = new Date();
    
    public static String dataAtual() {
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        return formatData.format(date);
    }
    
    public static String horaAtual() {
        SimpleDateFormat formatData = new SimpleDateFormat("HH:mm:ss");
        return formatData.format(date);
    }
}
