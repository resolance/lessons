package ru.ezhov.lessons.homework.ezhov.test;

public class TestExtends {

    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        Doctor doctor = new Doctor();

        MedicalStaff medicalStaff = nurse;
        MedicalStaff medicalStaff1 = nurse;
        System.out.println(medicalStaff == medicalStaff1);

        MedicalStaff medicalStaff2 = nurse;
        MedicalStaff medicalStaff21 = doctor;
        System.out.println(medicalStaff2 == medicalStaff21);
    }

}

class MedicalStaff {}
class Doctor extends MedicalStaff {}
class Nurse extends MedicalStaff {}
class HeadDoctor extends Doctor {}
