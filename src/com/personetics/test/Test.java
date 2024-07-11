package com.personetics.test;
import java.util.*;

abstract class Node {
    abstract List<String> dependencies();
    private String val;
    public Node(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}

class Words extends Node {
    public Words(String val) {
        super(val);
    }

    @Override
    public List<String> dependencies() {
        List<String> dependencies = new ArrayList<>();
        for (char c : getVal().toCharArray()) {
            // only a-z letters, here i add all of them already in lowerCase.
            dependencies.add(String.valueOf(c).toLowerCase());
        }
        return new ArrayList<>(dependencies);
    }
}
class Numbers extends Node {
    public Numbers(int val) {
        super(String.valueOf(val));
    }
    @Override
    List<String> dependencies() {
        List<String> dependencies = new ArrayList<>();
        // one digit and two-digit numbers
        if(getVal().length() <= 2 && getVal().length() >=1) {
            for(char c : getVal().toCharArray() ) {
                dependencies.add(String.valueOf(c));
            }
        }
        return dependencies;
    }
}


class ChainValidator {
    public static boolean validadate(List<Node> nodes) {
        Set<String> setValues = new HashSet<>();
        for (Node node : nodes) {
            if (node.dependencies().size() == 1) {
                setValues.add(node.dependencies().get(0));
            }
        }
        for (Node node : nodes) {
            for (String val : node.dependencies()) {
                if (!setValues.contains(val)) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class Test {


    public static void main(String[] args) {
        List<Node> validWord1 = Arrays.asList(
                new Words("p"),
                new Words("aba"),
                new Words("a"),
                new Words("b"),
                new Words("perso"),
                new Words("o"),
                new Words("r"),
                new Words("e"),
                new Words("s")
        );

        List<Node> validNum = Arrays.asList(
                new Numbers(36),
                new Numbers(6),
                new Numbers(3)
        );

        List<Node> invalidNum = Arrays.asList(
                new Numbers(7),
                new Numbers(3),
                new Numbers(32),
                new Numbers(42)
        );

        System.out.println("Valid return of validWord1: " + ChainValidator.validadate(validWord1));
        System.out.println("Valid return of validNum: " + ChainValidator.validadate(validNum));
        System.out.println("Invalid return of invalidNum: " + ChainValidator.validadate(invalidNum));

    }


}
