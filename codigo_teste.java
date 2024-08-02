package TreinamentoUnitarios._GitHub.main;

public class codigo_teste {
    public static void main(String[] args) {
        int A[] = {5,10,20,30,40};
        int B[] = new int[4];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                B[j] = A[i] * 2;
                System.out.println(B[j]);

                
            }
            
        }
        
    }
    
}


/*
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
 */
