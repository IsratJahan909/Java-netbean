//
//package com.abc.saxexemple;
//
//import java.io.File;
//import java.util.List;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//
//
//public class SchoolSAXParser {
//    public static void main(String[] args) {
//        try{
//        File xmlFile = new File("C://Users//B11//Desktop//AdvanceJava//Employee.xml");
//        if(!xmlFile.exists()){
//            System.out.println("XML file not found: " + xmlFile.getAbsolutePath());
//            return;
//        }
//        SAXParserFactory factory = SAXParserFactory.newInstance();
//        SAXParser saxParser = factory.newSAXParser();
//        StudentHandler handler = new StudentHandler();
//        saxParser.parse(xmlFile, handler);
//        List<Student> students = handler.getStudent();
//        students.forEach(System.out::println);
//        for(Student student : students){
//            System.out.println(student);
//        }
//        
//        }catch(Exception e) {
//            System.err.println("Error parsing XML: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
