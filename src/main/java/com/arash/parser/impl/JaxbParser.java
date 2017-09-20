package com.arash.parser.impl;

import com.arash.parser.Parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 *
 * @author arash
 */
public class JaxbParser implements Parser {

    public Object getObject(File file, Class c) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        return unmarshaller.unmarshal(file);
    }

    public void saveObject(File file, Object o) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(o, file);
    }
}
