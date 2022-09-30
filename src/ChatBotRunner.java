public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot bot = new ChatBot("Kei", 69);
        bot.greeting("Felix");
        bot.weather();
        double snow = bot.convertFeetToMeters(1);
        System.out.println("I heard there will be " + snow + " meters of snow tomorrow.");
        bot.favoriteNumber(6);
        System.out.println("My favorite number, your favorite number, and the meters of snow tomorrow combined is " + bot.addNumbers(69,6,(int) snow));
        System.out.println("Wow you are " + bot.tall(6) + " feet tall." + "\n" + "Amazing!");
        bot.end();
        System.out.println(bot.goodbye());
    }
}
