package Final;

public class Grade {

    public static int next = 1001;
    private String idGrade;
    private double attendGrade;
    private double midtermScoreI;
    private double semesterEndGradeI;
    private double midtermScoreII;
    private double semesterEndGradeII;
    private double avGradeI;
    private double avGradeII;
    private double avGrade;

    private Study study;

    public Grade(String idGrade, double attendGrade, double midtermScoreI,
                 double semesterEndGradeI, double midtermScoreII,
                 double semesterEndGradeII, double avGradeI, double avGradeII, double avGrade) {
        this.idGrade = idGrade;
        this.attendGrade = attendGrade;
        this.midtermScoreI = midtermScoreI;
        this.semesterEndGradeI = semesterEndGradeI;
        this.midtermScoreII = midtermScoreII;
        this.semesterEndGradeII = semesterEndGradeII;
        this.avGradeI = avGradeI;
        this.avGradeII = avGradeII;
        this.avGrade = avGrade;
    }

    public Grade() {

    }

    public Grade(String idGrade, double attendGrade, double midtermScoreI,
                 double semesterEndGradeI, double midtermScoreII,
                 double semesterEndGradeII, double avGrade) {
        this.idGrade = idGrade;
        this.attendGrade = attendGrade;
        this.midtermScoreI = midtermScoreI;
        this.semesterEndGradeI = semesterEndGradeI;
        this.midtermScoreII = midtermScoreII;
        this.semesterEndGradeII = semesterEndGradeII;
        this.avGrade = avGrade;
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

    public static void setNext(int next) {
        Grade.next = next;
    }

    public String getIdGrade() {
        return idGrade;
    }

    public void setIdGrade() {
        this.idGrade = "GRA" + next;
        next ++;
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

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }



    public double calculatorAvgradeI(double midtermScoreI, double semesterEndGradeII) {
        return  0.3 * midtermScoreI + 0.7 * semesterEndGradeII;
    }

    public double calculatorAvgradeII(double midtermScoreII, double semesterEndGradeII) {
        return  0.3 * midtermScoreII + 0.7 * semesterEndGradeII;
    }

    public double calculatorAvgrade(double avGradeI, double avGradeII) {
       return  (avGradeI + avGradeII * 2) / 3;
    }




    public void calculatorStudy(double avGrade) {
        Study result = null;
        if(avGrade >= 9) {
            this.study = result.A_PLUS;
        } else if(avGrade >= 8) {
            this.study = result.A;
        } else if(avGrade >= 6.5) {
            this.study = result.B;
        } else if(avGrade >= 5.0) {
            this.study = result.C;
        } else if(avGrade >= 4.0) {
            this.study = result.D;
        } else {
            this.study = result.F;
        }
    }
}
