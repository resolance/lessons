package ru.ezhov.lessons.homework.resolance.homework.XML.JAXB.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshallerXml {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(WorkerBook.class);
            Marshaller marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marsh.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

            //создаем воркера
            WorkerBook workerBook = new WorkerBook("Kostayn", "M", 30, "Mr.President");
            //вывоодим его в консоль и в файл
            marsh.marshal(workerBook, new FileOutputStream("./WorkerBook.xml"));
            marsh.marshal(workerBook,System.out);

        } catch (FileNotFoundException io) {
            System.out.println("Файл не может быть создан");
        } catch (JAXBException jabx) {
            System.out.println("Контекст ошибочен: " + jabx);
        }

        System.out.println(new WorkerBook("Kostayn", "M", 30, "Mr.President"));
    }
}
