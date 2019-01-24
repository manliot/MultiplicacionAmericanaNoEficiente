package multiplicaion_americana;

import java.util.Scanner;

public class Multiplicaion_Americana {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int DigN1, DigN2, Num1, Num2, NumTemp, CifrasNum1[] = new int[10000], CifrasNum2[] = new int[10000];

        System.out.println("<<<<<<Bienvenido a la multiplicacion Americana de 2 numero>>>>>>" + "\n" + "\n"
                + ".......Digite Primer numero:......."
        );
        Num1 = leer.nextInt();
        System.out.println(".......Digite segundo numero:.......");
        Num2 = leer.nextInt();

        NumTemp = Num1;
        DigN1 = 0;
        while (NumTemp != 0) {
            CifrasNum1[DigN1] = NumTemp % 10;
            NumTemp = NumTemp / 10;
            DigN1++;
        }

        NumTemp = Num2;
        DigN2 = 0;
        while (NumTemp != 0) {
            CifrasNum2[DigN2] = NumTemp % 10;
            NumTemp = NumTemp / 10;
            DigN2++;
        }
        int Suma_Total = 0;
        System.out.println("\n" + "A continuacion se muestran los sumandos:");
        for (int i = 0; i < DigN2; i++) {
            int sumandoN_esimo = 0, Decena = 0;
            for (int j = 0; j < DigN1; j++) {
                int Unidad, Mult = CifrasNum1[j] * CifrasNum2[i];
                if (Decena > 0) {
                    Mult += Decena;
                    Decena = 0;
                }
                if (j != DigN1 - 1) {

                    Unidad = (Mult % 10);
                    if (Mult >= 10) {
                        Decena = Mult / 10;
                    }
                } else {
                    Unidad = Mult;
                }
                Unidad = Unidad * (int) Math.pow(10, j);
                sumandoN_esimo += Unidad;
            }
            System.out.println("| Sumando numero " + (i + 1) + ": " + sumandoN_esimo);
            sumandoN_esimo *= (int) Math.pow(10, i);
            Suma_Total += sumandoN_esimo;
        }
        System.out.println("El resultado final es: " + Suma_Total);
    }

}
