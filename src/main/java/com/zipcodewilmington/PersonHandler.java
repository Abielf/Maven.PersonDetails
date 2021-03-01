package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    //so for personal notice, this is the constructor for the class personhandler.
    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
            while (counter< personArray.length) {
                // begin loop
                // use `counter` to identify the `current Person` in the array
                Person currentPerson = personArray[counter];
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                result = result.concat(currentPerson.toString());
                // end loop
                counter++;
            }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int counter=0; counter<personArray.length; counter++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result = result.concat(currentPerson.toString());
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person currentPerson:personArray) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result = result.concat(currentPerson.toString());
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
