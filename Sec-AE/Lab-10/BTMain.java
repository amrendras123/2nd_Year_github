public class BTMain {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createTree();
        // 10 true 20 false true 40 false false true 60 true 70 false false true 80 false false
        bt.display();
        System.out.println("Pre_Order");
        bt.preOrder();
        System.out.println("Post_order");
        bt.postOrder();
    }
}
