package ru.ezhov.lessons.homework.resolance.homework.JAXB.self.Book;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WorkerBook {

    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private String gender;
    @XmlElement(required = true)
    private int age;
    @XmlElement(required = true)
    private String appointment;

    public WorkerBook() {
    }

    public WorkerBook(String name, String gender, int age, String appointment) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.appointment = appointment;
    }

   /* public String getName() {
        return name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    /*public String getGender() {
        return gender;
    }
*/
    public void setGender(String gender) {
        this.gender = gender;
    }

    /*public int getAge() {
        return age;
    }*/

    public void setAge(int age) {
        this.age = age;
    }

   /* public String getAppointment() {
        return appointment;
    }*/

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    /*@Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Age: " + getAge() + "\n"
                + "Gender: " + getGender() + "\n"
                + "Appointment: " + getAppointment() + "\n";
    }*/
    @Override
    public String toString() {
        return "\nName: " + name + "\n"
                + "Age: " + age + "\n"
                + "Gender: " + gender + "\n"
                + "Appointment: " + appointment + "\n";
    }
}
