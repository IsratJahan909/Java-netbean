//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//public class SerializationExample {
//
//    
//    
//
//    private static final String OBJECT_FILE = "checking.docx";
//
//    public static void writeObject() {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(OBJECT_FILE))) {
//            for (int i = 1; i <= 10; i++) {
//                oos.writeObject(new Student(i, "Rasel" + i, "Java" + i));
//            }
//            System.out.println("Objects written successfully to " + OBJECT_FILE);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    public static void readObject(){
//    try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream(OBJECT_FILE))){
//    while (true) {}
//    Student st = (Student) ois.readObject();
//        System.out.println("object read :" + st.getName());
//    } catch (IOException e){
//        System.out.println("All object read from file,");
//    }catch(IOException | ClassNotFoundException e){
//    e.printStackTrace();
//    }
//        }
//
//    public SerializationExample() {
//    }
//
//    
//    public static void main(String[] args) {
//        writeObject();
//        readObject();
//    }
//}
//class Student implements Serializable {
//        private int id;
//        private String name;
//        private String course;
//
//        public Student(int id) {
//            this.id = id;
//        }
//
//        public Student(String name) {
//            this.name = name;
//        }
//
//        public Student(int id, String name, String course) {
//            this.id = id;
//            this.name = name;
//            this.course = course;
//        }
//
//        private String getName() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//    }