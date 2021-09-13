import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;*;

import javax.security.auth.login.LoginException;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;

public class DiscordBot {

    public static void main(String[] args) throws LoginException {

        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String tokenReader = "423100622ba961f03d7ce443aec228a83f46f839baf3eee1d17f9746598d6c35";

//        try {
//            String filePath = "/Users/henriquematheusalvespereira/GitHub/learning-java/Henrique/DiscordBot.txt";
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//            String lineRead = "";
//
//            while((lineRead = bufferedReader.readLine()) != null) {
//                tokenReader += lineRead;
//            }
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        }

//        System.out.println(tokenReader);

        builder.setToken(tokenReader);
        builder.buildAsync();
    }
}
