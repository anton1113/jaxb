package com.arash.parser.impl;

import com.arash.entity.Person;
import com.arash.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;


/**
 *
 * @author arash
 */
public class JaxbParserTest {

    private Parser parser;
    private File file;

    @Before
    public void setUp() throws Exception {

        parser = new JaxbParser();
        file = new File("person.xml");
    }

    @Test
    public void getObject() throws Exception {

        Person person = (Person) parser.getObject(file, Person.class);
        System.out.println(person);
    }

    @Test
    public void saveObject() throws Exception {

        Person person = new Person();
        person.setName("Anton");
        person.setAge(24);

        parser.saveObject(file, person);
    }

}