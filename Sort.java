package Final;

public class Sort implements Comparable<Sort>{
    public static int index = 0;
    private String idGrade;
    private String idStudent;
    private String fullName;
    private String birth;
    private double attendGrade ;
    private double midtermScoreI;
    private double semesterEndGradeI;
    private double midtermScoreII;
    private double semesterEndGradeII;
    private double avGradeI;
    private double avGradeII;
    private double avGrade;
    private String study;

    public Sort(String idGrade, String idStudent, String fullName,
                String birth, double attendGrade, double midtermScoreI,
                double semesterEndGradeI, double midtermScoreII,
                double semesterEndGradeII, double avGradeI, double avGradeII,
                double avGrade, String study) {
        this.idGrade = idGrade;
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.birth = birth;
        this.attendGrade = attendGrade;
        this.midtermScoreI = midtermScoreI;
        this.semesterEndGradeI = semesterEndGradeI;
        this.midtermScoreII = midtermScoreII;
        this.semesterEndGradeII = semesterEndGradeII;
        this.avGradeI = avGradeI;
        this.avGradeII = avGradeII;
        this.avGrade = avGrade;
        this.study = study;
    }


    public String getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(String idGrade) {
        this.idGrade = idGrade;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getAttendGrade() {
        return attendGrade;
    }

    public void setAttendGrade(double attendGrade) {
        this.attendGrade = attendGrade;
    }

    public double getMidtermScoreI() {
        return midtermScoreI;
    }

    public void setMidtermScoreI(double midtermScoreI) {
        this.midtermScoreI = midtermScoreI;
    }

    public double getSemesterEndGradeI() {
        return semesterEndGradeI;
    }

    public void setSemesterEndGradeI(double semesterEndGradeI) {
        this.semesterEndGradeI = semesterEndGradeI;
    }

    public double getMidtermScoreII() {
        return midtermScoreII;
    }

    public void setMidtermScoreII(double midtermScoreII) {
        this.midtermScoreII = midtermScoreII;
    }

    public double getSemesterEndGradeII() {
        return semesterEndGradeII;
    }

    public void setSemesterEndGradeII(double semesterEndGradeII) {
        this.semesterEndGradeII = semesterEndGradeII;
    }

    public double getAvGradeI() {
        return avGradeI;
    }

    public void setAvGradeI(double avGradeI) {
        this.avGradeI = avGradeI;
    }

    public double getAvGradeII() {
        return avGradeII;
    }

    public void setAvGradeII(double avGradeII) {
        this.avGradeII = avGradeII;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    @Override
    public int compareTo(Sort o) {

        if(index == 1) {
            int last1 = fullName.lastIndexOf(" ");
            String name1 = fullName.substring(last1 + 1);
            int last2 = o.getFullName().lastIndexOf(" ");
            String name2 = o.getFullName().substring(last2 + 1);
            return name1.compareTo(name2);
        } else if(index == 2) {
            if(avGradeI > o.getAvGradeI()) {
                return 1;
            }
        } else if(index == 3) {
            if(avGradeI < o.getAvGradeI()) {
                return 1;
            }
        } else if(index == 4) {
            if(avGradeII > o.getAvGradeII()) {
                return 1;
            }
        } else if(index == 5) {
            if(avGradeII < o.getAvGradeII()) {
                return 1;
            }
        } else if(index == 6) {
            if(avGrade > o.getAvGrade()) {
                return 1;
            }
        } else if(index == 7) {
            if(avGrade < o.getAvGrade()) {
                return 1;
            }
        }
        return -1;
    }
}

