package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6610451249", "Ariyachai");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6610451249", "Ariyachai");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการตรวจสอบรหัสนักเรียน")
    void testId(){
        Student s = new Student("6610451249", "Ariyachai");
        assertTrue(s.isId("6610451249"));
        assertFalse(s.isId(null));
        assertFalse(s.isId("0000000000"));
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อนักเรียน")
    void testChangeName() {
        Student s = new Student("6610451249", "Ariyachai");
        s.changeName(" ");
        assertEquals("Ariyachai", s.getName());
        s.changeName("Apichai");
        assertEquals("Apichai", s.getName());
    }


}