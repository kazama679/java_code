package ss10.b7;

public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (checkTopic(researchTopic) && checkSupervisorName(supervisorName)) {
            this.researchTopic = researchTopic;
            this.supervisorName = supervisorName;
        } else {
            System.out.println("k hợp lệ.");
        }
    }

    private boolean checkTopic(String researchTopic) {
        return researchTopic != null && !researchTopic.trim().isEmpty();
    }

    private boolean checkSupervisorName(String supervisorName) {
        return supervisorName != null && !supervisorName.trim().isEmpty();
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (checkTopic(researchTopic)) {
            this.researchTopic = researchTopic;
        } else {
            System.out.println("đề tài k hợp lệ.");
        }
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        if (checkSupervisorName(supervisorName)) {
            this.supervisorName = supervisorName;
        } else {
            System.out.println("Tên giảng viên k hợp lệ.");
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài: "+ researchTopic + ", GVHD: " + supervisorName;
    }
}
