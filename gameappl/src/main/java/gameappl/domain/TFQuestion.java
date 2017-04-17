package gameappl.domain;

public class TFQuestion {
private String question;
private boolean answer;



public TFQuestion(String question, boolean answer) {
	super();
	this.question = question;
	this.answer = answer;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public boolean isAnswer() {
	return answer;
}
public void setAnswer(boolean answer) {
	this.answer = answer;
}

}
