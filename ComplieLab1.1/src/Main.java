import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String rawTitle = "";
        String StartVn = "";
        String rawVn;
        List<String> rawProduction = new ArrayList<>();
        HashSet<String> Vn;
        HashSet<String> Vt = new HashSet<>();
        String patternStr;
        Pattern pattern;
        Matcher matcher;
        int type = -1;
        boolean isExtended = false; //1型文法不能扩充
        boolean notContextSensitive = true;

        // 获得输入并处理
        System.out.println("请输入形如G[S]的文法：");
        if (scanner.hasNextLine()) {
            rawTitle = scanner.nextLine();
            patternStr = "^G\\[([A-Z])]$";
            pattern = Pattern.compile(patternStr);
            matcher = pattern.matcher(rawTitle);

            if (!matcher.find()) {
                System.out.println("输入内容不符合G[S]的形式！");
                return;
            }
            StartVn = matcher.group(1);

        }

        System.out.println("请输入该文法的非终结符，以空格隔开：");
        if (scanner.hasNextLine()) {
            rawVn = scanner.nextLine();
            String[] tmp = rawVn.split(" ");
            Vn = new HashSet<>(Arrays.asList(tmp));
            if (Vn.size()<tmp.length){
                System.out.println("含有重复的非终结符！");
                return;
            }
            if (!Vn.contains(StartVn)){
                System.out.println("非终结符没有开始符号！");
                return;
            }
            for (String item:Vn){
                if (!Pattern.matches("^[A-Z]$",item)){
                    System.out.println("非终结符必须是大写字母！");
                    return;
                }
            }
        }
        else {
            System.out.println("非终结符不可为空！");
            return;
        }


        System.out.println("请输入该文法的产生式，多个产生式换行书写，用#代表ε，以换行加q结束输入，有多个候选式的产生式可以采用缩写：");

        String temp;
        while (scanner.hasNextLine()){
             temp = scanner.nextLine();
             if (temp.equals("q") ){
                 break;
             }
             rawProduction.add(temp);
        }


        // 处理输入，判断文法类型
        patternStr = "^(\\w+)::=(\\w+|#)(\\|\\w+)*|(\\w+)(\\|\\w+)*(\\|#)(\\|\\w+)*$";
        pattern = Pattern.compile(patternStr);

        for (String production : rawProduction) {
            matcher = pattern.matcher(production);
            if (!matcher.find()){
                System.out.println("输入内容不符合产生式规则！");
                return;
            }



            // 左部至少有一个终结符
            String patternStr5 = "[A-Z]";
            Pattern pattern5 = Pattern.compile(patternStr5);
            Matcher matcher4 = pattern5.matcher(matcher.group(1));
            if (!matcher4.find()){
                System.out.println("输入内容不符合产生式规则！");
                return;
            }



            int count = matcher.groupCount();
            patternStr = "^[A-Z]$";

            String patternStr2 = "[a-z0-9]";
            Pattern pattern2 = Pattern.compile(patternStr2);
            Matcher matcher1;

            String patternStr3 = "[A-Z]";
            Pattern pattern3 = Pattern.compile(patternStr3);
            Matcher matcher2;

            String patternStr4 = "#";
            Pattern pattern4 = Pattern.compile(patternStr4);
            Matcher matcher3;

            if (!Vn.contains(matcher.group(1))){
                System.out.println("产生式包含未知的非终结符！");
                return;
            }

            if (notContextSensitive && Pattern.matches(patternStr,matcher.group(1))){ // 2、3型文法
                notContextSensitive = true;

                patternStr = "\\|?[a-z0-9][A-Z]?|\\|?#|\\|[A-Z][a-z0-9]";

                for (int i = 2; i<= count; i++){
                    if (matcher.group(i) == null) {
                        continue;
                    }
                    for (char c : matcher.group(i).toCharArray()){
                        String s = String.valueOf(c);

                        matcher2 = pattern3.matcher(s);
                        if (matcher2.find() && !Vn.contains(s)){
                            System.out.println("产生式包含未知的非终结符！");
                            return;
                        }

                        matcher1 = pattern2.matcher(s);
                        if(matcher1.find()){
                            Vt.add(s);
                        }

                        matcher3 = pattern4.matcher(s);
                        if (matcher3.find()){
                            isExtended = true;
                        }
                    }

                    if (!Pattern.matches(patternStr,matcher.group(i))) {
                        type = 2;
                    }

                }
                if (type != 2) type = 3;


            } else { // 0、1型文法

                notContextSensitive = false;

                for (int i = 2; i<= count; i++){
                    if (matcher.group(i) == null) {
                        continue;
                    }
                    for (char c : matcher.group(i).toCharArray()){
                        String s = String.valueOf(c);

                        matcher2 = pattern3.matcher(s);
                        if (matcher2.find() && !Vn.contains(s)){
                            System.out.println("产生式包含未知的非终结符！");
                            return;
                        }

                        matcher1 = pattern2.matcher(s);
                        if(matcher1.find()){
                            Vt.add(s);
                        }

                        matcher3 = pattern4.matcher(s);
                        if (matcher3.find()){
                            type = 0;
                        }

                    }

                    if (type != 0 && matcher.group(1).length() > matcher.group(i).length()) {
                        type = 0;
                    }
                }
                if (type != 0) type = 1;

            }

        }

        //输出结果
        String VnStr = "";
        for (String item:Vn){
            VnStr += " " + item;
        }
        String VtStr = "";
        for (String item:Vt){
            VtStr += " " + item;
        }

        System.out.println("文法" + rawTitle + " = ({" + VnStr + "}, {" + VtStr + "}, P, " + StartVn + ")" );
        System.out.print("P: " + rawProduction.get(0) + "\n");
        for (int i=1; i< rawProduction.size(); i++){
            System.out.println("   " + rawProduction.get(i));
        }

        String description;
        switch (type) {
            case 3:
                description = "（正规文法）";
                break;
            case 2:
                description = "（上下文无关文法）";
                break;
            case 1:
                description = "（上下文有关文法）";
                break;
            default:
                description = "（短语结构文法）";
        }

        if (isExtended){
            System.out.println("该文法是扩充的Chomsky" + type + "型文法" + description);
        }
        else {
            System.out.println("该文法是Chomsky" + type + "型文法" + description);
        }



    }



}
