import java.io.*;

class Main {
    // Method used for Methods Program
    private static void WelcomeForMethodsProgram() {
        System.out.println("Welcome!");
    }

    //Password Program from Sololearn using do while looping
    public static void PasswordProgram() {
        int password;

        do {
            System.out.print("Write password : ");
            password = Integer.parseInt(System.console().readLine());
        }
        while (password != 242007);
    }   

    // Methods Program from Sololearn this function is similar like the other methods in other programming language
    public static void MethodsProgram() throws IOException{
        System.out.print("Input your number list: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int NumberOfPeople = Integer.parseInt(reader.readLine());

        for (int loop = 0; loop < NumberOfPeople; loop++) {
            WelcomeForMethodsProgram();
        }

    }
   
    //Days Program from sololearn using switch case
    public static void DaysProgram() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What day now ? : ");
        int day = Integer.parseInt(reader.readLine());

        String DayType = switch(day) {
            case 1, 2, 3, 4, 5 -> "School day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(DayType);
    }

    //Emotion Program from Sololearn using for loop and switch case
    public static void EmotionProgram() {
        String [] EmotionList = {"Happy", "Sad", "Surprised", "Angry"};

        for (int loop = 0; loop < 4; loop ++) {
            System.out.println("[" + loop + "] " +  EmotionList);
        }
        int emotion = Integer.parseInt(System.console().readLine());

        switch (emotion) {
            case 1 : 
            System.out.println("Happy!");
            break;
            case 2 : 
            System.out.println("Sad!");
            break;
            case 3 : 
            System.out.println("Angry!");
            break;
            case 4 : 
            System.out.println("Surprised!");
            break;
            default : 
            System.out.println("Unknown emotion.");
            break;
        }
    }

    //Discount Program from Sololearn 3 times using for looping
    public static void DiscountProgram() {
        System.out.print("Enter the value : ");
		int amount = Integer.parseInt(System.console().readLine());

        for (int x = 0; x < 3; x++){
            amount = amount * 90/100;
        }
        System.out.println("Your final value is : " + amount);
    }

    //Result Game Program from sololearn between tom and bob
    public static void ResultGameProgram() {
        //taking initial score
        System.out.print("Initial score : ");
       int InitialScore = Integer.parseInt(System.console().readLine());
       int ScoreTom = InitialScore;
       int ScoreBob = InitialScore;
       
       System.out.println("Round 1 results:");
       //fix
       System.out.println(ScoreTom+1);
       System.out.println(ScoreBob-1);
    }

    //Reversing Text Program from youtube using for loop and converting it to char variables
    public static void ReversingTextProgram() throws IOException{
        //Take the text
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your text here : ");
        String text = reader.readLine();
        String reversing = "";
        //Counting total chara or convert it to char
        int lenght = text.length();

        //Reversing char
        for (int x = lenght - 1; x >= 0; x--) {
            reversing+= text.charAt(x);
        }
        //Result
        System.out.println("Revered text : " + reversing);
    }

    //Pyramid Program using for loop
    public static void PyramidProgram() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input ur chara of pyramid : ");
        String chr = reader.readLine();
        System.out.print("Input ur rows of pyramid : ");
        int row = Integer.parseInt(reader.readLine());

        for (int x = row; x > 0; x--) {
            for (int y = 0; y < x ; y++) {
                System.out.print(chr);
            }
        System.out.println();
        }
    }

    //Summing Array Program using for loop and array from Sololearn
    public static void SummingArray() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value : ");
        int length = Integer.parseInt(reader.readLine());
        int[] array =  new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println("The result : " + sum);
    }





    //Menu list for this program
    private static void Menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("\n[1] Reversing Text Program");
            System.out.println("[2] Pyramid Program");
            System.out.println("[3] Summing Array");
            System.out.println("[4] Password Program");
            System.out.println("[5] Discount Program");
            System.out.println("[6] Methods Program");
            System.out.println("[7] Emotion Program");
            System.out.println("[8] Days Program");
            System.out.println("[9] Result Game Program");
    
            System.out.println("Select the program from the menu list : ");
            int UserAnswer = Integer.parseInt(reader.readLine());
    
            if (UserAnswer == 1) {
                ReversingTextProgram();
            }
            else if (UserAnswer == 2) {
                PyramidProgram();
            }
            else if (UserAnswer == 3) {
                SummingArray();
            }
            else if (UserAnswer == 4) {
                PasswordProgram();
            }
            else if (UserAnswer == 5) {
                DiscountProgram();
            }
            else if (UserAnswer == 6) {
                MethodsProgram();
            }
            else if (UserAnswer == 7) {
                EmotionProgram();
            }
            else if (UserAnswer == 8) {
                DaysProgram();
            }
            else if (UserAnswer == 9) {
                ResultGameProgram();
            }
            else  {
                System.out.print("Unknown menu.");
            }

            System.out.print("Want to redo it ? : ");
            String UserAnswerForRedo = System.console().readLine();

            if (UserAnswerForRedo == "y") {
                continue;
            }
            else if (UserAnswerForRedo == "n") {
                break;
            }
            else {
                System.out.println("Unknown Error");
                break;
            }
        }
        while (true);
    }




    public static void main(String[] args) throws IOException{
        Menu();
    }
}