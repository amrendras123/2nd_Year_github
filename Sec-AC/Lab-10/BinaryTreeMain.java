public class BinaryTreeMain {
    
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createTree();
        //10 true 20 true 30 false false false true 40 false true 60 false false
        bt.display();
        System.out.println(bt.max());
        System.out.println(bt.find(300));
    }
}
