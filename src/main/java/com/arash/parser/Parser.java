package com.arash.parser;

import javax.xml.bind.JAXBException;
import java.io.File;

/**
 *
 * @author arash
 */
public interface Parser {

    Object getObject(File file, Class c) throws JAXBException;
    void saveObject (File file, Object o) throws JAXBException;
}
