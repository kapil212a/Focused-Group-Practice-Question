import java.util.*;
public class Strings {

    
    //Question -- 26

    public static void moveHash(){
        String str = "Move#Hash#to#Front";

        int count = 0;
        String result = "";

        for(char c : str.toCharArray()){
            if(c == '#'){
                count++;
            }
            else{
                result += c;
            }
        }

        String hashes = "";

        for(int i=0;i<count;i++){
            hashes += "#";
        }

        System.out.println(hashes + result);
    }

    //Question -- 27

    public static void SeasonFinder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Month: ");
        int month = sc.nextInt();

        if(month < 1 || month > 12){
            System.out.println("Invalid Month Entered");
        }
        else if(month >= 3 && month <= 5){
            System.out.println("Season: Spring");
        }
        else if(month >= 6 && month <= 8){
            System.out.println("Season: Summer");
        }
        else if(month >= 9 && month <= 11){
            System.out.println("Season: Autumn");
        }
        else{
            System.out.println("Season: Winter");
        }
    }

    //Question -- 28

    public static void valleys(){
        String path = "UDDDUDUU";

        int level = 0;
        int valleys = 0;

        for(char step : path.toCharArray()){

            if(step == 'U'){
                level++;
            }
            else{
                level--;
            }

            if(level == 0 && step == 'U'){
                valleys++;
            }
        }

        System.out.println(valleys);
    }

    //Question -- 29

    public static void StringCompression(){
        String str = "aabbbbeeeeffggg";

        int count = 1;

        for(int i=0;i<str.length();i++){

            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }
    }

    //Question -- 30

    public static void ReverseString(){
        String s = "Capgemini";

        String reversed = "";

        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }

        System.out.println(reversed);
    }
    
    
    public static void main(String[] args) {
        

        moveHash();

        SeasonFinder();

        valleys();

        StringCompression();

        ReverseString();
    }
}
