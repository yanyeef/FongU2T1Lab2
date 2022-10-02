public class ChatBoxRunner {
    public static void main(String[] args)
    {
        ChatBot debbie = new ChatBot("debbie", 5);
        debbie.greeting("Yan Yee");
        int sum = debbie.addNumbers(1, 2, 3);
        System.out.println("The sum of your number is " + sum);
        double meters = debbie.convertFeetToMeters(10);
        System.out.println("10 feet = " + meters + " meters");
        debbie.favoriteNumber(2);
        debbie.year();
        String subject = debbie.subject("Computer Science");
        System.out.println(subject);
        debbie.weather();
        String message = debbie.goodbye();
        System.out.println(message);

    }
}
