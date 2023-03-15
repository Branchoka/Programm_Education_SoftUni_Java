package Exercises06_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class E01_AdvertisementMessage {
    public static class Message{

        private Random random=new Random();
        private String[] phrasesArr={"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        private String[] eventsArr= {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        private String[] authorsArr= {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        private String[] citiesArr= {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        public String randomMessage(){
            return String.format("%s %s %s – %s.",
                    phrasesArr[random.nextInt(phrasesArr.length)],
                    eventsArr[random.nextInt(eventsArr.length)],
                    authorsArr[random.nextInt(authorsArr.length)],
                    citiesArr[random.nextInt(citiesArr.length)]);

        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Message message=new Message();

        int input=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {

            String output=message.randomMessage();
            System.out.println(output);
        }

    }
}
