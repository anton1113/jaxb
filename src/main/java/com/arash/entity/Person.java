package com.arash.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 *
 * @author arash
 */
@XmlRootElement(name = "person")
@XmlType(propOrder = {"name", "age", "friends"})
public class Person {

    private String name;
    private Integer age;
    private List<Person> friends;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @XmlElement
    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Person> getFriends() {
        return friends;
    }

    @XmlElement(name = "friend")
    @XmlElementWrapper
    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        String res = "Person{" + "name=" + name + '\'' + ", age=" + age + ", friends{";
        if (friends != null) {
            for (Person p: friends) {
                res += p.toString();
            }
        }
        res += "}}";
        return res;
    }
}
