package com.arash.validator.impl;

import com.arash.validator.Validator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 *
 * @author arash
 */
public class XsdValidator implements Validator {

    public boolean isValid(Object o, String xsdPath) {

        try {
            JAXBContext context = JAXBContext.newInstance(o.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, xsdPath);
            marshaller.marshal(o, new File("tmp.xml"));
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
