package it.polimi.ingsw.model;

public enum Outcome {
    WIN, LOSE, DRAW;

    public static Outcome winsIfTrue(boolean condition){

        return condition ? Outcome.WIN : Outcome.LOSE;

    }

    public String printOutcome(){
        String out;
        switch (this){
            case WIN:
                out = "You won!";
                break;
            case LOSE:
                out = "You lost!";
                break;
            case DRAW:
                out = "Draw";
                break;
            default:
                throw new IllegalArgumentException();
        }
        return out;
    }
}
