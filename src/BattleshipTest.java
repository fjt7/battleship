public class BattlesshipTest {

    public static void main (String[] args){
        Warship ss_java = new Warship();
        int[] locations = {2,3,4};
        ss_java.setLocationCells(locations);
        String userGuess = "2";
        String result = ss_java.checkYourself(userGuess);
    }
}
