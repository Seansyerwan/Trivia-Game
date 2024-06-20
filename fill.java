import java.util.*;
public class fill {
    Random rn = new Random();
    boolean compared;
    boolean visited;


    public void fill(int []question, int a, int b){ //the point of this sub class is to fill the queue up with non repeated random numbers. 
        compared = false;


        while(compared == false){ //this comparison loop checks to see if the previous number matches the current one.
          
          for(int i = 0; i < 5; i++){
            if(question[i]==a){
              visited = true;
            }
          }

          if(visited == true){ 
            a = rn.nextInt(0,10); //we replace the value to compare again.
            }
          else{
            compared = true; //this shows that the numbers do not match, and therefore are not a problem anymore.
          }
          visited = false; //this then loops back again, making sure there is no infinite loop on itself.
         }

         question[b]=a; //end of program, we now store the previous value to compare in the future
      }
}
