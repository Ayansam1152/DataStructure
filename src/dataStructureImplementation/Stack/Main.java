package dataStructureImplementation.Stack;

public class Main {
    public static void main(String[] ayn){
        StackUsingLinkedList stk = new StackUsingLinkedList();
        System.out.println(stk.isEmptyList());
        stk.pushList(3);
        System.out.println(stk.peekList());
        stk.pushList(5);
        stk.pushList(54);
        System.out.println(stk.peekList());
        System.out.println(stk.popList());
        System.out.println(stk.peekList());

        stk.pushList(53);
        stk.pushList(57);
        System.out.println(stk.popList());
        System.out.println(stk.peekList());

        System.out.println(stk.isEmptyList());
    }


}
