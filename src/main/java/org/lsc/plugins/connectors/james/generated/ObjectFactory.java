//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.10 at 05:05:31 PM CEST 
//


package org.lsc.plugins.connectors.james.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.lsc.plugins.connectors.james.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.lsc.plugins.connectors.james.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JamesAliasService }
     * 
     */
    public JamesAliasService createJamesAliasService() {
        return new JamesAliasService();
    }

    /**
     * Create an instance of {@link JamesUsersService }
     *
     */
    public JamesUsersService createJamesUsersService() {
        return new JamesUsersService();
    }

    /**
     * Create an instance of {@link JamesUsersService }
     *
     */
    public JamesContactService createJamesContactService() {
        return new JamesContactService();
    }

}
