package clase;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = grades;
    }
//
    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new ArrayList<>();
        for (StudentGrade grade : grades) {
            if (grade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(grade.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> gradesForStudent = new ArrayList<>();
        for (StudentGrade grade : grades) {
            if (grade.getName().equals(student)) {
                gradesForStudent.add(grade.getGrade());
            }
        }
        return gradesForStudent;
    }
}
