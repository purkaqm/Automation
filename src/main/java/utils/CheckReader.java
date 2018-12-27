package utils;

public class CheckReader {

    static String stringOp(Tool tool, String s) {
        return tool.func(s);
    }

    public static void main(String[] args) throws Exception {

        String inStr = "Лямбда выражение повышает эффективность JAVA";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, inStr);

        System.out.println("Это строка с удаленными пробелами: " + outStr);
    }


}
