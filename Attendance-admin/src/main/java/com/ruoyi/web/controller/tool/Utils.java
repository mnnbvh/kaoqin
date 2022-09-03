package com.ruoyi.web.controller.tool;

public class Utils {
    public static void main(String[] args){
        int sn = 46870;
        int functionSn = 8110;
        String transData = trans(decimalToHex(sn));
        System.out.println(makeChecksum("16B78D1001"));
//        System.out.println("十进制数 " + sn +"的十六进制数为: 7E" + transData +functionSn+makeChecksum(functionSn+transData.replace("7E",""))+"0D");
    }

    private static String trans(String decimalToHex) {
        if(decimalToHex.length()==4){
            return decimalToHex.substring(2,4)+decimalToHex.substring(0,2);
        }else{
            return "";
        }
    }

    public static String decimalToHex(int decimal) {
        String hex = "";
        while(decimal != 0) {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }
        return  hex;
    }
    //将0~15的十进制数转换成0~F的十六进制数
    public static char toHexChar(int hexValue) {
        if(hexValue <= 9 && hexValue >= 0)
            return (char)(hexValue + '0');
        else
            return (char)(hexValue - 10 + 'A');
    }

    public static String makeChecksum(String hexdata) {
        if (hexdata == null || hexdata.equals("")) {
            return "00";
        }
        hexdata = hexdata.replaceAll(" ", "");
        int total = 0;
        int len = hexdata.length();
        if (len % 2 != 0) {
            return "00";
        }
        int num = 0;
        while (num < len) {
            String s = hexdata.substring(num, num + 2);
            total += Integer.parseInt(s, 16);
            num = num + 2;
        }
        String retrunStr = Integer.toHexString(total);
        if(retrunStr.length()<4){
            for(int i =0 ;i<4-retrunStr.length();i++){
                retrunStr = "0"+retrunStr;
            }
        }
        return trans(retrunStr);
    }

}
