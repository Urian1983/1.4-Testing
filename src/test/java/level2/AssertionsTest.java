package level2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import level2.model.AssertionsModel;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class AssertionsTest {

    private AssertionsModel testedAssertions;

    @BeforeEach
    void setUp(){
        testedAssertions = new AssertionsModel();
    }

    @Test
    void testMapContainsKey() {
        testedAssertions.fillMap();
        assertThat(testedAssertions.mapContainsKey("Age")).isTrue();
        assertThat(testedAssertions.mapContainsKey("Weight")).isFalse();
    }

    @Test
    void testEmptyOptional() {
        testedAssertions.createEmptyOptional();
        assertThat(testedAssertions.isOptionalEmpty()).isTrue();
    }

    @Test
    void testEqualIntegers(){
        int a = 12345678;
        int b = 12345678;
        boolean isTrue= testedAssertions.compareIntegers(a,b);
        assertThat(isTrue).isTrue();
    }

    @Test
    void testNoEqualIntegers(){
        int a = 12345678;
        int b= 87654321;
        boolean isFalse = testedAssertions.compareIntegers(a,b);
        assertThat(isFalse).isFalse();
    }

    @Test
    void testEqualStrings(){
        String a = "Hola";
        String b = "Hola";
        boolean isTrue = testedAssertions.compareStrings(a,b);
        assertThat(isTrue).isTrue();
    }

    @Test
    void testNoEqualStrings(){
        String a = "Hola";
        String b = "Adios";
        boolean isFalse = testedAssertions.compareStrings(a,b);
        assertThat(isFalse).isFalse();

    }

    @Test
    void testObjectList(){
        char a = 'a';
        int b = 12345678;
        String c= "Hello";
        testedAssertions.fillObjectList(a,b,c);
        assertThat(testedAssertions.getObjectList()).contains(a,b,c);

    }

    @Test
    void checkListOfIntegersTest(){
        int a =0;
        int b= 10;
        int c= 100;
        int d= 1000;
        int e= 1;
        testedAssertions.fillListIntegers(a,b,c,d,e);
        assertThat(testedAssertions.getListOfIntegers()).contains(a,b,c,d,e);
    }

    @Test
    void checkDuplicatesTestTrue(){
        char a = 'a';
        int b = 12345678;
        String c= "Hello";
        testedAssertions.fillObjectList(a,b,c);
        testedAssertions.addToObjectList(a);
        assertThat(testedAssertions.checkDuplicates(a)).isTrue();
    }

    @Test
    void checkDuplicatesTestFalse(){
        char a = 'a';
        int b = 12345678;
        String c= "Hello";
        float d = 3.24f;
        testedAssertions.fillObjectList(a,b,c);
        testedAssertions.addToObjectList(a);
        assertThat(testedAssertions.checkDuplicates(d)).isFalse();
    }

    @Test
    void checkObjectisNull(){
        testedAssertions.makeNullObject();
        assertThat(testedAssertions.getNullObject()).isNull();
    }

    @Test
    void toFailArrayTest(){
        try{
            testedAssertions.toFailArray();
            fail("message");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Ups, Out of bounds");
        }

    }

}