package entities;

public class Student {

    // Atributes
    public String name;
    public double notaA;
    public double notaB;
    public double notaC;

    // Methods

    // função para retornar as somas das notas
    public double sumOfNotes(){
        return this.notaA + this.notaB + this.notaC;
    }

    // verificar se a soma das notas é menor ou igual a 100
    public boolean checkSumNotes(){
        return sumOfNotes() < 100;
    }

    // verificar se o aluno passou ou não
    public boolean studentNotes(){
        return sumOfNotes() > 60;
    }

    // elaborar um output
    @Override
    public String toString(){
        if(this.checkSumNotes()){
            if(this.studentNotes()){
                return "FINAL GRADE = "
                        + String.format("%.2f\n", this.sumOfNotes())
                        + "Pass";
            } else {
                return "FINAL GRADE = "
                        + String.format("%.2f\n", this.sumOfNotes())
                        + "FAILED\n"
                        + "MISSING "
                        + String.format("%.2f ", Math.abs(sumOfNotes() - 60))
                        + "POINTS";
            }
        }
        return "Invalid notes";


    }

}
