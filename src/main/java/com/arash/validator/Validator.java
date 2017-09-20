package com.arash.validator;

import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;

/**
 *
 * @author arash
 */
public interface Validator {

    boolean isValid(Object o, String xsdPath) throws JAXBException, SAXException;
}
