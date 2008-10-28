package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int[] inputs = parseInput(userInput);
        int[] randomNumbers = parseInput(randomNumber);
        int placeCorrect=0;
        int PlaceIncorrect=0;
        for(int i=0;i<4;i++){
            if(inputs [i]==randomNumbers[i] ){
                placeCorrect++;
            }
            else{
                PlaceIncorrect = containsInput(inputs[i], randomNumbers, PlaceIncorrect);
            }
        }
        return placeCorrect + "a"+PlaceIncorrect+"b";
        /*if(userInput.equals(randomNumber)){
            return "4a0b";
        }
        else if(userInput.equals("1256"))
            return "2a0b";
        else
        return "3a0b";  */
    }

    private int containsInput(int input, int[] randomNumbers, int placeIncorrect) {
        for(int j=0;j<4;j++){
           if(input ==randomNumbers[j])
               placeIncorrect++;
        }
        return placeIncorrect;
    }

    private int[] parseInput(String numbers) {
        int[] inputs = new int[4];
        for(int i=0;i<4;i++){
         inputs [i]=Integer.parseInt(numbers .substring(i,i+1));
        }
        return inputs;
    }
}
