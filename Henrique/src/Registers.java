import java.util.Vector;

public class Registers {

    public String[] complexDateStruct(final byte[] registers) {

        final int complexArrayLength = registers.length;
        final int complexArrayStandardSize = 22;
        final byte complexArrayStandardInfoDate = (byte) 0x0C;
        String[] complexArray;
        int[] getInfoDateDLMS = new int[0];
        int indexInfoDateDLMS;
        int index = 0;

        String getYearDLMS = null;
        String getDayDLMS = null;
        String getMonthDLMS = null;
        String getHourDLMS = null;
        String getMinutesDLMS = null;
        String getSecondsDLMS = null;
        String getRegStatusDLMS = null;
        String getEventReleDLMS = null;

        final Vector eventZeus = new Vector();

        for(indexInfoDateDLMS = 0; complexArrayLength > indexInfoDateDLMS; indexInfoDateDLMS++) {
            if ((registers[indexInfoDateDLMS] == (byte) 0x0C) && (registers[indexInfoDateDLMS + 10] == (byte) 0x80)) {
                getInfoDateDLMS[index] = indexInfoDateDLMS;
                index++;
            }
        }

        for (index = 0; getInfoDateDLMS.length > index; index++) {

            // TODO Transformar em um array de bytes completo, antes de usar o ByteArray
            getYearDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 1] + registers[indexInfoDateDLMS + 2]),4);
            getDayDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 3]),2);
            getMonthDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 4]),2);
            getHourDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 6]),2);
            getMinutesDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 7]),2);
            getSecondsDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 8]),2);
            getRegStatusDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 14]),2);
            getEventReleDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 16]),2);
        }

        complexArray = new String[] {
                ((getYearDLMS + "/" + getDayDLMS + "/" + getMonthDLMS + "/" + "" +
                        getHourDLMS + ":" + getMinutesDLMS + ":" + getSecondsDLMS)),
                getRegStatusDLMS, getEventReleDLMS };

        return complexArray;
    }
}

