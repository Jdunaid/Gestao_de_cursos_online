import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class QuizBean implements Serializable {
    private String q1Answer;
    private String q2Answer;
    private String q3Answer;
    private String q4Answer;
    private String q5Answer;
    private String q6Answer;
    private String q7Answer;
    private String resultMessage;
    
    public String getQ1Answer() {
        return q1Answer;
    }
    
    public void setQ1Answer(String q1Answer) {
        this.q1Answer = q1Answer;
    }
    
    public String getQ2Answer() {
        return q2Answer;
    }
    
    public void setQ2Answer(String q2Answer) {
        this.q2Answer = q2Answer;
    }
    
    public String getQ3Answer() {
        return q3Answer;
    }
    
    public void setQ3Answer(String q3Answer) {
        this.q3Answer = q3Answer;
    }
    
    public String getQ4Answer() {
        return q4Answer;
    }
    
    public void setQ4Answer(String q4Answer) {
        this.q4Answer = q4Answer;
    }
    
    public String getQ5Answer() {
        return q5Answer;
    }
    
    public void setQ5Answer(String q5Answer) {
        this.q5Answer = q5Answer;
    }
    
    public String getQ6Answer() {
        return q6Answer;
    }
    
    public void setQ6Answer(String q6Answer) {
        this.q6Answer = q6Answer;
    }
    
    public String getQ7Answer() {
        return q7Answer;
    }
    
    public void setQ7Answer(String q7Answer) {
        this.q7Answer = q7Answer;
    }
    
    
    public String getResultMessage() {
        return resultMessage;
    }
    
    public void processAnswers() {
        // Lógica para determinar o resultado com base nas respostas
        
        if (q1Answer.equals("sim") && q2Answer.equals("exatas") && q3Answer.equals("programar") && q4Answer.equals("tecnologia") && q5Answer.equals("detalhes") && q6Answer.equals("reconhecimento") && q7Answer.equals("escolas")) {
            resultMessage = "Você pode considerar um curso de Engenharia de Software!";
        } else if (q1Answer.equals("nao") && q2Answer.equals("humanas") && q3Answer.equals("ensinar") && q4Answer.equals("anatomia") && q5Answer.equals("interacao") && q6Answer.equals("reconhecimento") && q7Answer.equals("escolas")) {
            resultMessage = "Você pode considerar um curso de Psicologia!";
        } else if (q1Answer.equals("sim") && q2Answer.equals("humanas") && q3Answer.equals("pesquisar") && q4Answer.equals("saude") && q5Answer.equals("exercicios") && q6Answer.equals("remuneracao") && q7Answer.equals("hospitais")) {
            resultMessage = "Você pode considerar um curso de Medicina!";
        } else if (q1Answer.equals("nao") && q2Answer.equals("exatas") && q3Answer.equals("programar") && q4Answer.equals("tecnologia") && q5Answer.equals("resolucao") && q6Answer.equals("avancos") && q7Answer.equals("agencias")) {
            resultMessage = "Você pode considerar um curso de Engenharia informatica!";
        } else if (q1Answer.equals("nao") && q2Answer.equals("exatas") && q3Answer.equals("analisar") && q4Answer.equals("financas") && q5Answer.equals("exercicios") && q6Answer.equals("remuneracao") && q7Answer.equals("escritorios")) {
            resultMessage = "Você pode considerar um curso de Gestao empresarial!";
        } else if (q1Answer.equals("sim") && q2Answer.equals("humanas") && q3Answer.equals("calcular") && q4Answer.equals("financas") && q5Answer.equals("detalhes") && q6Answer.equals("teste") && q7Answer.equals("escolas")) {
            resultMessage = "Você pode considerar um curso de Matematica!";
        } else {
            resultMessage = "Não foi possível determinar um curso com base nas suas respostas.";
        }
    }
}