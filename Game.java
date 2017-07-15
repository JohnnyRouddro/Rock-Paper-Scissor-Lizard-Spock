import java.util.Random;
import static java.lang.Math.abs;

public class Game {
    int r;
    String msg;
    Random rand = new Random();
    
    public String getResult(int input){
        r = 1 + rand.nextInt()%5; //1 = rock, 2 = paper, 3 = scissor, 4 = lizard, 5 = spock
        r = abs(r);
        switch(input){
            case 1: rock(r);
                break;
            case 2: paper(r);
                break;
            case 3: scissor(r);
                break;
            case 4: lizard(r);
                break;
            case 5: spock(r);
                break;
        }
        return msg;
    }
    
    private void rock(int r){
        switch(r){
            case 1: msg = "It's a tie, I also chose Rock.";
                break;
            case 2: msg = "You lose, I chose Paper.\nPaper covers Rock";
                break;
            case 3: msg = "You win ! I chose Scissor.\nRock crushes Scissor.";
                break;
            case 4: msg = "You win ! I chose Lizard.\nRock crushes Lizard.";
                break;
            case 5: msg = "You lose, I chose Spock.\nSpock vaporizes Rock.";
                break;
        }
    }
    private void paper(int r){
        switch(r){

            case 1: msg = "You win ! I chose Rock.\nPaper covers Rock.";
                break;
            case 2: msg = "It's a tie, I also chose Paper.";
                break;
            case 3: msg = "You lose, I chose Scissor.\nScissor cuts Paper.";
                break;
            case 4: msg = "You lose, I chose Lizard.\nLizard eats Paper";
                break;
            case 5: msg = "You win ! I chose Spock.\nPaper disproves Spock.";
                break;
        }
    }
    private void scissor(int r){
        switch(r){
            
            case 1: msg = "You lose, I chose Rock.\nRock crushes Scissor";
                break;
            case 2: msg = "It's a tie, I also chose Scissor.";
                break;
            case 3: msg = "You win ! I chose Paper.\nScissor cuts Paper";
                break;     
            case 4: msg = "You lose, I chose Lizard.\nScissor decapitates Lizard";
                break;
            case 5: msg = "You win ! I chose Spock.\nSpock smashes Scissor";
                break;
        }
    }
    private void lizard(int r){
        switch(r){
            
            case 1: msg = "You lose, I chose Rock.\nRock crushes Lizard";
                break;
            case 2: msg = "You lose, I chose Scissor.\nScissor decapitates Lizard.";
                break;
            case 3: msg = "You win ! I chose Paper.\nLizard eats Paper.";
                break;
            case 4: msg = "It's a tie, I also chose Lizard.";
                break;
            case 5: msg = "You win ! I chose Spock.\nLizard poisons Spock.";
                break;
        }
    }
    private void spock(int r){
        switch(r){
            
            case 1: msg = "You win ! I chose Rock.\nSpock vaporizes Rock.";
                break;
            case 2: msg = "You lose, I chose Paper.\nPaper disproves Spock.";
                break;
            case 3: msg = "You win ! I chose Scissor.\nSpock smashes Scissor.";
                break;
            case 4: msg = "You lose, I chose Lizard.\nLizard poisons Spock";
                break;
            case 5: msg = "It's a tie, I also chose Spock";
                break;
        }
    }
}
