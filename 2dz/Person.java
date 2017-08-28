public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }
    public boolean marry(Person person) {
        boolean flag = false;
        if (this.man!=person.man){
            if (this.spouse == null) {
                this.spouse = person;
                if (person.spouse == null) {
                    person.spouse = this;
                } else {
                    flag = true;
                    person.spouse.spouse = null;
                    person.spouse = this;
                }


            }
            else{
                flag = true;
                this.spouse.spouse = null;
                this.spouse = person;
                if (person.spouse == null) {
                    person.spouse = this;
                } else {
                    person.spouse.spouse = null;
                    person.spouse = this;
                }
            }
        }
        return (this.man!=person.man && flag);
    }
    public boolean divorce() {
        boolean flag = false;
        if (this.spouse != null){
            this.spouse = null;
            flag = true;
        }
        return flag;
    }
}
