package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {

    private int enesimoTermo;
    private int soma;

    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public ExercicioDificilResponse() {
    }

    public void calc(int numero){

        if (numero > 0){
            int a = 0;
            int b = 1;
            int c = 0;
            int st = a + b;

            if (numero ==1){
                enesimoTermo = 1;
                soma = 1;
            }

            if (numero == 0){
                enesimoTermo =0;
                soma = 0;
            }

            for (int i = 2; i <= numero; i++) {
                c = a + b;
                st += c;
                a = b;
                b=c;
            }

            enesimoTermo = b;
            soma = st;

        }

    }

}
