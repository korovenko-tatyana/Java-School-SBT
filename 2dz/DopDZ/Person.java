public abstract class Person implements Client{
    public boolean man;
    public String name;
    public int age;
    public Person spouse;

    public Person(){
        this.man = true;
        this.name = "Semen Semenov";
        this.age = 0;
        this.spouse = null;
    }
    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }
    public Person(boolean man, String name,int age, Person person) {
        this.man = man;
        this.name = name;
        this.age = age;
        this.spouse = person;
    }
    public void setPerson(boolean man_s, String name_s,int age_s, Person person) {
        man = man_s;
        name = name_s;
        age = age_s;
        spouse = person;
    }
    public String getPerson(){
        return "Man: "+man + " Name" + name + " Age: " + age + "Spouse: " + spouse;
    }
    public void Information(){
        System.out.println(name+" age:" +age+ " job: "+job);
    }
}
