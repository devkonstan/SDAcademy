package sty13;

public class ReverseTable {

    public static void main(String[] args) {

        int[] inputTable = {1,2,3,4,5,6,7,8,9,10};
        int[] outputTable = new int[inputTable.length];
        for (int i = inputTable.length - 1; i >= 0; i--) {
            outputTable[i] = inputTable[inputTable.length - i - 1];
        }

        System.out.println("INPUT");
        printTable(inputTable);
        System.out.println("\nOUTPUT");
        printTable(outputTable);

    }

    public static void printTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);
            if(i < table.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
