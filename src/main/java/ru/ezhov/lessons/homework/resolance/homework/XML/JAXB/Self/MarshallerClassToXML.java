package ru.ezhov.lessons.homework.resolance.homework.XML.JAXB.Self;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshallerClassToXML {

    public MarshallerClassToXML(Class classT) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(classT);
        Marshaller marshaller = context.createMarshaller();

        //Создадим настройки на вывод файла
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Создадим файл
        File file = new File("./" + classT.getSimpleName() + ".xml");
        //передадим наш класс и запишем его в файл
        marshaller.marshal(classT, file);
        marshaller.marshal(classT, System.out);

       /* public void exportXML (Class ){

    }*/

    }
}
