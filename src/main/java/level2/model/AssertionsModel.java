package level2.model;

import java.util.*;

public class AssertionsModel {

    private Map<String, Integer> demoMap = new HashMap<>();
    private Optional<String> optionalString = Optional.empty();

    private int[] listOfIntegers = new int[5];
    private ArrayList<Object> objectList = new ArrayList<Object>();
    private Object nullObject;

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

    public boolean compareStrings(String firstString, String secondString) {

        if (firstString == null || secondString == null){
            throw new NullPointerException("At least one of the String is null");
        }

        return firstString.equals(secondString);
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
