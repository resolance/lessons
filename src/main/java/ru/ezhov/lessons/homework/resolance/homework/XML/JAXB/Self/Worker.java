package ru.ezhov.lessons.homework.resolance.homework.XML.JAXB.Self;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*Описать работника в xml (имя, возраст, пол, должность)*/
@XmlRootElement
public class Worker {
    private int age;
    private String name;
    private String gender;
    private String appointment;
    private String Company;

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlElement
    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @XmlAttribute
    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Age: " + getAge() + "\n"
                + "Gender: " + getGender() + "(" + "\n"
                + "Appointment: " + getAppointment() + "\n"
                + "Company: " + getCompany() + "\n";
    }
}
