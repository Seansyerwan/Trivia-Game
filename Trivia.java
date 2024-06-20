import java.util.*;

public class Trivia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sz = new Scanner(System.in);

        boolean running= true;
        while(running){
            
        System.out.println("Please input what topics you wish to have questions from:\n Type 1 for World History. \n Type 2 for Movies. \n Type 3 for video games \n Type 4 for Music.");
        System.out.println("Type 5 for Irish History. \n Type 6 for Cuisine. \n Type 7 for Art. \n Type 8 for Literature. \n Type 9 for Computers. \n Type 10 for Television.");

        
        String [][]quiz = new String[11][5]; //this string 2d array will determine what questions come up.
        String [][]answer = new String[11][5];
        int choice = sc.nextInt(); //this takes in the user's input. the quiz takes in questions for each of the topics above, and changes every time.

        int correct = 0;

        qGen question = new qGen();
        
        switch(choice){
            case 1: 
            question.wHistory(quiz, answer);
            break;
            case 2:
            question.Movies(quiz, answer);
            break;
            case 3:
            question.vGames(quiz, answer);
            break;
            case 4:
            question.Music(quiz, answer);
            break;
            case 5:
            question.iHistory(quiz, answer);
            break;
            case 6:
            question.Cuisine(quiz, answer);
            break;
            case 7:
            question.Art(quiz, answer);
            break;
            case 8:
            question.Literature(quiz, answer);
            break;
            case 9: 
            question.Computers(quiz, answer);
            break;
            case 10:
            question.Television(quiz, answer);
            break;
            default:
            break;
        }

        for(int i = 0; i < 5; i++){
            System.out.println(quiz[choice][i]);
            String input = sz.nextLine();

            if(input.equalsIgnoreCase(answer[choice][i])) correct++;
        }

        System.out.println("You got "  + correct + " out of 5 questions correct. \n Would you like to keep playing? Y/N\n");
        

        String confirm = sz.nextLine();
        if(confirm.toUpperCase().charAt(0) != 'Y'){
            running = false;
        }
       

    }
    sc.close();
    sz.close();
}
    
}


