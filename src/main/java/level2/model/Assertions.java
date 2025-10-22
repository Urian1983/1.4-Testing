package level2.model;

import java.util.*;

public class Assertions {

    private Map<String, Integer> demoMap = new HashMap<>();
    private Optional<String> optionalString = Optional.empty();

    private int[] listOfIntegers = new int[5];

    private Scanner sc = new Scanner(System.in);
    private int firstIntNumber;
    private int secondIntNumber;
    private String firstString;
    private String secondString;
    private ArrayList<Object> objectList = new ArrayList<Object>();
    private Object nullObject;

    public void enterComparingIntegers(){
        try{
            System.out.println("Type the first integer to compare");
            this.firstIntNumber=sc.nextInt();
            sc.nextLine();
            System.out.println("Now, type the second integer to compare");
            this.secondIntNumber = sc.nextInt();
            sc.nextLine();
        }
        catch(InputMismatchException e){
            System.err.println("Please, enter an integer" + e.getMessage());
        }

    }

    public boolean checkDuplicates(Object obj){
        Iterator<Object> it = objectList.iterator();
        byte counterDuplicates =0;
        while(it.hasNext()){
            Object temp = it.next();
            if(temp.equals(obj)){
                counterDuplicates++;
                if(counterDuplicates>1){
                    return true;
                }
            }
        }
        return false;
    }

    public void fillCustomListIntegers(){
        try{
            for (int i = 0; i <listOfIntegers.length ; i++) {
                System.out.println("Type an integer");
                int temp= sc.nextInt();
                listOfIntegers[i] = temp;
                sc.nextLine();
            }
        }
        catch(IndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }

    }

    public int[] getListOfIntegers() {
        return listOfIntegers;
    }

    public int[] fillListIntegers(int a, int b, int c, int d, int e){
        this.listOfIntegers[0]= a;
        this.listOfIntegers[1]= b;
        this.listOfIntegers[2]= c;
        this.listOfIntegers[3]= d;
        this.listOfIntegers[4]= e;
        return listOfIntegers;
    }

    public boolean compareIntegers(int firstIntNumber, int secondIntNumber){

        return firstIntNumber == secondIntNumber;

    }

    public void enterComparingStrings (){
        try{
            System.out.println("Type the first String to compare");
            this.firstString=sc.nextLine();
            System.out.println("Now, type the second String to compare");
            this.secondString = sc.nextLine();
        }
        catch (InputMismatchException e){
            System.err.println("Please enter a String" + e.getMessage());
        }

    }

    public boolean compareStrings(String firstString, String secondString) {

        if (firstString == null || secondString == null){
            throw new NullPointerException("At least one of the String is null");
        }

        return firstString.equals(secondString);
    }

    public void fillCustomObjectList(){
        System.out.println("Type a random character");
        String tempString = sc.next();
        char randomChar = tempString.charAt(0);
        objectList.add(randomChar);
        System.out.println("Type a random number");
        int randomInt = sc.nextInt();
        sc.nextLine();
        objectList.add(randomInt);
        System.out.println("Type a random phrase");
        String randomPhrase = sc.nextLine();
        objectList.add(randomPhrase);
    }

    public Object getNullObject() {
        return nullObject;
    }

    public void makeNullObject(){
        this.nullObject= null;
    }

    public void toFailArray(){
            int[] arr = new int[5];
            int value = arr[10];
        }

    public void fillObjectList(char randomChar, int randomInt, String randomString){
        objectList.add(randomChar);
        objectList.add(randomInt);
        objectList.add(randomString);
    }

    public void addToObjectList(Object obj) {
        objectList.add(obj);
    }

    public ArrayList<Object> getObjectList() {
        return objectList;
    }

    public void setFirstIntNumber(int firstIntNumber) {
        this.firstIntNumber = firstIntNumber;
    }

    public void setSecondIntNumber(int secondIntNumber) {
        this.secondIntNumber = secondIntNumber;
    }

    public int getFirstIntNumber() {
        return firstIntNumber;
    }

    public int getSecondIntNumber() {
        return secondIntNumber;
    }

    public void fillMap() {
        demoMap.put("Age", 30);
        demoMap.put("Heigth", 175);
    }

    public boolean mapContainsKey(String key) {
        return demoMap.containsKey(key);
    }

    public Map<String, Integer> getDemoMap() {
        return demoMap;
    }

    public void createEmptyOptional() {
        this.optionalString = Optional.empty();
    }

    public Optional<String> getOptionalString() {
        return optionalString;
    }

    public boolean isOptionalEmpty() {
        return optionalString.isEmpty();
    }
}
