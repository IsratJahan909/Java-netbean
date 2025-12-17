package com.abc.saxexemple;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXExample extends DefaultHandler {

    private String currentElement;
    private StringBuilder currentText;
    private String currentStudentId;
    private String currentName;
    private String currentAge;
    private String currentCourse;
    private boolean isStudent = false;
    private int studentCount = 0;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Parsing started...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        currentElement = qName;
        currentText = new StringBuilder();

        if (qName.equals("student")) {
            isStudent = true;
            studentCount++;
            currentStudentId = attributes.getValue("id");
            System.out.println("Student: " + studentCount + "----");
            System.out.println("ID: " + currentStudentId);

        }

//        System.out.println("Element name: " + currentElement);
//        System.out.println("Attributes value: " + attributes.getValue("id"));
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentText != null) {
            currentText.append(ch, start, length);
        }
    }

    @Override
    public void endDocument() throws SAXException {
       
      System.out.println("Parsing finished.");

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String text = currentText.toString().trim();

        if (isStudent)  {
            switch (qName) {
                case "name":
                    currentName = text;
                    System.out.println("Name: " + currentName);
                    break;
                case "age":
                    currentAge = text;
                    System.out.println("Age: " + currentAge);
                    break;
                case "course":
                    currentCourse = text;
                    System.out.println("Course: " + currentCourse);
                    break;
                case "student":
                    isStudent = false;
                    currentStudentId = null;
                    currentName = null;
                    currentAge = null;
                    currentCourse = null;
                    break;

            }
        }
    }

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            SAXExample handler = new SAXExample();

            saxParser.parse("C://Users//B11//Desktop//AdvanceJava//Employee.xml", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
