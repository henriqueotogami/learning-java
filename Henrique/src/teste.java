import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

/**
 *  Classe de testes
 * @author henriquematheusalvespereira
 * @since 16-09-2021
 *
 */

public class teste {

    public static void main(String[] args) {

        // Site de conversão: https://www.vercalendario.info/pt/come/converter-timestamp-data.html

        // 16092021142125 = 16-09-2021T14:21:25
        long convertDate = convertDateStringToSeconds("16092021142125");

        System.out.println("Data convertida em segundos: " + convertDate);
        // Data convertida em segundos: 1631812885

        Calendar dateTime = Calendar.getInstance();

        // Fazendo cast para o tipo long -> 1631812885 -> 1631812885L
        // Multiplica-se por 1000 para transformar em segundos
        dateTime.setTimeInMillis(1632143535000L);

        final int day = Integer.parseInt(String.valueOf(dateTime.get(Calendar.DAY_OF_MONTH)), 10);

        // Para extrair o mês, somamos 1 porque o valor inicial padrão do MONTH no Calendar é 0
        final int month = Integer.parseInt(String.valueOf(dateTime.get(Calendar.MONTH)), 10) + 1;
        final int year = Integer.parseInt(String.valueOf(dateTime.get(Calendar.YEAR)), 10);

        System.out.println("dia: " + day + " | mês: " + month + " | year: " + year);

        dateTime.set(Calendar.DAY_OF_MONTH, day);
        dateTime.set(Calendar.MONTH, month);
        dateTime.set(Calendar.YEAR, year);

        final int hour = Integer.parseInt(String.valueOf(dateTime.get(Calendar.HOUR_OF_DAY)));
        final int minutes = Integer.parseInt(String.valueOf(dateTime.get(Calendar.MINUTE)));
        final int seconds = Integer.parseInt(String.valueOf(dateTime.get(Calendar.SECOND)));

        // Estou printando do jeito que está previsto armazenar no array de bytes da Data
        System.out.println("------------------------------------------");
        System.out.println("Day-Of-Month (byte) = " + ((byte) dateTime.get(Calendar.DAY_OF_MONTH)));
        System.out.println("Month (byte) = " + ((byte) dateTime.get(Calendar.MONTH)));
        System.out.println("Year (byte) = " + (Byte.parseByte(String.valueOf(dateTime.get(Calendar.YEAR) - 2000))));
        System.out.println("Day-Of-The-Week (byte) = " + ((byte) dateTime.get(Calendar.DAY_OF_WEEK)));

        System.out.println("Hour_Of_The_Day (byte) = " + ((byte) dateTime.get(Calendar.HOUR_OF_DAY)));
        System.out.println("Minutes (byte) = " + ((byte) dateTime.get(Calendar.MINUTE)));
        System.out.println("Seconds (byte) = " + ((byte) dateTime.get(Calendar.SECOND)));
        System.out.println("------------------------------------------");

        // Verificação do Timestamp local - Início ----------------------------------------------------
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(timestamp.getTime());

        System.out.println("Timestamp local: " + timestamp);
        System.out.println("Timestamp.getTime: " + timestamp.getTime());

        final Calendar now = GregorianCalendar.getInstance();
        final int dayNumber = now.get(Calendar.DAY_OF_MONTH);

        System.out.println("Dia informado pelo sistema:" + dayNumber);
        // Verificação do Timestamp local - Fim ----------------------------------------------------

    }

    public static long convertDateStringToSeconds(final String dateStr) {

        final Calendar date = Calendar.getInstance();

        final int day = Integer.parseInt(dateStr.substring(0,2));
        final int month = Integer.parseInt(dateStr.substring(2,4)) - 1;
        final int year = Integer.parseInt(dateStr.substring(4,8));
        final int hour = Integer.parseInt(dateStr.substring(8,10));
        final int minute = Integer.parseInt(dateStr.substring(10,12));
        final int second = Integer.parseInt(dateStr.substring(12,14));

        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MONTH, month);
        date.set(Calendar.YEAR, year);
        date.set(Calendar.HOUR_OF_DAY, hour);
        date.set(Calendar.MINUTE, minute);
        date.set(Calendar.SECOND, second);

        return (date.getTime().getTime() / 1000);

    }
}
