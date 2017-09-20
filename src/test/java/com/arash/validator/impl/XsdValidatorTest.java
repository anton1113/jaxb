package com.arash.validator.impl;

import com.arash.entity.Person;
import com.arash.validator.Validator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author arash
 */
public class XsdValidatorTest {

    private static final String PERSON_XSD_PATH = "xsd/person.xsd";

    private Person person;
    private Validator validator;

    @Before
    public void setUp() throws Exception {

        validator = new XsdValidator();
        person = new Person();

        person.setName("Anton");
        person.setAge(24);
    }

    @Test
    public void isValid() throws Exception {

        Assert.assertTrue(validator.isValid(person, PERSON_XSD_PATH));
    }

}