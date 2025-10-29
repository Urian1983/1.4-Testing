package level1.ex2.model;

import java.util.ArrayList;
import java.util.Arrays;

public class DniModel {

    Dni dni = new Dni(null);

    public void setNumberDni(String newDniNumber){
        dni.setNumDNI(newDniNumber);
    }

    public boolean checkDni(String dniCode){
        int dniNumber;
        if(dniCode.length() != 9){
            System.out.println("Incorrect number of characters");
            return false;
        }

        try{
            dniNumber = Integer.parseInt(dniCode.substring(0, dniCode.length() - 1));

        }
        catch(NumberFormatException e){
            System.err.println("Error: " + e.getMessage());
            return false;
        }

            char dniLetterChar = dniCode.charAt(8);

            String dniLetter = String.valueOf(dniLetterChar);

        return checkDniLetter(dniNumber,dniLetter);

    }

    public boolean checkDniLetter(int dniNumber, String dniLetter){

        ArrayList<String> letrasDni = new ArrayList<>(Arrays.asList("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"));


        int trueLetterValue= dniNumber % 23;

        String trueLetter = letrasDni.get(trueLetterValue);

        if(trueLetter.equalsIgnoreCase(dniLetter)){
            return true;
        }

        else{
            return false;
        }
    }


}
