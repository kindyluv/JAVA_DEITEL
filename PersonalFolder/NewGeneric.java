package PersonalLearning;

import java.util.LinkedList;

class GenStack<G>{
private LinkedList<G> list = new LinkedList<>();

public void push(G item){
    list.addFirst(item);
    System.out.println(list);
}
//public G pop(){
//    return list.poll();
//}
//public G peek(){
//    return list.peek();
//}
//public boolean hasItem(){
//    return !list.isEmpty();
//}
//public int size(){
//    return list.size();
//}
//
//    public static void main(String[] args) {
//        GenStack<String> liks = new GenStack<>();
//        System.out.println("pushing new items onto the stack.");
//        liks.push("phone");
//        liks.push("charger");
//        liks.push("water");
//        liks.push("laptop");
//        liks.push("bag");
//        liks.push("shoe");
//        System.out.println();
//        System.out.println(liks.pop());
//        System.out.println(liks.list);
//        System.out.println(liks.peek());
//        System.out.println(liks.list);
//        System.out.println(liks.hasItem());
//        System.out.println(liks.size());
//        System.out.println(liks.list);
//
//
//    }
}
