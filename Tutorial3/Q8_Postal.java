package Tutorial3;

import java.util.Arrays;

public class Q8_Postal {
    private String input;
    private String bars = "";
    private int zipCode;

    private final String[] barWeight = {"11000", "00011", "00101", "00110", "01001", "01010"
            , "01100", "10001", "10010", "10100"};

    public Q8_Postal(String input){
        try{
            this.input = input;
            zipToBar();
        }
        catch (NumberFormatException e){
            bars = input;
            barToZip(bars);
        }
    }

    public void zipToBar(){
        int total = 0;
        int checkDigit = 0;

        for(int j = 0; j < input.length(); j++){
            int singleDigits = Integer.parseInt(String.valueOf(input.charAt(j)));
            bars = bars.concat(barWeight[singleDigits]);
            total += singleDigits;
        }

        while(true){
            if (total % 10 == 0)
                break;
            else{
                checkDigit++;
                total += checkDigit;
            }
        }
        bars = bars.concat(barWeight[checkDigit]);
//        System.out.println("Bars in weights : " + bars);

        System.out.println("Bars : ");
        for(int i = 0; i < bars.length(); i++){
            if(String.valueOf(bars.charAt(i)).equals("1"))
                System.out.print("|");
            else
                System.out.print(":");
        }
    }

    public void barToZip(String bars){
        String[] tempBars = new String[6];
        String tempStore = "";
        int index = 0;

        for(int j = 0; j < bars.length(); j++){
            if (String.valueOf(bars.charAt(j)).equals("|"))
                tempStore = tempStore.concat("1");
            else
                tempStore = tempStore.concat("0");

//            System.out.println(tempStore + " Temp store");
            if (5 - j % 5 == 1){
                tempBars[index] = tempStore;
                tempStore = "";
                index++;
            }
        }
        System.out.println(Arrays.toString(tempBars));

        for (int i = 0; i < tempBars.length-1; i++){
            for(int j = 0; j < barWeight.length;j++){
                if (tempBars[i].equals(barWeight[j]))
                    System.out.print(j);
            }
        }

    }
}
