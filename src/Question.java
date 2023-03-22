public class Question {
    private String text;
    private Topic topic;
    private Answer[] answers;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Answer[] getAnswers() {
        return this.answers;
    }

    public void setAnswers(Answer[] answers) {
        int correctCounter = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i].getIsCorrect()) {
                correctCounter++;
            }
        }   
        if(answers.length == 4 && correctCounter == 1) {
            this.answers = answers;
        }
    }
}
