

public class Registers {

    public String[] complexDateStruct(final byte[] registers) {

        final int complexArrayLength = registers.length;
//        final int complexArrayStandardSize = 22;
//        final byte complexArrayStandardInfoDate = (byte) 0x0C;
//        String[] complexArray;
        int[] getInfoDateDLMS = new int[100];
        int indexInfoDateDLMS;
        int index = 0;

        byte[] getYearDLMS = new byte[10];
        byte[] getDayDLMS = new byte[10];
        byte[] getMonthDLMS  = new byte[10];
        byte[] getHourDLMS = new byte[10];
        byte[] getMinutesDLMS = new byte[10];
        byte[] getSecondsDLMS = new byte[10];
        byte[] getRegStatusDLMS = new byte[10];
        byte[] getEventReleDLMS = new byte[10];

//        final Vector eventZeus = new Vector();

        for(indexInfoDateDLMS = 0; complexArrayLength > indexInfoDateDLMS; indexInfoDateDLMS++) {
            if ((registers[indexInfoDateDLMS] == (byte) 0x0C) && (registers[indexInfoDateDLMS + 10] == (byte) 0x80)) {
                getInfoDateDLMS[index] = indexInfoDateDLMS;
                index  = index + 1;
            }
        }

        final int infoDateLength = getInfoDateDLMS.length;

        for (int i = 0; infoDateLength > i; i++) {

            String firstDigit = String.valueOf(getInfoDateDLMS[i + 1]);
            String secondDigit = String.valueOf(getInfoDateDLMS[i + 2]);
            String joinDigits = firstDigit.concat(secondDigit);
            byte[] byteYearDLMS;
            byteYearDLMS = joinDigits.getBytes();
            getYearDLMS[i] = byteYearDLMS;
        }

        int indexx = 0;

       for (int i = 0; infoDateLength > i; i++) {

           getDayDLMS[i] = registers[(getInfoDateDLMS[index] + 3)];
           getMonthDLMS[i] = (registers[(getInfoDateDLMS[index] + 4)]);
           getHourDLMS[i] = (registers[(getInfoDateDLMS[index] + 6)]);
           getMinutesDLMS[i] = (registers[(getInfoDateDLMS[index] + 7)]);
           getSecondsDLMS[i] = (registers[(getInfoDateDLMS[index] + 8)]);
           getRegStatusDLMS[i] = (registers[(getInfoDateDLMS[index] + 14)]);
           getEventReleDLMS[i] = (registers[(getInfoDateDLMS[index] + 16)]);
           indexx = indexx + 1;
       }
            // TODO Transformar em um array de bytes completo, antes de usar o ByteArray

//            byte[] arrayDateTime = new byte [8];

        String[] arrayDateTime = new String[100];

       for (int i = 0; i < getInfoDateDLMS.length; i++){
           arrayDateTime[i] = ByteArray.byteToDec(getYearDLMS, i,1);
           arrayDateTime[i + 1] = ByteArray.byteToDec(getDayDLMS, i,1);
           arrayDateTime[i + 2] = ByteArray.byteToDec(getMonthDLMS, i,1);
           arrayDateTime[i + 3] = ByteArray.byteToDec(getHourDLMS, i,1);
           arrayDateTime[i + 4] = ByteArray.byteToDec(getMinutesDLMS, i,1);
           arrayDateTime[i + 5] = ByteArray.byteToDec(getSecondsDLMS, i,1);
           arrayDateTime[i + 6] = ByteArray.byteToDec(getRegStatusDLMS, i,1);
           arrayDateTime[i + 7] = ByteArray.byteToDec(getEventReleDLMS, i,1);
       }
//            getYearDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 1] + registers[indexInfoDateDLMS + 2]),4);
//            getDayDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 3]),2);
//            getMonthDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 4]),2);
//            getHourDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 6]),2);
//            getMinutesDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 7]),2);
//            getSecondsDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 8]),2);
//            getRegStatusDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 14]),2);
//            getEventReleDLMS = ByteArray.byteToDec((byte) (registers[indexInfoDateDLMS + 16]),2);
//
        return arrayDateTime;
    }
}

