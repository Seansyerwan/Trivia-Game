import java.util.*;
public class qGen extends fill{ //we will want to call the fill sub class into this class. 
 Random rn = new Random();
 int [] r1 = new int[5]; 



 public void wHistory(String [][] s1, String [][]s2){
         
   for(int i = 0; i < 5; i++){
       
      int question = rn.nextInt(0,10); //this number geneates the question we want
      fill(r1,question,i);

       switch(r1[i]){

           case 0:
           s1[1][i] = "Vladimir Ilych Ulyanov, leader of the USSR until his death, was also known by what name?";
           s2[1][i] ="lenin";
           break;

           case 1:
           s1[1][i] = "Who was emperor of rome during the burning of Rome in 66AD?";
           s2[1][i] = "nero";
           break;

           case 2: 
           s1[1][i] = "What year did WW1 end?";
           s2[1][i] = "1918";
           break;

           case 3:
           s1[1][i] = "What year did the moon landings take place?";
           s2[1][i] = "1969";
           break;

           case 4:
           s1[1][i] = "Who discovered penicillin?";
           s2[1][i] = "alexander fleming";
           break;

           case 5:
           s1[1][i] = "What year did the Berlin Wall fall?";
           s2[1][i] = "1989";
           break;

           case 6:
           s1[1][i] = "What year did the economic crash known as Black Monday occur?";
           s2[1][i] = "1987";
           break;

           case 7:
           s1[1][i] = "Which year did Columbus discover the Caribbean?";
           s2[1][i] = "1492";
           break;

           case 8:
           s1[1][i] = "What country, also known as the graveyard of empires, did Russia, the UK and the USA all lose wars in?";
           s2[1][i] = "afghanistan";
           break;

           case 9:
           s1[1][i] = "What country predated Turkiye, Syria, and Lebanon while owning all of the land?";
           s2[1][i] = "the ottoman empire";
           break;

           default:
           break;
       }
       
    }

   }


