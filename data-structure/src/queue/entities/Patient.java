package queue.entities;

public class Patient implements Comparable<Patient>{
    private String name;
    private int priority;

    public Patient(){}

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient patient) {
        //obj1 > obj2 return > 0 (1)
        //ojb1 < obj2 return < 0 (-1)

        if (this.priority > patient.getPriority()) {
            return 1;
        } else if (this.priority < patient.getPriority()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
