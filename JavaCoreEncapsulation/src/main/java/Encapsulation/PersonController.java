package  Encapsulation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PersonController {
    private static PersonList personList = generatePerson(10);


    @RequestMapping("/person")
    public Person getPerson(){
        Person person = new Person("hp","acer","male",new GregorianCalendar(1998,Calendar.JANUARY,24));
        return person;
    }

    @RequestMapping("/listOfPerson")
    public PersonList getPersonList(){
        return personList;
    }

    public static PersonList generatePerson(int number){
        List <Person> list = new ArrayList<>();
        int numberOfCharacterForName = 5; //generate 5 character as name
        for (int i = 0; i<number;i++) {
            Person person = new Person();
            Random random = new Random();
            int age = random.nextInt(81 - 1) + 1;
            person.setAge(age);
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String firstName = "";
            for (int j = 0; j < numberOfCharacterForName; j++) {
                firstName = firstName + alphabet.charAt(random.nextInt(alphabet.length()));
            }
            person.setFirstName(firstName);
            String lastName = "";
            for (int k = 0; k < numberOfCharacterForName; k++) {
                lastName = lastName + alphabet.charAt(random.nextInt(alphabet.length()));
            }
            person.setLastName(lastName);
            String sgender;
            int gender = random.nextInt(2) + 1;
            if (gender > 1) {
                sgender = "Male";
            }else{
                sgender = "Female";}
            person.setGender(sgender);
            list.add(person);
            Collections.sort(list,new PersonChainedComparator(
                    new PersonAgeComparator(),
                    new PersonNameComparator())
            );
        }
        PersonList personList = new PersonList();
        personList.setPersonList(list);
        return personList;
    }
}
