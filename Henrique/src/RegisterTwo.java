import java.util.Vector;

public class RegisterTwo {

    public Vector<String[]> complexDateStructure(final byte[] registers) {

        byte[] getYearDLMS      = new byte[10];
        byte[] getDayDLMS       = new byte[10];
        byte[] getMonthDLMS     = new byte[10];
        byte[] getHourDLMS      = new byte[10];
        byte[] getMinutesDLMS   = new byte[10];
        byte[] getSecondsDLMS   = new byte[10];
        byte[] getRegStatusDLMS = new byte[10];
        byte[] getEventReleDLMS = new byte[10];

        final int registersSize = registers.length;
        int[] getIndexDateDLMS = new int[10];
        int indexDateDLMS;
        int index = 0;

        for(indexDateDLMS = 5; registersSize > indexDateDLMS; indexDateDLMS+=20) {
            if (registers[indexDateDLMS] == (byte) 0x0C) {
                getIndexDateDLMS[index] = indexDateDLMS;
                index += 1;
            }
        }

        int arrayInfoDateSize = getIndexDateDLMS.length;
        byte[] byteYearDLMS = new byte[10];
        int indexx = 6;

        for (int i = 0; registersSize > indexx; i++) {

            String firstDigit        = (Byte.toString(registers[getIndexDateDLMS[i]+1]));
            String secondDigit      = (Byte.toString(registers[getIndexDateDLMS[i]+2]));
            String joinDigits       = String.valueOf(Byte.parseByte(firstDigit) + Byte.parseByte(secondDigit));
            byteYearDLMS[i]         = Byte.parseByte(joinDigits);
            indexx += 20;
        }

        for (int i = 0; arrayInfoDateSize > i; i++) {

            getMonthDLMS[i]     = registers[(getIndexDateDLMS[i])];
            getDayDLMS[i]       = registers[(getIndexDateDLMS[i] + 1)];
            getHourDLMS[i]      = registers[(getIndexDateDLMS[i] + 3)];
            getMinutesDLMS[i]   = registers[(getIndexDateDLMS[i] + 4)];
            getSecondsDLMS[i]   = registers[(getIndexDateDLMS[i] + 5)];
            getRegStatusDLMS[i] = registers[(getIndexDateDLMS[i] + 11)];
            getEventReleDLMS[i] = registers[(getIndexDateDLMS[i] + 13)];

        }

        String[] arrayDateTime = new String[80];
        int indexxxx = 0;

        for (int i = 0; arrayDateTime.length > i; i+=8){

            arrayDateTime[i]     = ByteArray.byteToDec(getYearDLMS, indexxxx,2);
            arrayDateTime[i + 1] = ByteArray.byteToDec(getDayDLMS, indexxxx,1);
            arrayDateTime[i + 2] = ByteArray.byteToDec(getMonthDLMS, indexxxx,1);
            arrayDateTime[i + 3] = ByteArray.byteToDec(getHourDLMS, indexxxx,1);
            arrayDateTime[i + 4] = ByteArray.byteToDec(getMinutesDLMS, indexxxx,1);
            arrayDateTime[i + 5] = ByteArray.byteToDec(getSecondsDLMS, indexxxx,1);
            arrayDateTime[i + 6] = ByteArray.byteToDec(getRegStatusDLMS, indexxxx,1);
            arrayDateTime[i + 7] = ByteArray.byteToDec(getEventReleDLMS, indexxxx,1);
            indexxxx += 1;
        }

        Vector<String[]> vectorDateTime = new Vector<>();
        vectorDateTime.setSize(10);
        int indexxxxx = 0;

        for (int i = 0; arrayDateTime.length > indexxxxx; i++) {

            vectorDateTime.add(i, new String[] {

                    arrayDateTime[indexxxxx] ,
                    arrayDateTime[indexxxxx + 1],
                    arrayDateTime[indexxxxx + 2],
                    arrayDateTime[indexxxxx + 3],
                    arrayDateTime[indexxxxx + 4],
                    arrayDateTime[indexxxxx + 5],
                    arrayDateTime[indexxxxx + 6],
                    arrayDateTime[indexxxxx + 7]
            });

            indexxxxx += 8;
        }

        return vectorDateTime;
    }
}
