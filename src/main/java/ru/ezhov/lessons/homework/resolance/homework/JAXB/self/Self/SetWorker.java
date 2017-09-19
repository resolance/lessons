package ru.ezhov.lessons.homework.resolance.homework.JAXB.self.Self;

import javax.xml.bind.JAXBException;

public class SetWorker {
    public static void main(String[] args) throws JAXBException {

        Worker worker = new Worker();
        worker.setAge(30);
        worker.setAppointment("mr.Prezident");
        worker.setGender("Male");
        worker.setName("Kostayn");
        worker.setCompany("Goverment");
        System.out.println(worker);

        //передадим наш класс и запишем его в файл
        MarshallerClassToXML marshallerXML = new MarshallerClassToXML(Worker.class);
        /*marshallerXML.


        marshaller.marshal(classT., file);
        marshaller.marshal(classT, System.out);*/


    }
}
