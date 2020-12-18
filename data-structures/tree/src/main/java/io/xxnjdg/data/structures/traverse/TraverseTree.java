package io.xxnjdg.data.structures.traverse;

public class TraverseTree {
    public static void main(String[] args) {
        HeroNode node1 = new HeroNode("edge", 1);
        HeroNode node2 = new HeroNode("edge beyond", 2);
        HeroNode node3 = new HeroNode("edge monster", 3);
        HeroNode node4 = new HeroNode("edge ultimate", 4);

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setRight(node4);

        HeroTree heroTree = new HeroTree();
        heroTree.setRoot(node1);
        System.out.println("-------------");
        heroTree.preOrder();

        System.out.println("-------------");
        heroTree.middleOrder();

        System.out.println("-------------");
        heroTree.postOrder();
    }
}


class HeroTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void preOrder(){
        if (this.root != null){
            this.root.preOrder();
        }
    }

    public void middleOrder(){
        if (this.root != null){
            this.root.middleOrder();
        }
    }

    public void postOrder(){
        if (this.root != null){
            this.root.postOrder();
        }
    }

}

class HeroNode{
    private final String name;
    private final int no;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public void preOrder(){
        System.out.println(this);
        if (this.left != null){
            this.left.preOrder();
        }
        if (this.right != null){
            this.right.preOrder();
        }
    }

    public void middleOrder(){
        if (this.left != null){
            this.left.middleOrder();
        }
        System.out.println(this);
        if (this.right != null){
            this.right.middleOrder();
        }
    }

    public void postOrder(){
        if (this.left != null){
            this.left.postOrder();
        }
        if (this.right != null){
            this.right.postOrder();
        }
        System.out.println(this);
    }



    public void setLeft(HeroNode left) {
        this.left = left;
    }


    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}