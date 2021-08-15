public class ByteArray {

    /**
     *  Retorna o array de bytes formatado em decimal, separado por espaço em brancom a partir da posição inicial solicitada, na quantidade informada.
     *  @param b
     *      Array de bytes a ser formatado
     *
     * @param offset
     *          Posição inicial para iniciar a contar para o retorno
     *
     * @param tam
     *      Número de bytes a ser formatado
     * @return Retorna o array de bytes formatado em decimal
     *
     */

    public static String byteToDec(final byte[] b, final int offset, final int tam) {
        return byteToDec(b, offset, tam, " ", 3);
    }

    /**
     * Retorna o array de bytes formatado em decimal, separado por espaço em branco, a partir da posição solicitada, na quantidade informada.Offset = 0
     *
     *  @param b
     *      Array de bytes a ser formatado
     * @param tam
     *          Número de bytes a ser formatado
     *
     * @return Retorna o array de bytes formatado em decimal
     */
    public static String byteToDec(final byte[] b, final int tam) {
        return byteToDec(b, 0, tam, "", 3);
    }

    /**
     * Retorna o array de bytes formatado em decimal, separado pelo valor escolhido, a partir da posição inicial solicitada, na quantidade informada.
     *
     * @param b
     *          Array de bytes a ser formatado
     * @param offset
     *          Posição inicial para iniciar a contar para o retorno
     * @param tam
     *          Número de bytes a ser formatado
     * @param separador
     *          Separador para a formatação do texto
     * @param printSize
     *          Quantidade de caracteres que um byte deve possuir
     * @return Retorna o array de bytes formatado em decimal
     */

    public static String byteToDec(final byte[] b, final int offset, final int tam, final String separador, final int printSize) {
        boolean first = true;
        final StringBuffer ret = new StringBuffer();
        String aux = "";

        for (int i = offset; i < (offset + tam); i++) {
            aux = "" + (b[i] & 0x0FF);

            if (aux.length() < printSize) {
                aux = "0" + aux;
            }

            if (aux.length() < printSize) {
                aux = "0" + aux;
            }

            if (first) {
                first = false;
            } else {
                ret.append(separador);
            }

            ret.append(aux);
        }

        return ret.toString();
    }
}
