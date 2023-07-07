package entities;

public class Aluno {
    public String Name;
    public double N1;
    public double N2;
    public double N3;
    public String Situac;
    public double Faltante;
    public double TotalNot;

    public Aluno(String Name, double nota1, double nota2, double nota3){
        this.Name = Name;
        this.N1 = nota1;
        this.N2 = nota2;
        this.N3 = nota3;
        this.TotalNot = this.N1+this.N2+this.N3;
    }

    private void situacaoAluno(){
        if (TotalNot >= 60){
            this.Situac = "PASS";
        }
        else{
            this.Situac = "FAILED";
            this.Faltante = 60.0 - this.TotalNot;
        }
    }

    public String toString(){
        situacaoAluno();
        if (this.TotalNot >= 60.0){
            return "FINAL GRADE = " + this.TotalNot + "\r\n" + this.Situac;
        }
        else {
            return "FINAL GRADE = " + this.TotalNot + "\r\n" + this.Situac + "\r\nMissing: " + this.Faltante + "POINTS";
        }
    }

}