   public void Movies(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
         
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[2][i] = "The what series had quotes such as ''I'll be back.'', and ''I need your clothes, your boots and your motorcycle.''?";
             s2[2][i] = "terminator";
             break;

             case 1:
             s1[2][i] = "Who directed movies like Taxi Driver, The Irishman, Raging Bull and Goodfellas?";
             s2[2][i] = "terminator";
             break;

             case 2: 
             s1[2][i] = "Who played Indiana Jones in the self titled series?";
             s2[2][i] = "harrison ford";
             break;

             case 3:
             s1[2][i] = "Cillian Murphy starred alongside Robert Downey JR, Florence Pugh and Matt Damon in what 2023 film?";
             s2[2][i] = "oppenheimer";
             break;


             case 4:
             s1[2][i] = "Mads Mikkelson played the main villain in what bond film?";
             s2[2][i] = "casino royale";
             break;


             case 5:
             s1[2][i] = "Who played the main character in Oceans 11?";
             s2[2][i] = "george clooney";
             break;


             case 6:
             s1[2][i] = "What year did the film Spirited away release in Ireland?";
             s2[2][i] = "2003";
             break;


             case 7:
             s1[2][i] = "The Banshees of Inisheerin, Phone Booth and In Bruges star what actor in the main role?";
             s2[2][i] = "colin farrell";

             break;


             case 8:
             s1[2][i] = "How many films in the Saw series are there?";
             s2[2][i] = "10";
             break;


             case 9:
             s1[2][i] = "What movie studio has the logo of a woman holding a torch?";
             s2[2][i] = "colombia";
             break; 


             default:
             break;
         }
         
      }
   }

   public void vGames(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[3][i] = "Which videogame series is famous for having cardboard boxes that the player hides in?";
             s2[3][i] = "metal gear solid";
             break;


             case 1:
             s1[3][i] = "What is the most powerful weapon in the Counter Strike series?";
             s2[3][i] = "awp";
             break;


             case 2: 
             s1[3][i] = "In resident evil 1, one of the main characters jokes that the player nearly became a 'Jill' what?";
             s2[3][i] = "sandwich";
             break;


             case 3:
             s1[3][i] = "In the dark souls series, the player fast travels and refills their healing by resting at a what?";
             s2[3][i] = "bonfire";
             break;


             case 4:
             s1[3][i] = "What clothing item are most prominently featured in the game Team Fortress 2?";
             s2[3][i] = "hat";
             break;



             case 5:
             s1[3][i] = "Who created the Civilization series?";
             s2[3][i] = "sid meyer";
             break;


             case 6:
             s1[3][i] = "Which series of visual novels are known for dramatic court cases and yelling the word 'OBJECTION!'?";
             s2[3][i] = "ace attorney";
             break;


             case 7:
             s1[3][i] = "How many mainline Final Fantasy games are there?";
             s2[3][i] = "16";
             break;


             case 8:
             s1[3][i] = "What is the maximum size of a 'Stack of Diamonds' one can have in Minecraft?";
             s2[3][i] = "64";
             break;


             case 9:
             s1[3][i] = "The half-life series uses what tool as the first weapon the player obtains?";
             s2[3][i] = "crowbar";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void Music(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[4][i] = "Taylor swift released what album in 2022?";
             s2[4][i] = "midnights";
             break;


             case 1:
             s1[4][i] = "What band did George Michael take part in?";
             s2[4][i] = "wham";
             break;


             case 2: 
             s1[4][i] = "pink floyd released what album in 1979?";
             s2[4][i] = "the wall";
             break;


             case 3:
             s1[4][i] = "Bing Crosby is well known for making a what christmas?";
             s2[4][i] = "white";
             break;


             case 4:
             s1[4][i] = "What Radiohead album was released in 1995 helped lead to the creation of coldplay?";
             s2[4][i] = "the bends";
             break;



             case 5:
             s1[4][i] = "Who is the protagonist of the song space oddity by David Bowie?";
             s2[4][i] = "major tom";
             break;


             case 6:
             s1[4][i] = "What was the first rap album to win the grammy album of the year?";
             s2[4][i] = "the miseducation of lauryn hill";
             break;


             case 7:
             s1[4][i] = "What song, created by Labi Siffre, and covered by Madness got to number 33 on the Billboard hot 100 chart?";
             s2[4][i] = "it must be love";
             break;


             case 8:
             s1[4][i] = "what band made the song virtual insanity?";
             s2[4][i] = "jamiroquai";
             break;


             case 9:
             s1[4][i] = "What french electronic group made songs like 'Get lucky', 'Harder, Better, Faster, Stronger', and 'One more time'?";
             s2[4][i] = "daft punk";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void iHistory(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[5][i] = "What year was the easter rising?";
             s2[5][i] = "1916";
             break;


             case 1:
             s1[5][i] = "Who was the first Taoiseach (just input his surname)?";
             s2[5][i] = "cosgrave";
             break;


             case 2: 
             s1[5][i] = "Who was the president of Sinn Féin when the Good Friday Agreement was signed?";
             s2[5][i] = "gerry adams";
             break;


             case 3:
             s1[5][i] = "What is the conflict in Northern Ireland from 1969 onwards known as?";
             s2[5][i] = "the troubles";
             break;


             case 4:
             s1[5][i] = "What was ww2 known as in Ireland?";
             s2[5][i] = "the emergency";
             break;

             case 5:
             s1[5][i] = "Who ran the late late show from its creation until his retirement?";
             s2[5][i] = "gay byrne";
             break;


             case 6:
             s1[5][i] = "Who was known as the man on the bike?";
             s2[5][i] = "michael collins";
             break;


             case 7:
             s1[5][i] = "What party, led by John Redmond advocated for home rule prior to the creation of the Free State?";
             s2[5][i] = "irish parliamentary party";
             break;


             case 8:
             s1[5][i] = "who was known as big Jim?";
             s2[5][i] = "jim larkin";
             break;


             case 9:
             s1[5][i] = "Who had a major role in both the easter rising and the Dublin Lockout?";
             s2[5][i] = "james connolly";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void Cuisine(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[6][i] = "Moko loko, a hawaiian cuisine, contains egg, gravy, steak and what item often featured in curries?";
             s2[6][i] = "rice";
             break;


             case 1:
             s1[6][i] = "Escargot is a delicacy from France made of what?";
             s2[6][i] = "snails";
             break;


             case 2: 
             s1[6][i] = "A croque-monsieur, hamburger, BLT and peanut butter and jelly are all types of what?";
             s2[6][i] = "sandwich";
             break;


             case 3:
             s1[6][i] = "A bratwurst is a type of what?";
             s2[6][i] = "sausage";
             break;


             case 4:
             s1[6][i] = "Flat x, garlic x, banana x, what is x?";
             s2[6][i] = "bread";
             break;



             case 5:
             s1[6][i] = "Mangelwurzel is a type of what?";
             s2[6][i] = "beet";
             break;


             case 6:
             s1[6][i] = "Carrot, sponge, and red velvet are all types of what?";
             s2[6][i] = "cake";
             break;


             case 7:
             s1[6][i] = "Ben and Jerrys is most well known for producing what?";
             s2[6][i] = "ice cream";
             break;


             case 8:
             s1[6][i] = "Where is the cheese located on Chicago style pizza?";
             s2[6][i] = "under the sauce";
             break;


             case 9:
             s1[6][i] = "A chocolatine is also known as what?";
             s2[6][i] = "pain au chocolat";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void Art(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[7][i] = "Which artist was known for making such pieces like the last supper and the mona lisa? (insert his full name)";
             s2[7][i] = "Leonardo Da Vinci";
             break;


             case 1:
             s1[7][i] = "What artist painted the Scream?";
             s2[7][i] = "Edvard Munch";
             break;


             case 2: 
             s1[7][i] = "Who painted paintings such as 'Starry Night over the Rhône' and 'Café Terrace at Night'?";
             s2[7][i] = "Vincent van Gogh";
             break;


             case 3:
             s1[7][i] = "Who painted a painting featuring melted pocket watches, known as 'The Persistence of Memory'?";
             s2[7][i] = "Salvador Dali";
             break;


             case 4:
             s1[7][i] = "Who painted things such as 'The Anatomy Lesson' and 'The Night Watch'? (Just his first name will suffice)";
             s2[7][i] = "Rembrandt";
             break;



             case 5:
             s1[7][i] = "Who was well known for his works of cans of Campbell's Soup and painting Marilyn Monroe?";
             s2[7][i] = "Andy Warhol";
             break;


             case 6:
             s1[7][i] = "Who painted the Sistine Chapel's ceiling? (Just his first name will suffice)";
             s2[7][i] = "Michelangelo";
             break;


             case 7:
             s1[7][i] = "Who's 'Black Paintings' included works such as 'Asmodea' and 'Saturn Devouring His Son'?";
             s2[7][i] = "Francisco Goya";
             break;


             case 8:
             s1[7][i] = "From what country does the artist behind the paintings in the game 'Minecraft' come from?";
             s2[7][i] = "Sweden";
             break;


             case 9:
             s1[7][i] = "Which art movement, created in the early 20th century, was based on intentional irrationality and banned by the Nazi Party in Germany?";
             s2[7][i] = "Dada";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void Literature(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[8][i] = "What is the name of the Captain of the ship 'Pequod' in Moby Dick?";
             s2[8][i] = "Ahab";
             break;


             case 1:
             s1[8][i] = "Where does the following quote come from 'It was the best of Times, it was the worst of times, it was the age of wisdom, it was the age of foolishness...'?";
             s2[8][i] = "a tale of two cities";
             break;


             case 2: 
             s1[8][i] = "What is the name of the book where the protagonist imagines windmills as giants?";
             s2[8][i] = "don quixote";
             break;


             case 3:
             s1[8][i] = "What book did the assassin of John Lennon become obssessed with prior to the assasination? (Use the full Title)";
             s2[8][i] = "The catcher in the rye";
             break;


             case 4:
             s1[8][i] = "What is the most well known work of James Joyce?";
             s2[8][i] = "ulysses";
             break;



             case 5:
             s1[8][i] = "Which book made by Mary Shelley showed the monster to be both a scientific creation and the protagonist?";
             s2[8][i] = "frankenstein";
             break;


             case 6:
             s1[8][i] = "What book made by an Bram Stoker that created the characters of Van Helsing and the vampire after which the book is named?";
             s2[8][i] = "dracula";
             break;


             case 7:
             s1[8][i] = "What book created such terms as double-speak, wrong-think and Big Brother?";
             s2[8][i] = "1984";
             break;


             case 8:
             s1[8][i] = "Who wrote books such as 'Pride and Prejudice' and 'Little Women'?";
             s2[8][i] = "Jane Austen";
             break;


             case 9:
             s1[8][i] = "What book, created by Franz Kafka, is about the protagonist waking up one day after being turned into an insect?";
             s2[8][i] = "metamorphosis";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void Computers(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[9][i] = "How many bits are in a byte?";
             s2[9][i] = "8";
             break;


             case 1:
             s1[9][i] = "What does RAM stand for?";
             s2[9][i] = "Random Access Memory";
             break;


             case 2: 
             s1[9][i] = "What does CPU stand for?";
             s2[9][i] = "central processing unit";
             break;


             case 3:
             s1[9][i] = "Linux is a type of what?";
             s2[9][i] = "Operating System";
             break;


             case 4:
             s1[9][i] = "How many megabytes are in a Terabyte?";
             s2[9][i] = "1000000";
             break;



             case 5:
             s1[9][i] = "Java, C++ and Python are all types of programming whats?";
             s2[9][i] = "languages";
             break;


             case 6:
             s1[9][i] = "What do you use to control the cursor on a monitor?";
             s2[9][i] = "mouse";
             break;


             case 7:
             s1[9][i] = "What are duckduckgo, google, and bing all?";
             s2[9][i] = "Search engines";
             break;


             case 8:
             s1[9][i] = "Who was the father of modern computer science, known for his machine named after himself?";
             s2[9][i] = "Alan Turing";
             break;


             case 9:
             s1[9][i] = "What does e mail stand for?";
             s2[9][i] = "electronic mail";
             break; 


             default:
             break;
         }
         
      }
   }
   
   public void Television(String [][] s1, String [][]s2){
      for(int i = 0; i < 5; i++){
         int question = rn.nextInt(0,10);
 
         fill(r1,question,i); //we use the compared method to check to see if this number is already executed.  
         switch(r1[i]){
             case 0:
             s1[10][i] = "Peter Falk played what iconic detective?";
             s2[10][i] = "columbo";
             break;


             case 1:
             s1[10][i] = "Who is Seinfeld named after?";
             s2[10][i] = "Jerry Seinfeld";
             break;


             case 2: 
             s1[10][i] = "Who played Tony Soprano in the Sopranos?";
             s2[10][i] = "James Gandolfini";
             break;


             case 3:
             s1[10][i] = "Breaking bad features many characters: who played Saul Goodman?";
             s2[10][i] = "bob odenkirk";
             break;


             case 4:
             s1[10][i] = "Finish the title of the show: How I met your?";
             s2[10][i] = "mother";
             break;



             case 5:
             s1[10][i] = "What show colours most of the characters yellow?";
             s2[10][i] = "the simpsons";
             break;


             case 6:
             s1[10][i] = "In what show about a cannibal does Mads Mikkelson play the title character?";
             s2[10][i] = "Hannibal";
             break;


             case 7:
             s1[10][i] = "What television show is David Lynch quite well known for?";
             s2[10][i] = "Twin Peaks";
             break;


             case 8:
             s1[10][i] = "What television show is a spinoff of 'Cheers'?";
             s2[10][i] = "Fraiser";
             break;


             case 9:
             s1[10][i] = "What show about zombies, featuring Norman Reedus, was adapted from a Comic book?";
             s2[10][i] = "The walking dead";
             break; 


             default:
             break;
         }
         
      }
   }
   
  

}