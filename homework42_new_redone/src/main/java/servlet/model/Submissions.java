package servlet.model;

public class Submissions {
    private Integer submissionID;
    private String submissionLogin;
    private String submissionPassword;
    private String gender;

    public Submissions(){}

    public Submissions(Integer submissionID, String submissionLogin, String submissionPassword, String gender) {
        this.submissionID = submissionID;
        this.submissionLogin = submissionLogin;
        this.submissionPassword = submissionPassword;
        this.gender = gender;
    }

    public Integer getSubmissionID() {
        return submissionID;
    }

    public void setSubmissionID(Integer submissionID) {
        this.submissionID = submissionID;
    }

    public String getSubmissionLogin() {
        return submissionLogin;
    }

    public void setSubmissionLogin(String submissionLogin) {
        this.submissionLogin = submissionLogin;
    }

    public String getSubmissionPassword() {
        return submissionPassword;
    }

    public void setSubmissionPassword(String submissionPassword) {
        this.submissionPassword = submissionPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
