package Compiler.PAR;
import Compiler.LEX.Lexer;
import Compiler.LEX.Token;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private Token currToken = null;
    public static String POutput = "";
    static int j = -1;//

    public static List<List<Token>> lexerList = new ArrayList<>();

    public static List<Token> tokenList = new ArrayList<>();

    boolean isOpr = false;

    private Node parse(List<Token> tList) {
        Node node = new Node();
        tokenList = tList;

        if (j < tokenList.size() - 1 && tokenList.get(++j).getSymIndex() != -1) {
            currToken = tokenList.get(j);
            node = exp();
        }
        if (currToken == null) {
            throw new RuntimeException("syntax error at " + currToken.toString());
        }
        return node;
    }

    private Node factor() {
        Node node = new Node();

        if (j < tokenList.size() - 1 && (currToken.getSymIndex() == 0 || currToken.getSymIndex() == 1)) {
            node.setNtIndex(NodeType.FACTOR.ordinal());
            node.setToken(currToken);
            currToken = tokenList.get(++j);
        } else if (j == tokenList.size() - 1 && (currToken.getSymIndex() == 0|| currToken.getSymIndex() == 1)) {
            node.setNtIndex(NodeType.FACTOR.ordinal());
            node.setToken(currToken);
        } else if (j < tokenList.size() - 1 && currToken.getSymIndex() == 6) {
            currToken = tokenList.get(++j);
            node = exp();
            if (j < tokenList.size() - 1 && currToken.getSymIndex() == 7) {
                currToken = tokenList.get(++j);
            } else if (j == tokenList.size() - 1 && currToken.getSymIndex() == 7) {
            } else {
                POutput = POutput + "Error : the delimeter is not matched.\n";
                currToken = tokenList.get(++j);
            }
        }

        return node;
    }

    private Node term() {
        Node lnode = new Node();
        Node rnode;
        Node node = factor();

        while (((currToken.getSymIndex() == 4) || (currToken.getSymIndex() == 5)) && j < tokenList.size() - 1) {
            lnode.childNode1 = node.childNode1;
            lnode.childNode2 = node.childNode2;
            lnode.ntIndex = node.ntIndex;
            lnode.token = node.token;

            node.setChildNode1(lnode);

            lnode = new Node();

            node.setNtIndex(NodeType.TERM.ordinal());
            node.setToken(currToken);
            currToken = tokenList.get(++j);

            rnode = term();
            node.setChildNode2(rnode);
        }
        return node;
    }

    private Node exp() {
        Node lnode = new Node();
        Node rnode;
        Node node;

        if (((currToken.getSymIndex() == 2) || (currToken.getSymIndex() == 3)) && j < tokenList.size() - 1){
            Token token = new Token(0,"0");
            node = new Node(token,2);
        }
        else{
            node = term();
        }

        while (((currToken.getSymIndex() == 2) || (currToken.getSymIndex() == 3)) && j < tokenList.size() - 1) {

            if(isOpr){
               // isErr = true;
                POutput += "Syntac error: 符号重叠"+"\n";
                node = new Node(null,NodeType.ERROR.ordinal());
                break;
            }
            else{

                lnode.childNode1 = node.childNode1;
                lnode.childNode2 = node.childNode2;
                lnode.ntIndex = node.ntIndex;
                lnode.token = node.token;

                node.setChildNode1(lnode);

                lnode = new Node();

                node.setNtIndex(NodeType.EXP.ordinal());
                node.setToken(currToken);
                currToken = tokenList.get(++j);

                rnode = term();
                node.setChildNode2(rnode);
            }

            isOpr = true;
        }
        return node;
    }

    public static void printTree(Node root) {
        printInOrder(root, 0, 4);
        POutput += "\n";
    }

    public static void printInOrder(Node node, int height,int len) {
        if (node == null) {
            return;
        }

        printInOrder(node.childNode1, height + 1,  len);
        String val = node.getToken().getToken();
        POutput += getSpace(height * len) + val + "\n";
        printInOrder(node.childNode2, height + 1,  len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }



    public static List<Node> PStart(BufferedReader br){
        Parser parser = new Parser();
        lexerList = Lexer.LStart(br);
        Node node;
        List<Node> nodeList = new ArrayList<>();

        POutput = "";

        int i = 0;
        POutput = POutput + "----语法分析----\n";

        for (List<Token> tlist: lexerList) {
            if (tlist.size() == 0){
                POutput =  POutput + "算数式为空" +  "\n";
                node = null;
                nodeList.add(node);
            }
            else {
                node = parser.parse(tlist);
                if(node.getNtIndex() == 3){
                    POutput =  POutput + "Syntax error" +  "\n";
                }
                else{
                    nodeList.add(node);
                    parser.printTree(node);
                    tlist.clear();
                    POutput = POutput + "";
                    j = -1;
                }
            }

        }
        lexerList.clear();
        return nodeList;
    }

}