package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getFilterPersonList(){
        List<Person> filterList = new ArrayList<>();
        int size = personList.size();
        for(int i = 0; i < size; i++){
            if(personList.get(i).getAge() > 18 && personList.get(i).getAge() < 50){
                filterList.add(personList.get(i));
            }
        }
        return filterList;
    }
}
