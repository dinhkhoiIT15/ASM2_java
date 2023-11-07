package ASM;

public class KException extends RuntimeException{
    private static final int empty = 200;
    private static final int invalid = 201;
    private String message;

    public KException(int i){
        switch(i){
            case 200:
                message = "Please enter something!";
                break;
            case 201:
                message = "Invalid choice!";
                break;
        }
    }

    @Override
    public String toString(){
        return "KException{" + message + '}';
    }
}
