import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }
    public boolean isEmpty() {
        if (this.people.size() > 0) {
            return false;
        }
        return true;
    }
    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.size() == 0) {
            return null;
        }

        Person tempPerson = this.people.get(0);

        for (Person p : people) {
            if (tempPerson.getHeight() > p.getHeight()) {
                tempPerson = p;
            }
        }
        return tempPerson;
    }

    public Person take() {
        if (!(this.isEmpty())) {
            Person temp = this.shortest();
            this.people.remove(temp);
            return temp;
        }
        return null;
    }
}
