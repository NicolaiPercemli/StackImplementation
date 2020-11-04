package com.company;

public class Main {

    public static void main(String[] args) {
	Stack mStack = new Stack(10);

	    mStack.addElement(79);
        mStack.addElement(59);
        mStack.addElement(35);
        mStack.addElement(24);

//        mStack.deleteElement();
//        mStack.deleteElement();

        System.out.println("Stack: ");

        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.println(value);
        }
        System.out.println("");
    }
}
