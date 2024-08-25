package ku.cs.models;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentListTest {

    private StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent2Parameters() {
        studentList.addNewStudent("6610451249", "Ariyachai");
        Student student = studentList.findStudentById("6610451249");
        assertNotNull(student);
        assertEquals("Ariyachai", student.getName());
    }

    @Test
    void testAddNewStudent3Parameters() {
        studentList.addNewStudent("6610451249", "Ariyachai", 80.0);
        Student student = studentList.findStudentById("6610451249");
        assertNotNull(student);
        assertEquals("Ariyachai", student.getName());
        assertEquals(80.0, student.getScore());
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("6610451249", "Ariyachai");
        studentList.giveScoreToId("6610451249", 90.0);
        Student student = studentList.findStudentById("6610451249");
        assertNotNull(student);
        assertEquals(90.0, student.getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("6610451249", "Ariyachai", 85.0);
        String grade = studentList.viewGradeOfId("6610451249");
        assertNotNull(grade);
        assertEquals("A", grade);
    }

    @Test
    void testFindStudentById() {
        studentList.addNewStudent("6610451249", "Ariyachai");
        Student student = studentList.findStudentById("6610451249");
        assertNotNull(student);
        assertEquals("Ariyachai", student.getName());
    }

    @Test
    void testGetStudents() {
        studentList.addNewStudent("6610451249", "Ariyachai");
        studentList.addNewStudent("6610400099", "Parindar");
        assertEquals(2, studentList.getStudents().size());
    }


}