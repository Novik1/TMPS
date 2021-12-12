package main;

import humans.Principal;
import humans.Humans;
import humans.PrincipalToTeacher;
import paper.Cash;
import paper.TestPaper;
import schoolclass.SchoolClass;

import java.util.ArrayList;

public class School {

    private String schoolName;

    private ArrayList<SchoolClass> classes = new ArrayList<>();

    private Principal schoolAdmin = new Principal();

    public String getSchoolName() {
        return schoolName;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void createClass(int numberOfStudents) {
        classes.add(schoolAdmin.createClass(numberOfStudents));
    }

    public void removeClass(int index) {
        classes.remove(index);
    }

    public void turnOnClassProjector(int index) {
        SchoolClass schoolClass = classes.get(index);
        System.out.println("Class " + schoolClass.getId() + ":");
        schoolClass.getProjectorRemote().turnOn();
    }

    public void turnOffClassProjector(int index) {
        SchoolClass schoolClass = classes.get(index);
        System.out.println("Class " + schoolClass.getId() + ":");
        classes.get(index).getProjectorRemote().turnOff();
    }

    public void createClassTest(int index, String theme, String task) throws CloneNotSupportedException {

        SchoolClass schoolClass = classes.get(index);

        TestPaper testPaper = schoolClass.getTeacher().createTestPaper(theme, task);
        Cash cash = new Cash();
        cash.setTestPaper(testPaper);

        for (Humans classStudent: schoolClass.getStudents()) {
            TestPaper testPaperPrototype = cash.getTestPaper();
            classStudent.setTestPaper(testPaperPrototype);
        }

    }

    public void showClassTest(int index) {
        classes.get(index).getTeacher().getTestPaper().getTestPaper();
    }

    public void showClasses() {
        for (SchoolClass schoolClass: classes)
            schoolClass.getSchoolClass();
    }

    public void setPrincipalInClass(int index) {
        classes.get(index).setTeacher(new PrincipalToTeacher(schoolAdmin));
    }

    public void teacherAction(int index) {
        SchoolClass schoolClass = classes.get(index);
        System.out.println("Class " + schoolClass.getId() + ":");
        schoolClass.getTeacher().action();
    }

    public void showClass(int index) {
        classes.get(index).getSchoolClass();
    }

    public void showPeopleList() {
        schoolAdmin.getHumans();
    }
}
