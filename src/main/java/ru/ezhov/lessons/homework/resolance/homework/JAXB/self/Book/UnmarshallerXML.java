package ru.ezhov.lessons.homework.resolance.homework.JAXB.self.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class UnmarshallerXML {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WorkerBook.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            FileReader fileReader = new FileReader("./WorkerBook.xml");
            WorkerBook workerBook = (WorkerBook) unmarshaller.unmarshal(fileReader);
            System.out.println(workerBook);
            System.out.println(fileReader);

        }catch (FileNotFoundException notFound){
            System.out.println("Проблема при открытии файла");
        }catch(JAXBException jab){
            System.out.println("Не корректный XML" + jab);
        }
    }
}
