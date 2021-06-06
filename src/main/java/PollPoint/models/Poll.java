package PollPoint.models;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Poll extends AbstractEntity {

    private String title;
    private String category;
    private String question;
    private String pollType;

    @OneToMany(mappedBy = "poll")
    private List<Answer> answers = new ArrayList<>();

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date endDate;
    private final int POINTS = 5;
    private boolean visibility;

    @ManyToOne
    private User user;

    public Poll() {}

    public Poll(String title, String category, String question, String pollType, Date startDate, Date endDate, boolean visibility) {
        super();
        this.title = title;
        this.category = category;
        this.question = question;
        this.pollType = pollType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.visibility = visibility;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPollType() {
        return pollType;
    }
    public void setPollType(String pollType) {
        this.pollType = pollType;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<Answer> answers) { this.answers = answers; }

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isVisibility() {
        return visibility;
    }
    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
}
